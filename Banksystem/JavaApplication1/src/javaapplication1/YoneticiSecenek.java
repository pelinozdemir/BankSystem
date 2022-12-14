/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Font;
import javaapplication1.yonetici.BankaGenelDurum;
import javaapplication1.yonetici.BankaTumIslemler;
import javaapplication1.yonetici.Deadlock;
import javaapplication1.yonetici.FaizBelirle;
import javaapplication1.yonetici.KurEkle;
import javaapplication1.yonetici.KurGuncelle;
import javaapplication1.yonetici.MaasGuncelle;
import javaapplication1.yonetici.MusteriEkle;

/**
 *
 * @author Pelin
 */
public class YoneticiSecenek extends javax.swing.JFrame {
Color custom=new Color(204,204,204);
 Color fontcolor=new Color(51,51,51);
 Color changefont=Color.DARK_GRAY;
 Color changeback=Color.LIGHT_GRAY;
 Color exitcolor=new Color(255,153,0);
 Font newfont=new Font("Segoe UI ", Font.BOLD, 19);
 Font oldfont=new Font("Segoe UI ", Font.PLAIN, 18);
    /**
     * Creates new form Yonetici
     */
    public YoneticiSecenek() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel7 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        panel6 = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        panel5 = new java.awt.Panel();
        jLabel5 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        panel8 = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tumIslem = new java.awt.Panel();
        jLabel17 = new javax.swing.JLabel();
        sistemIlerlet = new java.awt.Panel();
        jLabel18 = new javax.swing.JLabel();
        musteriEkle = new java.awt.Panel();
        jLabel19 = new javax.swing.JLabel();
        krediVeGecikme = new java.awt.Panel();
        jLabel20 = new javax.swing.JLabel();
        paraVeKur = new java.awt.Panel();
        jLabel21 = new javax.swing.JLabel();
        bankaGenel = new java.awt.Panel();
        jLabel22 = new javax.swing.JLabel();
        maasUcret = new java.awt.Panel();
        jLabel23 = new javax.swing.JLabel();
        deadlockAnaliz = new java.awt.Panel();
        jLabel24 = new javax.swing.JLabel();
        kurGuncel = new javax.swing.JPanel();
        KurGuncelle = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel7.setText("7. Bankada Ger??ekle??en T??m ????lemleri G??r??nt??le");

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(490, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(15, 15, 15))
        );

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel6.setText("6. Sistemi Bir Ay ??lerlet");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(643, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(16, 16, 16))
        );

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel5.setText("5. M????teri Ekle");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(689, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(16, 16, 16))
        );

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel4.setText("4. Kredi ve Gecikme Faiz Oran??n?? Belirle");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(16, 16, 16))
        );

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel2.setText("2. Yeni Para Birimi Ekle ve Kur De??erini G??ncelle");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel1.setText("1. Banka Genel Durum");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel3.setText("3. ??al????anlar??n Maa?? ??cretlerini Belirle");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(16, 16, 16))
        );

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel8.setText("8. Deadlock Analizi");

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(666, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(423, 130));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(905, 650));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(905, 650));

        tumIslem.setBackground(new java.awt.Color(204, 204, 204));
        tumIslem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tumIslemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tumIslemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tumIslemMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel17.setText("  Bankada Ger??ekle??en T??m ????lemleri G??r??nt??le");

        javax.swing.GroupLayout tumIslemLayout = new javax.swing.GroupLayout(tumIslem);
        tumIslem.setLayout(tumIslemLayout);
        tumIslemLayout.setHorizontalGroup(
            tumIslemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tumIslemLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tumIslemLayout.setVerticalGroup(
            tumIslemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tumIslemLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(15, 15, 15))
        );

        sistemIlerlet.setBackground(new java.awt.Color(204, 204, 204));
        sistemIlerlet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sistemIlerletMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sistemIlerletMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sistemIlerletMouseExited(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel18.setText("  Sistemi Bir Ay ??lerlet");

        javax.swing.GroupLayout sistemIlerletLayout = new javax.swing.GroupLayout(sistemIlerlet);
        sistemIlerlet.setLayout(sistemIlerletLayout);
        sistemIlerletLayout.setHorizontalGroup(
            sistemIlerletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sistemIlerletLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sistemIlerletLayout.setVerticalGroup(
            sistemIlerletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sistemIlerletLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(15, 15, 15))
        );

        musteriEkle.setBackground(new java.awt.Color(204, 204, 204));
        musteriEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteriEkleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                musteriEkleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                musteriEkleMouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel19.setText("  M????teri Ekle");
        jLabel19.setToolTipText("");

        javax.swing.GroupLayout musteriEkleLayout = new javax.swing.GroupLayout(musteriEkle);
        musteriEkle.setLayout(musteriEkleLayout);
        musteriEkleLayout.setHorizontalGroup(
            musteriEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteriEkleLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        musteriEkleLayout.setVerticalGroup(
            musteriEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, musteriEkleLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(16, 16, 16))
        );

        krediVeGecikme.setBackground(new java.awt.Color(204, 204, 204));
        krediVeGecikme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                krediVeGecikmeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krediVeGecikmeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                krediVeGecikmeMouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel20.setText("   Kredi ve Gecikme Faiz Oran??n?? Belirle");

        javax.swing.GroupLayout krediVeGecikmeLayout = new javax.swing.GroupLayout(krediVeGecikme);
        krediVeGecikme.setLayout(krediVeGecikmeLayout);
        krediVeGecikmeLayout.setHorizontalGroup(
            krediVeGecikmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(krediVeGecikmeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        krediVeGecikmeLayout.setVerticalGroup(
            krediVeGecikmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(krediVeGecikmeLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel20)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        paraVeKur.setBackground(new java.awt.Color(204, 204, 204));
        paraVeKur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paraVeKurMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraVeKurMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraVeKurMouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel21.setText("  Yeni Para Birimi Ekle ");

        javax.swing.GroupLayout paraVeKurLayout = new javax.swing.GroupLayout(paraVeKur);
        paraVeKur.setLayout(paraVeKurLayout);
        paraVeKurLayout.setHorizontalGroup(
            paraVeKurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraVeKurLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paraVeKurLayout.setVerticalGroup(
            paraVeKurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraVeKurLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel21)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bankaGenel.setBackground(new java.awt.Color(204, 204, 204));
        bankaGenel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bankaGenelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bankaGenelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bankaGenelMouseExited(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel22.setText("  Banka Genel Durum");

        javax.swing.GroupLayout bankaGenelLayout = new javax.swing.GroupLayout(bankaGenel);
        bankaGenel.setLayout(bankaGenelLayout);
        bankaGenelLayout.setHorizontalGroup(
            bankaGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bankaGenelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bankaGenelLayout.setVerticalGroup(
            bankaGenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bankaGenelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(17, 17, 17))
        );

        maasUcret.setBackground(new java.awt.Color(204, 204, 204));
        maasUcret.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maasUcretMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maasUcretMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maasUcretMouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel23.setText("  ??al????anlar??n Maa?? ??cretlerini Belirle");

        javax.swing.GroupLayout maasUcretLayout = new javax.swing.GroupLayout(maasUcret);
        maasUcret.setLayout(maasUcretLayout);
        maasUcretLayout.setHorizontalGroup(
            maasUcretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maasUcretLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        maasUcretLayout.setVerticalGroup(
            maasUcretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maasUcretLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        deadlockAnaliz.setBackground(new java.awt.Color(204, 204, 204));
        deadlockAnaliz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deadlockAnalizMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deadlockAnalizMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deadlockAnalizMouseExited(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        jLabel24.setText("  Deadlock Analizi");

        javax.swing.GroupLayout deadlockAnalizLayout = new javax.swing.GroupLayout(deadlockAnaliz);
        deadlockAnaliz.setLayout(deadlockAnalizLayout);
        deadlockAnalizLayout.setHorizontalGroup(
            deadlockAnalizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deadlockAnalizLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deadlockAnalizLayout.setVerticalGroup(
            deadlockAnalizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deadlockAnalizLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel24)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        kurGuncel.setBackground(new java.awt.Color(204, 204, 204));
        kurGuncel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kurGuncelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kurGuncelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kurGuncelMouseExited(evt);
            }
        });

        KurGuncelle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        KurGuncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/images/right-arrow.png"))); // NOI18N
        KurGuncelle.setText("   Kur G??ncelle");

        javax.swing.GroupLayout kurGuncelLayout = new javax.swing.GroupLayout(kurGuncel);
        kurGuncel.setLayout(kurGuncelLayout);
        kurGuncelLayout.setHorizontalGroup(
            kurGuncelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kurGuncelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(KurGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kurGuncelLayout.setVerticalGroup(
            kurGuncelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kurGuncelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KurGuncelle)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        exit.setBackground(new java.awt.Color(51, 51, 255));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 153, 0));
        exit.setText("X");
        exit.setToolTipText("");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(807, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bankaGenel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paraVeKur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maasUcret, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(krediVeGecikme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(musteriEkle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sistemIlerlet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tumIslem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deadlockAnaliz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kurGuncel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(exit)
                .addGap(38, 38, 38)
                .addComponent(bankaGenel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(paraVeKur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(maasUcret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(krediVeGecikme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(musteriEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sistemIlerlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tumIslem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(deadlockAnaliz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kurGuncel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 586, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tumIslemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tumIslemMouseClicked
        dispose();
        new BankaTumIslemler().setVisible(true);
    }//GEN-LAST:event_tumIslemMouseClicked

    private void sistemIlerletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sistemIlerletMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sistemIlerletMouseClicked

    private void musteriEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriEkleMouseClicked
       setVisible(false);
       new MusteriEkle().setVisible(true);
    }//GEN-LAST:event_musteriEkleMouseClicked

    private void krediVeGecikmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krediVeGecikmeMouseClicked
       setVisible(false);
       new FaizBelirle().setVisible(true);
    }//GEN-LAST:event_krediVeGecikmeMouseClicked

    private void paraVeKurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraVeKurMouseClicked
       setVisible(false);
        new KurEkle().setVisible(true);  
    }//GEN-LAST:event_paraVeKurMouseClicked

    private void bankaGenelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankaGenelMouseClicked
        dispose();
        new BankaGenelDurum().setVisible(true);
    }//GEN-LAST:event_bankaGenelMouseClicked

    private void maasUcretMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maasUcretMouseClicked
        setVisible(false);
        new MaasGuncelle().setVisible(true);
    }//GEN-LAST:event_maasUcretMouseClicked

    private void deadlockAnalizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deadlockAnalizMouseClicked
        setVisible(false);
        new Deadlock().setVisible(true);
    }//GEN-LAST:event_deadlockAnalizMouseClicked

    private void kurGuncelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kurGuncelMouseClicked
             setVisible(false);
             new KurGuncelle().setVisible(true);
    }//GEN-LAST:event_kurGuncelMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered

        this.exit.setForeground(Color.getHSBColor(54, 54, 54));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        this.exit.setForeground(exitcolor);
    }//GEN-LAST:event_exitMouseExited

    private void bankaGenelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankaGenelMouseEntered
          this.bankaGenel.setBackground(changeback);
        this.jLabel22.setForeground(changefont);
        this.jLabel22.setFont(newfont);
    }//GEN-LAST:event_bankaGenelMouseEntered

    private void bankaGenelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankaGenelMouseExited
          this.bankaGenel.setBackground(custom);
       this.jLabel22.setForeground(fontcolor);
       this.jLabel22.setFont(oldfont);
    }//GEN-LAST:event_bankaGenelMouseExited

    private void paraVeKurMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraVeKurMouseEntered
          this.paraVeKur.setBackground(changeback);
        this.jLabel21.setForeground(changefont);
        this.jLabel21.setFont(newfont);
    }//GEN-LAST:event_paraVeKurMouseEntered

    private void paraVeKurMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraVeKurMouseExited
          this.paraVeKur.setBackground(custom);
       this.jLabel21.setForeground(fontcolor);
       this.jLabel21.setFont(oldfont);
    }//GEN-LAST:event_paraVeKurMouseExited

    private void maasUcretMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maasUcretMouseEntered
          this.maasUcret.setBackground(changeback);
        this.jLabel23.setForeground(changefont);
        this.jLabel23.setFont(newfont);
    }//GEN-LAST:event_maasUcretMouseEntered

    private void maasUcretMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maasUcretMouseExited
         this.maasUcret.setBackground(custom);
       this.jLabel23.setForeground(fontcolor);
       this.jLabel23.setFont(oldfont);
    }//GEN-LAST:event_maasUcretMouseExited

    private void krediVeGecikmeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krediVeGecikmeMouseEntered
          this.krediVeGecikme.setBackground(changeback);
        this.jLabel20.setForeground(changefont);
        this.jLabel20.setFont(newfont);
    }//GEN-LAST:event_krediVeGecikmeMouseEntered

    private void krediVeGecikmeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krediVeGecikmeMouseExited
         this.krediVeGecikme.setBackground(custom);
       this.jLabel20.setForeground(fontcolor);
       this.jLabel20.setFont(oldfont);
    }//GEN-LAST:event_krediVeGecikmeMouseExited

    private void musteriEkleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriEkleMouseEntered
         this.musteriEkle.setBackground(changeback);
        this.jLabel19.setForeground(changefont);
        this.jLabel19.setFont(newfont);
    }//GEN-LAST:event_musteriEkleMouseEntered

    private void musteriEkleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteriEkleMouseExited
          this.musteriEkle.setBackground(custom);
       this.jLabel19.setForeground(fontcolor);
       this.jLabel19.setFont(oldfont);
    }//GEN-LAST:event_musteriEkleMouseExited

    private void sistemIlerletMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sistemIlerletMouseEntered
          this.sistemIlerlet.setBackground(changeback);
        this.jLabel18.setForeground(changefont);
        this.jLabel18.setFont(newfont);
    }//GEN-LAST:event_sistemIlerletMouseEntered

    private void sistemIlerletMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sistemIlerletMouseExited
         this.sistemIlerlet.setBackground(custom);
       this.jLabel18.setForeground(fontcolor);
       this.jLabel18.setFont(oldfont);
    }//GEN-LAST:event_sistemIlerletMouseExited

    private void tumIslemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tumIslemMouseEntered
          this.tumIslem.setBackground(changeback);
        this.jLabel17.setForeground(changefont);
        this.jLabel17.setFont(newfont);
    }//GEN-LAST:event_tumIslemMouseEntered

    private void tumIslemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tumIslemMouseExited
         this.tumIslem.setBackground(custom);
       this.jLabel17.setForeground(fontcolor);
       this.jLabel17.setFont(oldfont);
    }//GEN-LAST:event_tumIslemMouseExited

    private void deadlockAnalizMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deadlockAnalizMouseEntered
        this.deadlockAnaliz.setBackground(changeback);
        this.jLabel24.setForeground(changefont);
        this.jLabel24.setFont(newfont);
    }//GEN-LAST:event_deadlockAnalizMouseEntered

    private void deadlockAnalizMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deadlockAnalizMouseExited
          this.deadlockAnaliz.setBackground(custom);
       this.jLabel24.setForeground(fontcolor);
       this.jLabel24.setFont(oldfont);
    }//GEN-LAST:event_deadlockAnalizMouseExited

    private void kurGuncelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kurGuncelMouseEntered
         this.kurGuncel.setBackground(changeback);
        this.KurGuncelle.setForeground(changefont);
        this.KurGuncelle.setFont(newfont);
    }//GEN-LAST:event_kurGuncelMouseEntered

    private void kurGuncelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kurGuncelMouseExited
       this.kurGuncel.setBackground(custom);
       this.KurGuncelle.setForeground(fontcolor);
       this.KurGuncelle.setFont(oldfont);
    }//GEN-LAST:event_kurGuncelMouseExited

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
            java.util.logging.Logger.getLogger(YoneticiSecenek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YoneticiSecenek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YoneticiSecenek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YoneticiSecenek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YoneticiSecenek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KurGuncelle;
    private java.awt.Panel bankaGenel;
    private java.awt.Panel deadlockAnaliz;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private java.awt.Panel krediVeGecikme;
    private javax.swing.JPanel kurGuncel;
    private java.awt.Panel maasUcret;
    private java.awt.Panel musteriEkle;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    private java.awt.Panel panel8;
    private java.awt.Panel paraVeKur;
    private java.awt.Panel sistemIlerlet;
    private java.awt.Panel tumIslem;
    // End of variables declaration//GEN-END:variables
}
