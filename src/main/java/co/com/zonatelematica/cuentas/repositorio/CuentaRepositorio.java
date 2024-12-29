package co.com.zonatelematica.cuentas.repositorio;

import co.com.zonatelematica.cuentas.modelo.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepositorio extends JpaRepository <Cuenta , Integer>{
}
