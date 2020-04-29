package com.hong.javacore.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * 规则支撑视图实体
 *
 * @author chenlei
 */
@Data
@ToString
public class SupportVo implements Serializable {
    private static final long serialVersionUID = -4765881017029815594L;

    protected Long id;

    /**
     * 函数视图索引的名称
     */
    private String name;

    /**
     * 函数、视图、索引SQL
     */
    private String content;

    private Integer status;

    /**
     * 支撑类型
     *
     */

    private Integer type;

    /**
     * 报错信息
     */
    private String description;

    /**
     * 规则支撑绑定的数据源
     */
    private List<DataResourceDTO> dataResourceDtos;

    private String createTime;

    private String updateTime;

    public SupportVo() {
    }

}