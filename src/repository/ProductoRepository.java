package repository;

import java.util.ArrayList;
import java.util.List;
import model.Producto;

public class ProductoRepository {

    private List<Producto> productos = new ArrayList<>();

    public void guardarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> listarProductos() {
        return productos;
    }
}