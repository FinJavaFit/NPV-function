
package npv.function;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class NPFrame extends javax.swing.JFrame  {

DecimalFormat formatter = new DecimalFormat("###,###.00");

int numone;
int numtwo;
int numthree;
int numfour;
int numfive;
int numsix;
int numseven;
int numeight;
int numnine;
int numten;

Double ans;
String a1;
double total;

double inlay;
double inlayneg;

double disc;
double disc2;


    
    public NPFrame() {
        super ("Net Present Value Calculator");
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        cf1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cf2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cf3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cf4 = new javax.swing.JTextField();
        submitBtn = new java.awt.Button();
        box = new javax.swing.JPanel();
        bx = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        resetBtn = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        years = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inOut = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        disRate = new javax.swing.JTextField();
        xit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cf5 = new javax.swing.JTextField();
        cf6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cf7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cf8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cf9 = new javax.swing.JTextField();
        cf10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cashflow 1");

        cf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 153, 255));
        jLabel2.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cashflow 2");

        cf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cashflow 3");

        cf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cashflow 4");

        cf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf4ActionPerformed(evt);
            }
        });

        submitBtn.setLabel("Calculate");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        box.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bx.setEditable(false);
        bx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        jLabel14.setText("NPV");

        javax.swing.GroupLayout boxLayout = new javax.swing.GroupLayout(box);
        box.setLayout(boxLayout);
        boxLayout.setHorizontalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bx, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        boxLayout.setVerticalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bx, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        resetBtn.setLabel("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Number of Years:");

        years.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsActionPerformed(evt);
            }
        });

        jLabel6.setText("Initial Outlay");

        inOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inOutActionPerformed(evt);
            }
        });

        jLabel7.setText("Discount Rate");

        disRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disRateActionPerformed(evt);
            }
        });

        xit.setText("Exit");
        xit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xitActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cashflow 5");

        cf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf5ActionPerformed(evt);
            }
        });

        cf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cashflow 6");

        cf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf7ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Cashflow 7");

        jLabel11.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Cashflow 8");

        cf8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf8ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Cashflow 9");

        cf9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf9ActionPerformed(evt);
            }
        });

        cf10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf10ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Cashflow 10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inOut, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(disRate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cf3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cf4, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cf1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cf2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cf5, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cf6, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cf7, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cf8, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cf9, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cf10)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(xit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf1ActionPerformed

 
    }//GEN-LAST:event_cf1ActionPerformed

    private void cf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf2ActionPerformed

    private void cf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf3ActionPerformed

    private void cf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf4ActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
    
        inlay = Double.parseDouble(inOut.getText());
        inlayneg = -inlay;
        
        disc = Double.parseDouble(disRate.getText());
        disc2 = (disc/100)+1;
        
        double numYears = Double.parseDouble(years.getText());
        
       //<editor-fold> 
        if (numYears == 1) {
       
           numone = Integer.parseInt(cf1.getText());
           ans = (numone/Math.pow(disc2,1) + inlayneg);
        }
        
        else if (numYears == 2) {
        numone = Integer.parseInt(cf1.getText());
        numtwo = Integer.parseInt(cf2.getText());
        
        ans = (numone/Math.pow(disc2,1)) + (numtwo/Math.pow(disc2,2)) + (inlayneg);
        
        }
        
        else if (numYears == 3) {
            numone = Integer.parseInt(cf1.getText());
            numtwo = Integer.parseInt(cf2.getText());
            numthree = Integer.parseInt(cf3.getText());
           
            ans = (numone/Math.pow(disc2,1)) + (numtwo/Math.pow(disc2,2)) + (numthree/Math.pow(disc2,3)) + (inlayneg);
        }
        
         else if (numYears == 4) {
            numone = Integer.parseInt(cf1.getText());
            numtwo = Integer.parseInt(cf2.getText());
            numthree = Integer.parseInt(cf3.getText());
            numfour = Integer.parseInt(cf4.getText());
           
            ans = (numone/Math.pow(disc2,1)) + (numtwo/Math.pow(disc2,2)) + (numthree/Math.pow(disc2,3)) + (numfour/Math.pow(disc2,4)) + (inlayneg);
        }
       
         else if (numYears == 5) {
            numone = Integer.parseInt(cf1.getText());
            numtwo = Integer.parseInt(cf2.getText());
            numthree = Integer.parseInt(cf3.getText());
            numfour = Integer.parseInt(cf4.getText());
            numfive = Integer.parseInt(cf5.getText());
          
            ans = (numone/Math.pow(disc2,1)) + (numtwo/Math.pow(disc2,2)) + (numthree/Math.pow(disc2,3)) + (numfour/Math.pow(disc2,4)) + (numfive/Math.pow(disc2,5)) + (inlayneg);
        }
        
        else if (numYears == 6) {
            numone = Integer.parseInt(cf1.getText());
            numtwo = Integer.parseInt(cf2.getText());
            numthree = Integer.parseInt(cf3.getText());
            numfour = Integer.parseInt(cf4.getText());
            numfive = Integer.parseInt(cf5.getText());
            numsix = Integer.parseInt(cf6.getText());
          
            ans = (numone/Math.pow(disc2,1)) + (numtwo/Math.pow(disc2,2)) + (numthree/Math.pow(disc2,3)) + (numfour/Math.pow(disc2,4)) + (numfive/Math.pow(disc2,5)) + (numfive/Math.pow(disc2,6)) + (inlayneg);
        }
        
        else if (numYears == 7) {
            numone = Integer.parseInt(cf1.getText());
            numtwo = Integer.parseInt(cf2.getText());
            numthree = Integer.parseInt(cf3.getText());
            numfour = Integer.parseInt(cf4.getText());
            numfive = Integer.parseInt(cf5.getText());
            numsix = Integer.parseInt(cf6.getText());
            numseven = Integer.parseInt(cf7.getText());
            
            ans = (numone/Math.pow(disc2,1)) + (numtwo/Math.pow(disc2,2)) + (numthree/Math.pow(disc2,3)) + (numfour/Math.pow(disc2,4)) + (numfive/Math.pow(disc2,5)) + (numfive/Math.pow(disc2,6)) + (numfive/Math.pow(disc2,7)) + (inlayneg);
           
        }
        
        else if (numYears == 8) {
            numone = Integer.parseInt(cf1.getText());
            numtwo = Integer.parseInt(cf2.getText());
            numthree = Integer.parseInt(cf3.getText());
            numfour = Integer.parseInt(cf4.getText());
            numfive = Integer.parseInt(cf5.getText());
            numsix = Integer.parseInt(cf6.getText());
            numseven = Integer.parseInt(cf7.getText());
            numeight = Integer.parseInt(cf8.getText());
            
            ans = (numone/Math.pow(disc2,1)) + (numtwo/Math.pow(disc2,2)) + (numthree/Math.pow(disc2,3)) + (numfour/Math.pow(disc2,4)) + (numfive/Math.pow(disc2,5)) + (numsix/Math.pow(disc2,6)) + (numseven/Math.pow(disc2,7)) + (numeight/Math.pow(disc2,8)) + (inlayneg);
           
        }
        
        else if (numYears == 9) {
            numone = Integer.parseInt(cf1.getText());
            numtwo = Integer.parseInt(cf2.getText());
            numthree = Integer.parseInt(cf3.getText());
            numfour = Integer.parseInt(cf4.getText());
            numfive = Integer.parseInt(cf5.getText());
            numsix = Integer.parseInt(cf6.getText());
            numseven = Integer.parseInt(cf7.getText());
            numeight = Integer.parseInt(cf8.getText());
            numnine = Integer.parseInt(cf9.getText());
            
            ans = (numone/Math.pow(disc2,1)) + (numtwo/Math.pow(disc2,2)) + (numthree/Math.pow(disc2,3)) + (numfour/Math.pow(disc2,4)) + (numfive/Math.pow(disc2,5)) + (numsix/Math.pow(disc2,6)) + (numseven/Math.pow(disc2,7)) + (numeight/Math.pow(disc2,8)) + (numnine/Math.pow(disc2,9))  + (inlayneg);
                
        }
        
          else if (numYears == 10) {
            numone = Integer.parseInt(cf1.getText());
            numtwo = Integer.parseInt(cf2.getText());
            numthree = Integer.parseInt(cf3.getText());
            numfour = Integer.parseInt(cf4.getText());
            numfive = Integer.parseInt(cf5.getText());
            numsix = Integer.parseInt(cf6.getText());
            numseven = Integer.parseInt(cf7.getText());
            numeight = Integer.parseInt(cf8.getText());
            numnine = Integer.parseInt(cf9.getText());
            numten = Integer.parseInt(cf10.getText());
            
            ans = (numone/Math.pow(disc2,1)) + (numtwo/Math.pow(disc2,2)) + (numthree/Math.pow(disc2,3)) + (numfour/Math.pow(disc2,4)) + (numfive/Math.pow(disc2,5)) + (numsix/Math.pow(disc2,6)) + (numseven/Math.pow(disc2,7)) + (numeight/Math.pow(disc2,8)) + (numnine/Math.pow(disc2,9)) + (numten/Math.pow(disc2,10)) + (inlayneg);
           
        }
        // </editor-fold> 
        
        //ans = (numone/Math.pow(disc2,1)) + (numtwo/Math.pow(disc2,2)) + (numthree/Math.pow(disc2,3)) + /*(numfour/Math.pow(disc2,4)) +*/ (inlayneg);
        a1 = formatter.format(ans);
        bx.setText(a1);
    
        
        
    }//GEN-LAST:event_submitBtnActionPerformed

    private void bxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bxActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
      cf1.setText(null);
      cf2.setText(null);
      cf3.setText(null);
      cf4.setText(null);
      bx.setText(null);
      inOut.setText(null);
      disRate.setText(null);
      years.setText(null);
     
      
    }//GEN-LAST:event_resetBtnActionPerformed

    private void yearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsActionPerformed

    private void inOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inOutActionPerformed

    private void disRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disRateActionPerformed

    private void xitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_xitActionPerformed

    private void cf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf5ActionPerformed

    private void cf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf6ActionPerformed

    private void cf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf7ActionPerformed

    private void cf8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf8ActionPerformed

    private void cf9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf9ActionPerformed

    private void cf10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf10ActionPerformed

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
            java.util.logging.Logger.getLogger(NPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NPFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel box;
    private javax.swing.JTextField bx;
    private javax.swing.JTextField cf1;
    private javax.swing.JTextField cf10;
    private javax.swing.JTextField cf2;
    private javax.swing.JTextField cf3;
    private javax.swing.JTextField cf4;
    private javax.swing.JTextField cf5;
    private javax.swing.JTextField cf6;
    private javax.swing.JTextField cf7;
    private javax.swing.JTextField cf8;
    private javax.swing.JTextField cf9;
    private static javax.swing.JTextField disRate;
    private static javax.swing.JTextField inOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private java.awt.Button resetBtn;
    private java.awt.Button submitBtn;
    private javax.swing.JButton xit;
    private static javax.swing.JTextField years;
    // End of variables declaration//GEN-END:variables
}
