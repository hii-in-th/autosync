/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Transfer;

import AdbManager.AdbFileManager;
import AdbManager.RunAdb;
import FFC_Form.MainForm;
import FileManager.FileManager;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PeeT
 */
public class DecryptDatabaseUpToJhcis implements Runnable{

    Thread decryptThread;

    public RunAdb.OnAdbErrorListener adblistener = new RunAdb.OnAdbErrorListener() {

        @Override
        public void onFailedToCopy() {
            JOptionPane.showMessageDialog(MainForm.transForm, "กรุณา Turn off USB Storage บนเครื่อง Android");

        }

        @Override
        public void onRemoteObjectNotExist() {
            Object[] options = {"Retry",
            "Cancel"};
            JOptionPane optionPane = new JOptionPane();
            int value = optionPane.showOptionDialog(MainForm.transForm, "กรุณา Turn off USB Storage บนเครื่อง Android\n"
                    + "ก่อนกดปุ่ม Retry เพื่อลองใหม่อีกครั้ง",
                    "",JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,null,
                    options,JOptionPane.ERROR_MESSAGE);

            if (value == JOptionPane.YES_OPTION) {
                MainForm.transForm.decryptDatabase();
            } else if (value == JOptionPane.NO_OPTION) {
                MainForm.transForm.setVisible(false);
                Service.Service.mainform.setVisible(true);
                return;
            }
        }
    };

    public void run(){
        try {
            Service.Service.Service();
            Thread time = new Thread(countTime);
            time.start();
            MainForm.transForm.setEnabled(false);
            MainForm.transForm.setVisibleDecryptDialog(true);
            SecurityNew.SecurityManager securityManager = new SecurityNew.SecurityManager();
            File sdbFile = new File("./FFC/Db_tmp/mJHCIS.sdb");
            FileManager fileManager1 = new FileManager();
            fileManager1.deleteDir(sdbFile);
            File dbFile = new File("./FFC/Db_tmp/mJHCIS.db");
            fileManager1.deleteDir(dbFile);
            AdbFileManager adbManager = new AdbFileManager();
            adbManager.setPathFileBat("./FFC/adb/adbPull.bat");
            // General Android 2.x - 3.x
            adbManager.writeAdbBatFileCopyPull(Service.Service.serialDeviceConnect, 
                    "/sdcard/Android/data/th.in.ffc/databases/mJHCIS.sdb", "../Db_tmp/mJHCIS.sdb");
            // Nexus 7 Only Android 4.x
            //adbManager.writeAdbBatFileCopyPull(Service.Service.serialDeviceConnect, 
            //    "/storage/sdcard0/Android/data/th.in.ffc/databases/mJHCIS.sdb", "../Db_tmp/mJHCIS.sdb");
            
            RunAdb runAdb = new RunAdb("./FFC/adb/adbPull.bat");
            runAdb.setOnAdbErrorListener(this.adblistener);
            if (!runAdb.runAdb()) {
                time.stop();
                MainForm.transForm.setTextDecryptTimeLabel("0");
                MainForm.transForm.setEnabled(true);
                MainForm.transForm.setVisibleDecryptDialog(false);
                return;
            }
            if (sdbFile.exists()) {
                securityManager.decryptDatabaseFile();
            } else {
                JOptionPane.showMessageDialog(MainForm.connForm, "ไม่สามารถถอดรหัสไฟล์ฐานข้อมูล mJHCIS.sdb");
                MainForm.transForm.setEnabled(true);
                MainForm.transForm.setVisibleDecryptDialog(false);
                return;
            }
            if (dbFile.exists()) {
                try {
                    MainForm.transForm.getVillageUpToJhcis();
                    MainForm.transForm.setUpdateCount();
                } catch (Exception ex) {
                    Logger.getLogger(DecryptDatabaseUpToJhcis.class.getName()).log(Level.SEVERE, null, ex);
                    MainForm.transForm.setVisibleDecryptDialog(false);
                    MainForm.transForm.setEnabled(true);
                    JOptionPane.showMessageDialog(MainForm.transForm, "Error : " + '"' + ex.getMessage() + '"');
                    return;
                }
            }
            time.stop();
            MainForm.transForm.setEnabled(true);
            MainForm.transForm.setVisibleDecryptDialog(false);
            MainForm.transForm.setEnableUpToJhcisButton(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DecryptDatabaseUpToJhcis.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(MainForm.transForm, "Error : " + '"' + ex.getMessage() + '"');
                    return;
        } catch (SQLException ex) {
            Logger.getLogger(DecryptDatabaseUpToJhcis.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(MainForm.transForm, "Error : " + '"' + ex.getMessage() + '"');
                    return;
        }
    }

    Runnable countTime = new Runnable() {
        int count = 1;
        @Override
        public void run(){
            while(decryptThread.isAlive()){
                try {
                    Thread.sleep(1000);
                    MainForm.transForm.setTextDecryptTimeLabel(String.valueOf(count));
                    count++;
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(DecryptDatabaseUpToJhcis.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };

    public void getDecryptThread(Thread decryptThread){
        this.decryptThread = decryptThread;
    }

}
