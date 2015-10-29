/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser;

/**
 *
 * @author Dean
 */
public class MultiLineButton extends javax.swing.JButton{
    public MultiLineButton(String name, String date, String ticket){
        lastName_label = new javax.swing.JLabel(name);
        date_label = new javax.swing.JLabel(date);
        firstTicketNum_label = new javax.swing.JLabel(ticket);
        initComponents();

    }
    private void initComponents() {

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));
        add(lastName_label);
        add(date_label);
        add(firstTicketNum_label);
        setMaximumSize(new java.awt.Dimension(115, 60));
        setMinimumSize(new java.awt.Dimension(115, 60));
        setPreferredSize(new java.awt.Dimension(115, 60));
    }
    
    private void type_fieldActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          

    private void ticket_fieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }
    
    javax.swing.JLabel lastName_label;
    javax.swing.JLabel date_label;
    javax.swing.JLabel firstTicketNum_label;
    
    
}
