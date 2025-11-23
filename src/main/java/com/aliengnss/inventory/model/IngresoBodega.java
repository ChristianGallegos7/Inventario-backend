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
@Table(name = "IngresoBodega")
public class IngresoBodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdIngresoBodega;
    
    @ManyToOne
    @JoinColumn(name = "IdBodega")
    private Bodega bodega;

    private String NumeroSerie;

    private String NombreProducto;

    private String Descripcion;

    private String Marca;

    private String Modelo;

    private Long Cantidad;

    private String MedioTransporte;

    private Date FechaIngreso;

    private String UsuarioIngreso;

    private String UsurioRecepta;

    private String Observacion;
}
