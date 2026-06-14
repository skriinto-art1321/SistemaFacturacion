package service;

import model.Venta;
import repository.VentaRepository;
import java.util.List;

public class VentaService {

    private VentaRepository repository =
            new VentaRepository();

    public void registrarVenta(Venta venta) {
        repository.guardarVenta(venta);
    }

    public List<Venta> obtenerVentas() {
        return repository.listarVentas();
    }
}