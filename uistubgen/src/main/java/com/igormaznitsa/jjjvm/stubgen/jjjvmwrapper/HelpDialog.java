/* 
 * Copyright 2015 Igor Maznitsa (http://www.igormaznitsa.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.igormaznitsa.jjjvm.stubgen.jjjvmwrapper;

import com.igormaznitsa.jjjvm.stubgen.utils.Utils;

public class HelpDialog extends javax.swing.JDialog
{
  private static final long serialVersionUID = 3872041561871025023L;

    /** Creates new form HelpDialog */
    public HelpDialog(java.awt.Frame parent)
    {
        super(parent, true);
        initComponents();

        Utils.toScreenCenter(this);

        setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    textArea = new javax.swing.JTextArea();
    buttonClose = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    textArea.setEditable(false);
    textArea.setColumns(20);
    textArea.setLineWrap(true);
    textArea.setRows(5);
    textArea.setText("Shortly\n-----------------\n   This utility allows to generate a java class source that implements the MJVMProcessor interface. The generated class can be used to process calls from a MJVMClass object. The generated class is not fully completed but it really helps to process classes which have a lot of class members.\n\nHow it works?\n-----------------\n  It is very easy. You need to place all classes, which you want to use, at the tree panel. The tree contains all classes which will be used to generate the processor class source, of course only their non-private members will be used for the process (also I do not recommend to use the utility for inside anonymous classes, it is no so smart to dig very hard cases).\n  You can add either detached classes or full packages (JAR or ZIP) into the tree with the '+' button. The '-' button allows to remove selected items from the tree and the 'x' button allows to clear whole tree.\n  When you have completed your class list, you can generate the java source from it with the menu 'File->Generate stub'.");
    textArea.setWrapStyleWord(true);
    jScrollPane1.setViewportView(textArea);

    buttonClose.setText("Close");
    buttonClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buttonCloseActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
          .addComponent(buttonClose))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(buttonClose)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonCloseActionPerformed
    {//GEN-HEADEREND:event_buttonCloseActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCloseActionPerformed
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton buttonClose;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea textArea;
  // End of variables declaration//GEN-END:variables
}