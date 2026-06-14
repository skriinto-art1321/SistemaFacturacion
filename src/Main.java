import controller.ProductoController;
import model.Producto;

public class Main {

    public static void main(String[] args) {

        ProductoController controller =
                new ProductoController();

        Producto producto =
                new Producto(
                        "P001",
                        "Laptop",
                        2500.00,
                        10
                );

        controller.registrarProducto(producto);

        System.out.println(
                "Producto registrado correctamente");
    }
}