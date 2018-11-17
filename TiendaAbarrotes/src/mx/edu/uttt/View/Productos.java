package mx.edu.uttt.View;

import mx.edu.uttt.Modelo.Producto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Productos extends javax.swing.JFrame {

    public Productos() {
        initComponents();
    }
    
    ArrayList<Producto> Productos = new ArrayList();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        lbNombre = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro deProductos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setText("Registro");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        lbNombre.setText("Nombre:");
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, -1));

        lbPrecio.setText("Costo:");
        getContentPane().add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, -1));

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 20));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Inicio volver = new Inicio(Productos);
        this.show(false);
        volver.show(true);

    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped
        char tipocar = evt.getKeyChar();
        if (!Character.isAlphabetic(tipocar)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProductoKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Producto producto = new Producto();

        if (!this.txtPrecio.getText().isEmpty() && !this.txtProducto.getText().isEmpty()) {
            producto.setNombre(this.txtProducto.getText());
            double precio = 0;
            precio = Double.parseDouble(this.txtPrecio.getText());
            producto.setPrecio(precio);
            Productos.add(producto);
            this.txtPrecio.setText(null);
            this.txtProducto.setText(null);
            JOptionPane.showMessageDialog(null, "El producto de " + producto.getNombre() + " se registro con el precio de : $ " + producto.getPrecio() +"pesos. ");
        } else {
            JOptionPane.showMessageDialog(null, "¡Error! No puede quedar ningún campo vacío.");
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
