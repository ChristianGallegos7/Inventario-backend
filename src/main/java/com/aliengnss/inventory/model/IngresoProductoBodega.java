package com.aliengnss.inventory.model;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "IngresoProductoBodega")
public class IngresoProductoBodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdIngresoProductoBodega;

    @ManyToOne
    @JoinColumn(name = "IdIngresoBodega")
    private IngresoBodega ingresoBodega;

    @ManyToOne
    @JoinColumn(name = "IdProductoBodega")
    private ProductoBodega productoBodega;

    private Long CantidadIngreso;

    private Date FechaIngreso;

}