/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FFCAgreement.java
 *
 * Created on 1 ก.พ. 2554, 14:32:52
 */

package FFC_Form;


import AdbManager.RunAdb;
import ConnectDatabase.ConnectSQL;
import FileManager.FileManager;
import FileManager.FileSettingDataBaseFFCManager;
import FileManager.FileUser;
import auto_sync_v2.Main;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author Administrator
 */
public class FFCAgreement extends javax.swing.JFrame {

    /** Creates new form FFCAgreement */
    public FFCAgreement() {
        initComponents();
        this.setbackground(this.jLayeredPane1, ".\\src\\Image\\Agreement_bg.png");
        this.setLocationRelativeTo(null);
    //    dateOut = new Date(111, 9, 31);
    }
        
    public boolean  regisredUser(){
        FileManager fileManager = new FileManager();
        System.out.println(fileManager.isFile("./FFC/Register_user.ffc"));
        if(fileManager.isFile("./FFC/Register_user.ffc")){
            FileUser fileUser = new FileUser();
            fileUser.setPathFile("./FFC/Register_user.ffc");
            if(fileUser.readDriverDataBase()==null){
                System.out.println("No Register");
                return false;
            }
            System.out.println("Register");
            return true;
        }
        System.exit(0);
        return false;
    }
    private void showMainMenu(){
        FileSettingDataBaseFFCManager fileSettingDataBaseFFCManager = new FileSettingDataBaseFFCManager();
            fileSettingDataBaseFFCManager.setPathFile("./FFC/config_mysql_local.ffc");
            Service.Service.driverDatabase =  fileSettingDataBaseFFCManager.readDriverDataBase();
            //Service.Service.connectionSQL = new ConnectSQL();
            Service.Service.loginform = new LogInForm();
            
            Service.Service.loginform.setVisible(true);
       /* try {
            Service.Service.loginform = new LogInForm();
            Service.Service.loginform.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
                new ConfigServerForm().setVisible(true);
        }*/
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jDialogLicense = new javax.swing.JDialog();
        jLayeredPaneDialogWellcome = new javax.swing.JLayeredPane();
        jPanelDilogWellcome = new javax.swing.JPanel();
        jLabelHeadDialogWellcome = new javax.swing.JLabel();
        jButtonOKWellcomeDialog = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        jScrollPane2.setViewportView(jEditorPane1);

        jDialogLicense.setAlwaysOnTop(true);
        jDialogLicense.setModal(true);
        jDialogLicense.setResizable(false);
        jDialogLicense.setUndecorated(true);

        jPanelDilogWellcome.setOpaque(false);

        jLabelHeadDialogWellcome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelHeadDialogWellcome.setForeground(new java.awt.Color(255, 0, 0));
        jLabelHeadDialogWellcome.setText("ขออภัยอย่างสูง หมดอายุการทดสอบใช้งาน");

        jButtonOKWellcomeDialog.setOpaque(false);
        jButtonOKWellcomeDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKWellcomeDialogActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("โทรศัพท์ : 0-2564-6900 ต่อ 2513, 2529");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("email : watcharakon.noothong@nectec.or.th");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("กรุณาติดต่อทีมพัฒนาโปรแกรม FFC AutoSync+");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("วันที่ 12 ตุลาคม 2556");

        javax.swing.GroupLayout jPanelDilogWellcomeLayout = new javax.swing.GroupLayout(jPanelDilogWellcome);
        jPanelDilogWellcome.setLayout(jPanelDilogWellcomeLayout);
        jPanelDilogWellcomeLayout.setHorizontalGroup(
            jPanelDilogWellcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDilogWellcomeLayout.createSequentialGroup()
                .addGroup(jPanelDilogWellcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDilogWellcomeLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2))
                    .addGroup(jPanelDilogWellcomeLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanelDilogWellcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addGroup(jPanelDilogWellcomeLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButtonOKWellcomeDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDilogWellcomeLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabelHeadDialogWellcome)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDilogWellcomeLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(70, 70, 70))
        );
        jPanelDilogWellcomeLayout.setVerticalGroup(
            jPanelDilogWellcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDilogWellcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHeadDialogWellcome)
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOKWellcomeDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelDilogWellcome.setBounds(0, 0, 380, 180);
        jLayeredPaneDialogWellcome.add(jPanelDilogWellcome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDialogLicenseLayout = new javax.swing.GroupLayout(jDialogLicense.getContentPane());
        jDialogLicense.getContentPane().setLayout(jDialogLicenseLayout);
        jDialogLicenseLayout.setHorizontalGroup(
            jDialogLicenseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPaneDialogWellcome, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialogLicenseLayout.setVerticalGroup(
            jDialogLicenseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPaneDialogWellcome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FFC Agreement");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        jLayeredPane1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Image/Agreement_bg.png")))); // NOI18N

        jButton1.setText("OK");
        jButton1.setOpaque(false);
        jButton1.setPreferredSize(new java.awt.Dimension(65, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(40, 470, 79, 23);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Cancel");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(340, 470, 78, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Software License Agreement");
        jLabel1.setBounds(130, 10, 198, 17);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 0, 153));
        jTextPane1.setText("      ข้อกำหนดและเงื่อนไขการใช้งานโปรแกรม FFC Autosync Plus\n                           Version 2.1.2013.07.07\n\n     ต่อไปนี้คำว่า \"โปรแกรม FFC Autosync+\" หมายถึง โปรแกรมสำหรับ\nใช้งานในการเชื่อมต่อระหว่างฐานข้อมูลในโปรแกรม FFC Android กับ\nฐานข้อมูลคอมพิวเตอร์ของโปรแกรมระบบงานสถานีอนามัยและศูนย์\nสุขภาพ JHCIS : Java Health Center Information System ของกระทรวง\nสาธารณสุข โดยเจ้าของลิขสิทธิโปรแกรม FFC Android และโปรแกรม\nFFC Autosync+ คือ ศูนย์เทคโนโลยีอิเล็กทรอนิกส์และคอมพิวเตอร์\nแห่งชาติ หรือ เนคเทค โดยมีวัตถุประสงค์  เพือความสะดวกให้เจ้าหน้าที่ใน\nการนำข้อมูลจากคอมพิวเตอร์ไปใช้งานบนอุปกรณ์แอนดรอย์แท็บเล็ต\nแทนระบบแฟ้มอนามัยครอบครัว (Family Folder) แบบกระดาษเพื่อช่วย\nลดเวลาการกรอกข้อมูลซ้ำซ้อน และเพิ่มประสิทธิภาพในการบริการเชิงรุก\nคำว่า \"ผู้ใช้\" หมายถึงบุคคลผู้ได้รับอนุญาตให้ใช้สิทธิตามสัญญา\n      เนื่องจากโปรแกรมนี้เป็นรุ่นทดลองใช้งาน (Demo version) ร่วมกับโปร\nแกรม JHCIS รุ่นล่าสุด ดังนันผู้ใช้ต้องทำการปรับปรุงรุ่นของโปรแกรม JHCIS \nให้ตรงกับรุ่นที่กำหนด มิฉะนั้นโปรแกรมอาจทำงานผิดพลาดได้ โดยโปรแกรมนี้ \nอนุญาตให้ผู้ใช้ใช้งานได้โดยไม่คิดมูลค่า เหตุนี้จึงไม่มีการรับประกันใดๆ ต่อโปรแกรม\n     ดังนั้นผู้ใช้จะต้องเป็นผู้รับความเสี่ยงต่อการใช้งาน ตลอดจนการบำรุงรักษา\nซ่อมแซม หรือแก้ไขเท่าที่จำเป็นทั้งหมด ถ้าผู้ใช้สงสัยหรืออยากเสนอแนะ\nติชม สามารถติดต่อมาที่ 0-2564-6900 ต่อ 2513, 2529 หรือทาง email\nwatcharakon.noothong@nectec.or.th ทีมผู้พัฒนาโปรแกรมหวังว่า\nจะช่วยให้เจ้าหน้าที่ด้านสาธารณสุขทำงานได้อย่างสะดวกมากยิ่งขึ้น\n\n                                        ทีมผู้พัฒนาโปรแกรม FFC Autosync Plus\n                                                                  07 กรกฎาคม 2556\n"); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        jScrollPane1.setBounds(30, 40, 396, 410);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        RunAdb runAdb = new RunAdb("./FFC/adb/adbKillServer.bat");
        runAdb.runAdb();
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:                
        if(regisredUser()){
            this.setVisible(false);
            this.dispose();
            showMainMenu();
        }else{
            this.setVisible(false);
            this.dispose();
            //new FFCRegisterUser().setVisible(true);
           showMainMenu();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    //การกำหนดให้โปรแกรมทำงานหรือไม่ กรณีหมดอายุการใช้งาน Date_expire
    private void jButtonOKWellcomeDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKWellcomeDialogActionPerformed
                
        // if you needs this program close when date expired
        // Please uncheck comment System.exit(0)
        // โปรแกรมจะปิดตัวเองทันที ไม่สามารถเรียกใช้งานได้
         System.exit(0);
        
        // if you want to don't close when date expired
        // Please uncheck comment all line belows.
        // โปรแกรม เพียงแค่แจ้งเตือน เท่านั้น แต่สามารถใช้งานได้ปกติ
          jDialogLicense.show(false);
          this.setEnabled(true);
          this.repaint();
    }//GEN-LAST:event_jButtonOKWellcomeDialogActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FFCAgreement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonOKWellcomeDialog;
    private javax.swing.JDialog jDialogLicense;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelHeadDialogWellcome;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPaneDialogWellcome;
    private javax.swing.JPanel jPanelDilogWellcome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    
   
    public void checkDateOut(){
        Date date = new Date(); // วันปัจจุบัน ปี AD. เสมอ
        Date dateOut = new Date(113, 10, 12); // วันหมดอายุ (ปี(AD)+1900,เดือน 0 - 11, วัน 1 -31);
        System.out.println("now date : "+date);   
        System.out.println("dateExpire : "+dateOut);       
        /*this.setVisible(true);
        this.setEnabled(false);       
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(FFCAgreement.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setEnabled(true); */
        if(!regisredUser()){
            if(date.after(dateOut)){
                    jDialogLicense.setSize(380, 180);
                    jDialogLicense.setLocation(this.getX()
                        +((this.getWidth()/2)-(jDialogLicense.getWidth()/2))
                        ,this.getY()
                        +((this.getHeight()/2)-(jDialogLicense.getHeight()/2)));
                        this.setEnabled(false);
                        jDialogLicense.show(true);
            }
            else{
                Main.openRegisterUserform();
            }        }else{
            this.setVisible(true);
            
        }
    }

    private void setbackground(JComponent component, String imagePath){
        ImageIcon image = new ImageIcon(imagePath);
        JLabel label = new JLabel(image);
        component.add(label, new Integer(Integer.MIN_VALUE));
        label.setBounds(0, 0, image.getIconWidth(), image.getIconHeight());
    }

}
