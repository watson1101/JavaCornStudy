package io.github.bozrahvice.example.shardingjdbc.sql.mapper;

import io.github.bozrahvice.example.shardingjdbc.sql.dto.TestTableDO;
import org.apache.ibatis.annotations.Param;


public interface TestTableMapper {

    int insert(TestTableDO testTableDO) throws Exception;

    int update(TestTableDO testTableDO) throws Exception;

    TestTableDO queryByKey(@Param("id") String id) throws Exception;
}
