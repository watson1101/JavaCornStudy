package io.github.bozrahvice.example.shardingjdbc.sql.dto;

import lombok.Data;


@Data
public class TestTableDO {

    private String id;

    private String trade;

    private String valueName;

    private String gmtCreate;

    private String gmtModified;

}