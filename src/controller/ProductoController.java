package controller;

import java.util.List;
import model.Producto;
import service.ProductoService;

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