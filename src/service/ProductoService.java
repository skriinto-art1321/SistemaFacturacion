import java.util.List;

public class ProductoService {

    private ProductoRepository repository =
            new ProductoRepository();

    public void registrarProducto(Producto producto) {
        repository.guardarProducto(producto);
    }

    public List<Producto> obtenerProductos() {
        return repository.listarProductos();
    }
}