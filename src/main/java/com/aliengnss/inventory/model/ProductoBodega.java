package com.aliengnss.inventory.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
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
@Table(name = "ProductoBodega")
public class ProductoBodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdProductoBodega;

    @ManyToOne
    @JoinColumn(name = "IdBodega")
    private Bodega bodega;

    private String NumeroSerie;

    private String NombreProducto;

    private String Descripcion;

    private String Marca;

    private String Modelo;

    private Long Stock;

    @Column(precision = 10, scale = 2)
    private BigDecimal Precio;

    private Date FechaCreacion;

    private Date FechaActualizacion;

    private String UsuarioCreacion;

    private String UsuarioActualizacion;

}
