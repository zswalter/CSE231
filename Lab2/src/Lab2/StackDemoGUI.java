/* LAB #2
*WINTER 2014
*Zachary, Walters
*Following program is my own effort/work.
*I did not copy this program or program segment from anyone or any website site. 
If proven otherwise I will accept the consequences and the actions that will be 
taken for cheating in this class.
*/

package Lab2;

import ch03.stacks.*;

/**
 *
 * @author zachary0191
 */
public class StackDemoGUI extends javax.swing.JFrame {
    UnboundedStackInterface<String> stack = new  ArrayListStack<String>();
    int total = 0;
    /**
     * Creates new form StackDemoGUI
     */
    public StackDemoGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        pushBtn = new javax.swing.JButton();
        popBtn = new javax.swing.JButton();
        numTxt = new javax.swing.JTextField();
        stackLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        histTxt = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        stackTxt = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pushBtn.setText("Push");
        pushBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushBtnActionPerformed(evt);
            }
        });

        popBtn.setText("Pop");
        popBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popBtnActionPerformed(evt);
            }
        });

        stackLbl.setText("Add to stack:");

        histTxt.setEditable(false);
        histTxt.setColumns(20);
        histTxt.setRows(5);
        jScrollPane2.setViewportView(histTxt);

        stackTxt.setEditable(false);
        stackTxt.setColumns(20);
        stackTxt.setRows(5);
        jScrollPane1.setViewportView(stackTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stackLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pushBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pushBtn)
                    .addComponent(popBtn)
                    .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stackLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );

        pushBtn.getAccessibleContext().setAccessibleName("pushBtn");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //push the entered string to the stack
    //pre condition is that there is a string entered
    //post condition is that the string is added to the stack and printed
    private void pushBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushBtnActionPerformed
        String in;
        in = numTxt.getText();
        stack.push(in);
        histTxt.append('"' + in + "\" was pushed onto the stack.\n");
        stackTxt.append(in + "\n");
        total++;
        numTxt.setText("");
    }//GEN-LAST:event_pushBtnActionPerformed

    //pop the last string and update the displayed stack
    //pre is that there is not an empty stack
    //post is the last element is popped and list is updated
    private void popBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popBtnActionPerformed

        if (total != 0)
        {
            String[] stackAr = new String[total - 1];
            stackTxt.setText("");
            histTxt.append("\"" + stack.top() + "\" was popped off the stack.\n");
            stack.pop();
            for (int i = 0; i < total - 1; i++)
            {
                stackAr[i] = stack.top();
                stack.pop();
            }
            for (int i = total - 2; i >= 0; i--)
            {
                stack.push(stackAr[i]);
                stackTxt.append(stack.top() + "\n");
            }
            total--;
        }
        else
            histTxt.append("Cannot pop from an empty stack.\n");
        numTxt.setText("");
    }//GEN-LAST:event_popBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    //creates the form
    //pre and post conditions are none
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
            java.util.logging.Logger.getLogger(StackDemoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StackDemoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StackDemoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StackDemoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StackDemoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea histTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numTxt;
    private javax.swing.JButton popBtn;
    private javax.swing.JButton pushBtn;
    private javax.swing.JLabel stackLbl;
    private javax.swing.JTextArea stackTxt;
    // End of variables declaration//GEN-END:variables
}
