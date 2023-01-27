
package com.cesarulloa.ventas.test;
import com.cesarulloa.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa",50.0);
        Producto producto2 = new Producto("Pantalon",100.0);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
    }
}
