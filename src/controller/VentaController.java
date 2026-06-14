package controller;

import model.Venta;
import service.VentaService;
import java.util.List;

public class VentaController {

    private VentaService service =
            new VentaService();

    public void registrarVenta(Venta venta) {
        service.registrarVenta(venta);
    }

    public List<Venta> listarVentas() {
        return service.obtenerVentas();
    }
}