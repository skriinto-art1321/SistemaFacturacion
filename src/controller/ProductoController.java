import java.util.List;

public class ProductoController {

    private ProductoService service =
            new ProductoService();

    public void registrarProducto(Producto producto) {
        service.registrarProducto(producto);
    }

    public List<Producto> listarProductos() {
        return service.obtenerProductos();
    }
}