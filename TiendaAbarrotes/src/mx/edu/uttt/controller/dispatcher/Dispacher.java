
package mx.edu.uttt.controller.dispatcher;

import mx.edu.uttt.View.*;

/**
 *
 * @author BONI
 */
public class Dispacher {
    
    private Inicio inicio;
    private Productos pro;
    private Registro re;
    private Venta venta;
    
    public Dispacher(){
        inicio= new Inicio();
        pro = new Productos();
        re = new Registro();
        venta= new Venta();
    }
    public void dispatch(String request){
        
        if (request.equalsIgnoreCase("MENU")) {
            inicio.show();
        }
        if (request.equalsIgnoreCase("PRODUCTO")) {
            pro.show();
        }
        if (request.equalsIgnoreCase("USUARIO")) {
            re.show();
        }
        if (request.equalsIgnoreCase("VENTA")) {
            venta.show();
        }
   }
}
