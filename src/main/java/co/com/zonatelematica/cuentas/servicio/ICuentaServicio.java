package co.com.zonatelematica.cuentas.servicio;

import co.com.zonatelematica.cuentas.modelo.Cuenta;
import java.util.List;

public interface ICuentaServicio {
    public List<Cuenta> listarCuentas();

    public Cuenta buscarCuentaPorId(Integer idCuenta);

    public void guardarCuenta(Cuenta cuenta);

    public void eliminarCuenta(Cuenta cuenta);


}
