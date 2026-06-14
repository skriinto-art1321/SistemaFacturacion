package service;

import java.util.List;
import model.Producto;
import repository.ProductoRepository;

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