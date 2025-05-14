package com.bancolombia.atm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bancolombia.atm.entity.Cuenta;
import com.bancolombia.atm.entity.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
   List<Movimiento> findByCuenta(Cuenta cuenta);
   List<Movimiento> findByCuentaOrderByFechaDesc(Cuenta cuenta);

}
