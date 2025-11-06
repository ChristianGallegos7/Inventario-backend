package com.aliengnss.inventory.dtos;

import java.util.Date;

import lombok.Data;

@Data
public class DtoCategoryCreate {
    private String name;
    private String description;
    private Date fechaCreacion;
}
