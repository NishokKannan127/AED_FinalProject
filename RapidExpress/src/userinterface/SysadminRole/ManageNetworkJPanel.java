/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SysadminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import userinterface.HomePages.TableFormat;

/**
 *
 * @author raunak
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    //private JPanel userProcessContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(EcoSystem system) {
        initComponents();

        //this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.system=EcoSystem.getInstance();
        networkJTable.getTableHeader().setDefaultRenderer(new TableFormat());
        populateNetworkTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[3];
            row[0] = network.getName();
            row[1] = network.getState();
            row[2] = network.getCountry();
            model.addRow(row);
        }
    }
    
    public boolean isAlpha(String name) {
    return name.matches("[a-zA-Z]+");
        }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNetWorkName = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        btnCreateNetwork = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(139, 216, 189));
        setMaximumSize(new java.awt.Dimension(2100, 2147));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        networkJTable.setBackground(new java.awt.Color(0, 0, 0));
        networkJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 204)));
        networkJTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        networkJTable.setForeground(new java.awt.Color(255, 255, 255));
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "State", "Country"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        networkJTable.setFocusable(false);
        networkJTable.setGridColor(new java.awt.Color(255, 255, 255));
        networkJTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        networkJTable.setRowHeight(30);
        networkJTable.setSelectionForeground(new java.awt.Color(204, 255, 204));
        networkJTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
            networkJTable.getColumnModel().getColumn(1).setResizable(false);
            networkJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 490, 200));

        jPanel2.setBackground(new java.awt.Color(255, 87, 87));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("State:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        txtNetWorkName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNetWorkName.setForeground(new java.awt.Color(255, 255, 255));
        txtNetWorkName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetWorkNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtNetWorkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 174, 20));

        txtState.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtState.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 174, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Country:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtCountry.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtCountry.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 174, 20));

        btnCreateNetwork.setBackground(new java.awt.Color(36, 54, 101));
        btnCreateNetwork.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCreateNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateNetwork.setText("Create Network");
        btnCreateNetwork.setBorder(null);
        btnCreateNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNetworkActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreateNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 110, 32));

        jLabel4.setBackground(new java.awt.Color(36, 54, 101));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Create Network");
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 50));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 380, 440));

        jPanel3.setBackground(new java.awt.Color(36, 54, 101));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel12.setBackground(new java.awt.Color(36, 54, 101));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Manage Network");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 1476, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNetworkActionPerformed

        if(txtNetWorkName.getText().isEmpty())
        {
        txtNetWorkName.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtNetWorkName.setForeground(Color.red);
        } 
        if(txtState.getText().isEmpty())
        {
        txtState.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtState.setForeground(Color.red);
        } 
        if(txtCountry.getText().isEmpty())
        {
        txtCountry.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtCountry.setForeground(Color.red);
        } 
        
        String check1 = "";
        
        if (txtNetWorkName.getText().isEmpty() || txtState.getText().isEmpty() || txtCountry.getText().isEmpty() ){
            //JOptionPane.showMessageDialog(null, "All fields are mandatory!" , "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><h2><I>All fields are</I><font color='red'> mandatory</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        else{
        for ( Network network :system.getNetworkList()){
        if( network.getName().equals(txtNetWorkName.getText())) {
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Network Name</I></font> can not be <font color='red'>same</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
                    
        //JOptionPane.showMessageDialog(null, "Network name cannot be same!" , "Error", JOptionPane.ERROR_MESSAGE);
        check1 = "no";
        return;       
        }}
        if(!isAlpha(txtState.getText()))
        {
              //JOptionPane.showMessageDialog(null, "State name must be all alphabets." , "Error", JOptionPane.ERROR_MESSAGE);
              check1 = "no";
              txtState.setBorder(BorderFactory.createLineBorder(Color.RED));
              txtState.setForeground(Color.red);
              
              JOptionPane.showMessageDialog(null, new JLabel("<html><h2>Name of the<font color='red'><I> State</I></font> must contain only<font color='green'> alphabets</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
          
              
        }
           if(!isAlpha(txtCountry.getText()))
        {
              //JOptionPane.showMessageDialog(null, "Country name must be all alphabets." , "Error", JOptionPane.ERROR_MESSAGE);
              check1 = "no";
              txtCountry.setBorder(BorderFactory.createLineBorder(Color.RED));
              txtCountry.setForeground(Color.red);
              JOptionPane.showMessageDialog(null, new JLabel("<html><h2>Name of the<font color='red'><I> Country</I></font> must contain only<font color='green'> alphabets</font>!</h2></html>") , "Error", JOptionPane.ERROR_MESSAGE);
          
        }
        
        
        if( check1.equals("no")) 
        {}
        else
        {             
        Network network = system.createAndAddNetwork();
        network.setName(txtNetWorkName.getText());
        network.setState(txtState.getText());
        network.setCountry(txtCountry.getText());
        populateNetworkTable();
        
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2>New <I>Network</I><font color='green'> created</font> successfully!</h2></html>") );
          
        
        dB4OUtil.storeSystem(system);
        
        txtNetWorkName.setText("");
        txtState.setText("");
        txtCountry.setText("");
        }  }
    }//GEN-LAST:event_btnCreateNetworkActionPerformed

    private void txtNetWorkNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetWorkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNetWorkNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable networkJTable;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtNetWorkName;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
