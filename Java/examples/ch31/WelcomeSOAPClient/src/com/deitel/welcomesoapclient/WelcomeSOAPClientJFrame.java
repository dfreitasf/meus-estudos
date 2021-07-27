// Fig. 31.9: WelcomeSOAPClientJFrame.java
// Client desktop application for the WelcomeSOAP web service.
package com.deitel.welcomesoapclient;

import com.deitel.welcomesoap.WelcomeSOAP;
import com.deitel.welcomesoap.WelcomeSOAPService;
import javax.swing.JOptionPane;

public class WelcomeSOAPClientJFrame extends javax.swing.JFrame
{
   // references the service endpoint interface object (i.e., the proxy)
   private WelcomeSOAP welcomeSOAPProxy;

   // no-argument constructor
   public WelcomeSOAPClientJFrame()
   {
      initComponents();

      try
      {
         // create the objects for accessing the WelcomeSOAP web service
         WelcomeSOAPService service = new WelcomeSOAPService();
         welcomeSOAPProxy = service.getWelcomeSOAPPort();
      } // end try
      catch ( Exception exception )
      {
         exception.printStackTrace();
         System.exit( 1 );
      } // end catch
   } // end WelcomeSOAPClientJFrame constructor

   // The initComponents method is autogenerated by NetBeans and is called
   // from the constructor to initialize the GUI. This method is not shown
   // here to save space. Open WelcomeSOAPClientJFrame.java in this
   // example's folder to view the complete generated code.
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      nameJTextField = new javax.swing.JTextField();
      nameJLabel = new javax.swing.JLabel();
      submitJButton = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      nameJLabel.setText("Enter your name:");

      submitJButton.setText("Submit");
      submitJButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            submitJButtonActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(nameJLabel)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGap(73, 73, 73)
                  .addComponent(submitJButton)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(nameJLabel)
               .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(submitJButton)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   // call the web service with the supplied name and display the message
   private void submitJButtonActionPerformed(//GEN-FIRST:event_submitJButtonActionPerformed
      java.awt.event.ActionEvent evt )
   {//GEN-HEADEREND:event_submitJButtonActionPerformed
      String name = nameJTextField.getText(); // get name from JTextField

      // retrieve the welcome string from the web service
      String message = welcomeSOAPProxy.welcome( name );
      JOptionPane.showMessageDialog( this, message,
         "Welcome", JOptionPane.INFORMATION_MESSAGE );
   } // end method submitJButtonActionPerformed//GEN-LAST:event_submitJButtonActionPerformed

   // main method begins execution
   public static void main( String args[] )
   {
      java.awt.EventQueue.invokeLater(
         new Runnable()
         {
            public void run()
            {
               new WelcomeSOAPClientJFrame().setVisible( true );
            } // end method run
         } // end anonymous inner class
      ); // end call to java.awt.EventQueue.invokeLater
   } // end main

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel nameJLabel;
   private javax.swing.JTextField nameJTextField;
   private javax.swing.JButton submitJButton;
   // End of variables declaration//GEN-END:variables
} // end class WelcomeSOAPClientJFrame

/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
