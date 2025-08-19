import javax.swing.plaf.ProgressBarUI;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Laptop Dell XPS 15", "DELL-XPS15", 1500.00);
        Producto producto2 = new Producto("Mouse Logitech G502", "LOG-G502", 79.99);
        Producto producto3 = new Producto("Teclado Mecánico Razer", "RAZ-MECH-KB", 120.50);
        Producto producto4 = new Producto("Monitor Samsung Ultrawide", "SAM-UW-34", 450.75);
        Producto producto5 = new Producto("Auriculares Sony WH-1000XM4", "SONY-XM4", 249.00);

        ArrayList<Producto> listaProductos = new ArrayList<Producto>();

        //Agregar productos a la lista:
        agregarProductoLista(listaProductos, producto1);
        agregarProductoLista(listaProductos, producto1);    //Intentar agregarlo nuevamente
        agregarProductoLista(listaProductos, producto2);
        agregarProductoLista(listaProductos, producto3);
        agregarProductoLista(listaProductos, producto3);    //Intentar agregarlo nuevamente
        agregarProductoLista(listaProductos, producto4);
        agregarProductoLista(listaProductos, producto5);

    }

    public static void agregarProductoLista(ArrayList<Producto> listaProductos, Producto producto) {
        if (listaProductos.contains(producto)) {
            System.out.println("*** El producto " + producto.getNombre() + " ya existe ***");
        } else {
            listaProductos.add(producto);
            System.out.println("Producto " + producto.getNombre() + " agregado");
        }
    }
}