package repository;

import model.Venta;
import java.util.ArrayList;
import java.util.List;

public class VentaRepository {

    private List<Venta> ventas = new ArrayList<>();

    public void guardarVenta(Venta venta) {
        ventas.add(venta);
    }

    public List<Venta> listarVentas() {
        return ventas;
    }
}