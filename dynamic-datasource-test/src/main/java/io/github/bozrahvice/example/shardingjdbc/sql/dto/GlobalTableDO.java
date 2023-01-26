package io.github.bozrahvice.example.shardingjdbc.sql.dto;

import lombok.Data;

@Data
public class GlobalTableDO {

    private String id;

    private String typeValue;

    private String typeName;

    private String gmtCreate;

    private String gmtModified;
}