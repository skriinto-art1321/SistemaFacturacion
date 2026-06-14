import controller.ProductoController;
import controller.VentaController;
import model.Producto;
import model.Venta;

public class Main {

    public static void main(String[] args) {

        ProductoController productoController =
                new ProductoController();

        Producto producto =
                new Producto(
                        "P001",
                        "Laptop",
                        2500.00,
                        10
                );

        productoController.registrarProducto(producto);

        VentaController ventaController =
                new VentaController();

        Venta venta =
                new Venta();

        ventaController.registrarVenta(venta);

        System.out.println(
                "Producto y venta registrados correctamente");
    }
}