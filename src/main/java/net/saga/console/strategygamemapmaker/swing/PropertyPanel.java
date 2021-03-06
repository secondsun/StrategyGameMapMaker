/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.saga.console.strategygamemapmaker.swing;

import net.saga.console.strategygamemapmaker.util.PropertyTransformer;

/**
 *
 * @author summers
 */
public class PropertyPanel<T> extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    private T oldValue;
    private String newValue;
    private final String propertyName;
    private final PropertyTransformer<T> transformer;
    
    /**
     * Creates new form PropertyPanel
     */
    public PropertyPanel(String propertyName, T propertyValue, PropertyTransformer<T> transformer) {
        initComponents();
        this.propertyName = propertyName;
        this.oldValue = propertyValue;
        this.transformer = transformer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        propertyNameLabel = new javax.swing.JLabel();
        propertyValue = new javax.swing.JTextField();

        propertyNameLabel.setText("Property Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(propertyNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(propertyValue, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(propertyNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(propertyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel propertyNameLabel;
    private javax.swing.JTextField propertyValue;
    // End of variables declaration//GEN-END:variables
}
