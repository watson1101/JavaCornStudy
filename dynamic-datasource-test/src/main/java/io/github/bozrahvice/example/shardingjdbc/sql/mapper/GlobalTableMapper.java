package io.github.bozrahvice.example.shardingjdbc.sql.mapper;

import io.github.bozrahvice.example.shardingjdbc.sql.dto.GlobalTableDO;
import org.apache.ibatis.annotations.Param;

public interface GlobalTableMapper {

    int insert(GlobalTableDO globalTableDO) throws Exception;

    int update(GlobalTableDO globalTableDO) throws Exception;

    GlobalTableDO queryByKey(@Param("id") String id) throws Exception;
}
