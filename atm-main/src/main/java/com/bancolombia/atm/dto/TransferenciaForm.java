package com.bancolombia.atm.dto;
import lombok.Data;

@Data
public class TransferenciaForm {
    private String cuentaOrigen;
    private String cuentaDestino;
    private double monto;
    
}
