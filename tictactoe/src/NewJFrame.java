
import javax.swing.JOptionPane;

/**
 *
 * @author Ifran
 */
public class NewJFrame extends javax.swing.JFrame {


    int turn =2;
    int buttonused[]={0,0,0,0,0,0,0,0,0};
    int p1[]={0,0,0,0,0,0,0,0,0};
    int p2[]={0,0,0,0,0,0,0,0,0};
    
    int p1()
    {
        if(p1[0]==1 && p1[1]==1 && p1[2]==1)
        {
           return 1;
        }
        if(p1[3]==1 && p1[4]==1 && p1[5]==1)
        {
           return 1;
        }
        if(p1[6]==1 && p1[7]==1 && p1[8]==1)
        {
           return 1;
        }
        if(p1[0]==1 && p1[4]==1 && p1[8]==1)
        {
           return 1;
        }
        if(p1[6]==1 && p1[4]==1 && p1[2]==1)
        {
           return 1;
        }
        if(p1[0]==1 && p1[3]==1 && p1[6]==1)
        {
           return 1;
        }
        if(p1[8]==1 && p1[5]==1 && p1[2]==1)
        {
           return 1;
        }
        if(p1[4]==1 && p1[1]==1 && p1[7]==1)
        {
           return 1;
        }
        return 0;
    }
    
    int p2()
    {
        if(p2[0]==1 && p2[1]==1 && p2[2]==1)
        {
           return 1;
        }
        if(p2[3]==1 && p2[4]==1 && p2[5]==1)
        {
           return 1;
        }
        if(p2[6]==1 && p2[7]==1 && p2[8]==1)
        {
           return 1;
        }
        if(p2[0]==1 && p2[4]==1 && p2[8]==1)
        {
           return 1;
        }
        if(p2[6]==1 && p2[4]==1 && p2[2]==1)
        {
           return 1;
        }
        if(p2[0]==1 && p2[3]==1 && p2[6]==1)
        {
           return 1;
        }
        if(p2[8]==1 && p2[5]==1 && p2[2]==1)
        {
           return 1;
        }
        if(p2[4]==1 && p2[1]==1 && p2[7]==1)
        {
           return 1;
        }
        return 0;
    }
    public NewJFrame() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        b2.setBackground(new java.awt.Color(44, 232, 238));
        b2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b2.setForeground(new java.awt.Color(44, 232, 248));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(44, 232, 248));
        b3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b3.setForeground(new java.awt.Color(44, 232, 238));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(44, 232, 238));
        b1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b1.setForeground(new java.awt.Color(44, 232, 238));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(44, 232, 238));
        b5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b5.setForeground(new java.awt.Color(44, 232, 238));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(44, 232, 238));
        b6.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b6.setForeground(new java.awt.Color(44, 232, 238));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(44, 232, 248));
        b4.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        b4.setForeground(new java.awt.Color(44, 232, 238));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(4, 232, 238));
        b8.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b8.setForeground(new java.awt.Color(44, 232, 238));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(44, 232, 238));
        b9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b9.setForeground(new java.awt.Color(44, 232, 238));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(44, 232, 238));
        b7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b7.setForeground(new java.awt.Color(44, 232, 238));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(44, 232, 238));
        reset.setText("PLAY AGAIN");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(reset)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
    if(buttonused[0]==0)
    {
         
        if(turn%2==0)
       { 
           turn++;
           b1.setText("x");
           buttonused[0]=1;
           p1[0]=1;
           
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }else
       {
           turn++;
           b1.setText("O");
           buttonused[0]=1;
            p2[0]=1;
          
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }   
            
       }
    }else
    {
        JOptionPane.showMessageDialog(rootPane, "This button is used already");
    }
       
    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
      if(buttonused[3]==0)
    {
         
        if(turn%2==0)
       { 
           turn++;
           b4.setText("x");
           buttonused[3]=1;
            p1[3]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }else
       {
           turn++;
           b4.setText("O");
           buttonused[3]=1;
            p2[3]=1;
            
             if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
            
       }
    }else
    {
        JOptionPane.showMessageDialog(rootPane, "Tish button is used already");
    }
       
    }//GEN-LAST:event_b4ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
      if(buttonused[6]==0)
    {
         
        if(turn%2==0)
       { 
           turn++;
           b7.setText("x");
           buttonused[6]=1;
            p1[6]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }else
       {
           turn++;
           b7.setText("O");
           buttonused[6]=1;
            p1[6]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }
    }else
    {
        JOptionPane.showMessageDialog(rootPane, "This button is used already");
    }
       
    }//GEN-LAST:event_b7ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       if(buttonused[1]==0)
    {
         
        if(turn%2==0)
       { 
           turn++;
           b2.setText("x");
           buttonused[1]=1;
            p1[1]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }else
       {
           turn++;
           b2.setText("O");
           buttonused[1]=1;
            p2[1]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }
    }else
    {
        JOptionPane.showMessageDialog(rootPane, "Tish button is used already");
    }
       
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       if(buttonused[2]==0)
       {
         
          if(turn%2==0)
          { 
           turn++;
           b3.setText("x");
           buttonused[2]=1;
            p1[2]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
          }else
          {
           turn++;
           b3.setText("O");
           buttonused[2]=1;
            p2[2]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
           }
    }else
    {
        JOptionPane.showMessageDialog(rootPane, "Tish button is used already");
    }
       
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
      if(buttonused[4]==0)
    {
         
        if(turn%2==0)
       { 
           turn++;
           b5.setText("x");
           buttonused[4]=1;
            p1[4]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }else
       {
           turn++;
           b5.setText("O");
           buttonused[4]=1;
            p2[4]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }
    }else
    {
        JOptionPane.showMessageDialog(rootPane, "Tish button is used already");
    }
       
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
       if(buttonused[5]==0)
    {
         
        if(turn%2==0)
       { 
           turn++;
           b6.setText("x");
           buttonused[5]=1;
            p1[5]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }else
       {
           turn++;
           b6.setText("O");
           buttonused[5]=1;
            p2[5]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }
    }else
    {
        JOptionPane.showMessageDialog(rootPane, "Tish button is used already");
    }
       
    }//GEN-LAST:event_b6ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
       if(buttonused[7]==0)
    {
         
        if(turn%2==0)
       { 
           turn++;
           b8.setText("x");
           buttonused[7]=1;
            p1[7]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }else
       {
           turn++;
           b8.setText("O");
           buttonused[7]=1;
            p2[7]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }
    }else
    {
        JOptionPane.showMessageDialog(rootPane, "Tish button is used already");
    }
       
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(buttonused[8]==0)
    {
         
        if(turn%2==0)
       { 
           turn++;
           b9.setText("x");
           buttonused[8]=1;
            p1[8]=1;
            
             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           }
       }else
       {
           turn++;
           b9.setText("O");
           buttonused[8]=1;
            p2[8]=1;    

             
           if(p1()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 1 Has Won :D");
           }else if(p2()==1)
           {
               JOptionPane.showMessageDialog(rootPane, "Player 2 Has Won :D");
           } 
       }
    }else
    {
        JOptionPane.showMessageDialog(rootPane, "Tish button is used already");
    }
       
    }//GEN-LAST:event_b9ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b7.setText("");
        b8.setText("");

        turn = 2;
        
        for(int i=0;i<9;i++)
        {
            buttonused[i]=0;
        }
         for(int i=0;i<9;i++)
        {
            p1[i]=0;
        } 
         for(int i=0;i<9;i++)
        {
            p2[i]=0;
        }
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables

   
}
