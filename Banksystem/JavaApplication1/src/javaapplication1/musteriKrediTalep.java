/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Pelin
 */
public class musteriKrediTalep extends javax.swing.JFrame {
    int musteri_id;
    /**
     * Creates new form musteriKrediTalebi
     */
    public musteriKrediTalep() {
        initComponents();
    }
    public musteriKrediTalep(int musteri_id) {
        initComponents();
        this.musteri_id=musteri_id;
        boolean var=false;
        try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select *from hesaplar where  MusteriId=? and HesapOnay=1");
                    st.setString(1, String.valueOf(musteri_id));
                    ResultSet rs = st.executeQuery();
                    while (rs.next()) {
                        String hesapad=rs.getString("HesapAd");
                        int hesapturid = rs.getInt("HesapTurId");
                        int hesapid=rs.getInt("HesapId");
                        System.out.println(hesapturid);
                         PreparedStatement st2 = (PreparedStatement) connection
                        .prepareStatement("Select *from hesap_turu where  HesapTurId=? ");
                    st2.setInt(1, hesapturid);
                    ResultSet rs2 = st2.executeQuery();
                        if(rs2.next()){
                            String hesaptur=rs2.getString("HesapTuru");
                            
                            if(hesaptur.equals("TL")){
                               PreparedStatement st3 = (PreparedStatement) connection
                        .prepareStatement("Select KrediId from kredi_talep where  HesapId=? ");
                    st3.setInt(1, hesapid); 
                    
                          ResultSet rs3 = st3.executeQuery();
                        while(rs3.next()){
                        if(rs3.getInt("KrediId")!=0){
                            var=true;
                        }
                    
                        }
                        if(var!=true){
                             hesap.addItem(hesapad);
                        }
                    
                               
                            }
                        }
                       
                        
                        
                    } 
                  connection.close();
                 
                } catch (Exception exception) {
                    exception.printStackTrace();
                } 
		
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borcpanel = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        iptal = new javax.swing.JToggleButton();
        label2 = new java.awt.Label();
        tamam = new javax.swing.JToggleButton();
        label3 = new java.awt.Label();
        vade = new javax.swing.JTextField();
        kreditutar = new javax.swing.JTextField();
        hesap = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(423, 130));
        setUndecorated(true);

        borcpanel.setPreferredSize(new java.awt.Dimension(640, 380));

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setText("Hesap :");

        iptal.setBackground(new java.awt.Color(51, 0, 0));
        iptal.setForeground(new java.awt.Color(204, 204, 204));
        iptal.setText("VAZGEÇ");
        iptal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iptal(evt);
            }
        });

        label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label2.setText("Kredi Tutar :");

        tamam.setBackground(new java.awt.Color(0, 0, 51));
        tamam.setForeground(new java.awt.Color(204, 204, 204));
        tamam.setText("TAMAM");
        tamam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tamamMouseClicked(evt);
            }
        });

        label3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label3.setText("Vade Sayısı:");

        javax.swing.GroupLayout borcpanelLayout = new javax.swing.GroupLayout(borcpanel);
        borcpanel.setLayout(borcpanelLayout);
        borcpanelLayout.setHorizontalGroup(
            borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borcpanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(borcpanelLayout.createSequentialGroup()
                        .addComponent(iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tamam, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, borcpanelLayout.createSequentialGroup()
                        .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(borcpanelLayout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(borcpanelLayout.createSequentialGroup()
                                .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(263, 263, 263)
                                .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hesap, 0, 139, Short.MAX_VALUE)
                                    .addComponent(kreditutar))))
                        .addContainerGap(80, Short.MAX_VALUE))))
        );
        borcpanelLayout.setVerticalGroup(
            borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borcpanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hesap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borcpanelLayout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borcpanelLayout.createSequentialGroup()
                        .addComponent(kreditutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(borcpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(borcpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(borcpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iptal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iptal
        dispose();
        new MusteriSecenek(this.musteri_id).setVisible(true);
    }//GEN-LAST:event_iptal

    private void tamamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tamamMouseClicked
       
        
        try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasistemi", "root", "123");
                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select *from hesaplar where HesapAd=? and MusteriId=? ");
                    st.setString(1, String.valueOf(hesap.getSelectedItem()));
                    st.setString(2, String.valueOf(musteri_id));
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        int hesap_id = rs.getInt("HesapId");
                        String query = "INSERT INTO kredi_talep (Tutar,Vade,HesapId) values('" +kreditutar.getText()+"','" +vade.getText()+"','"+hesap_id+"')";
                        Statement sta = connection.createStatement();
                        int x = sta.executeUpdate(query);
                       
                        connection.close();
                        JOptionPane.showMessageDialog(null, "Talep Edildi");
                        
                    } 
                  dispose();
                  new musteriKrediTalep(this.musteri_id).setVisible(true);
                 
                } catch (Exception exception) {
                    exception.printStackTrace();
                } 
    }//GEN-LAST:event_tamamMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(musteriKrediTalep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musteriKrediTalep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musteriKrediTalep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musteriKrediTalep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musteriKrediTalep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel borcpanel;
    private javax.swing.JComboBox<String> hesap;
    private javax.swing.JToggleButton iptal;
    private javax.swing.JTextField kreditutar;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JToggleButton tamam;
    private javax.swing.JTextField vade;
    // End of variables declaration//GEN-END:variables
}