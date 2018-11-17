package mx.edu.uttt.View;

import mx.edu.uttt.Modelo.Producto;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class Venta extends javax.swing.JFrame {

    public Venta() {
        initComponents();
    }

    public Venta(ArrayList<Producto> Productos) {
        initComponents();
        this.Productos = Productos;

        for (int i = 0; i < this.Productos.size(); i++) {
            this.cmbProducto.addItem(this.Productos.get(i).getNombre());
        }
 
    }
    
    ArrayList<Producto> Productos = new ArrayList();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloVenta = new javax.swing.JLabel();
        lbSelecProducto = new javax.swing.JLabel();
        cmbProducto = new javax.swing.JComboBox<>();
        btnComprar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlLista = new javax.swing.JList<>();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTituloVenta.setText("VENTA");
        getContentPane().add(lbTituloVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        lbSelecProducto.setText("Seleccione un  producto:");
        getContentPane().add(lbSelecProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        getContentPane().add(cmbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 20));

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jScrollPane1.setViewportView(jlLista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 180, 140));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Inicio volver = new Inicio(Productos);
        this.show(false);
        volver.show(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        JOptionPane.showMessageDialog(null,  " Se compro: " + this.cmbProducto.getSelectedItem().toString());
    }//GEN-LAST:event_btnComprarActionPerformed


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        for (int i = 0; i < lista.size(); i++) {
            if (this.jlLista.getSelectedValue().equals(lista.getElementAt(i).toString())) {
            lista.remove(i);
            break;
        }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
DefaultListModel lista=new DefaultListModel();
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
lista.addElement(this.cmbProducto.getSelectedItem().toString());
        
        this.jlLista.setModel(lista);
        
        // this.cmbCliente.getSelectedItem().toString()+" ------- "+ //
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlLista;
    private javax.swing.JLabel lbSelecProducto;
    private javax.swing.JLabel lbTituloVenta;
    // End of variables declaration//GEN-END:variables
}
