package com.cesarulloa.ventas;

//Diseñando clase
public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    //Constructor vacio para inicializar las variables idOrden y productos
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;

        //Se necesita inicializar este array creando un objeto tipo producto ya que hará referencia
        //a la cantidad de productos que se estarán creando que este caso contiene la constante 
        //MAX_PRODUCTOS que su valor es 10.
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    //Método para agregar producto
    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            //Por cada objeto tipo Producto se incrementará la variable.
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado la cantidad maxima de productos: " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;

        //Iterar el arreglo
        for (int i = 0; i < this.contadorProductos; i++) {
            /* Sintaxis paso por paso para obtener el
            * precio de los productos
            * Producto producto = this.productos[i];
            * total += producto.getPrecio();
            */

            //Obteniendo el precio de cada producto para finalmente obtener el total
            //sumando el precio de todos los prodcutos que se han agregado al arreglo
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    //Metodo para imprimir el total de la orden
    public void mostrarOrden(){
        System.out.println("ID Orden: "+this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total orden: $"+totalOrden);
        
        System.out.println("Productos de la orden: 👇👇");
        
        //Este iterador imprime cada objeto de tipo producto
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }

}
