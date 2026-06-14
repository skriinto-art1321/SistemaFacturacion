public class Main {

    public static void main(String[] args) {

        ProductoController controller =
                new ProductoController();

        Producto producto =
                new Producto();

        controller.registrarProducto(producto);

        System.out.println(
                "Producto registrado correctamente");
    }
}