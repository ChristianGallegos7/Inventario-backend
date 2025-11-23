package com.aliengnss.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Bodega")
public class Bodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdBodega;

    private String Descripcion;
    
    private String Ciudad;

    private String Direccion;

    private String LatitudGps;

    private String LongitudGps;

    private String Responsable;

    private String Estado;

    private String Observacion;
}
