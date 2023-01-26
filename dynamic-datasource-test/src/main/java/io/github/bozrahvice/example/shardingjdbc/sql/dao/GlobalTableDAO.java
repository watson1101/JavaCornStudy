package io.github.bozrahvice.example.shardingjdbc.sql.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bozrahvice.example.shardingjdbc.sql.dto.GlobalTableDO;
import io.github.bozrahvice.example.shardingjdbc.sql.mapper.GlobalTableMapper;
import io.github.bozrahvice.shardingjdbc.annotation.DS;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository
@DS(value = "testDB")
@Slf4j
public class GlobalTableDAO {

    @Resource
    private GlobalTableMapper globalTableMapper;

    public boolean insert(GlobalTableDO globalTableDO) {
        try {
            return 1 == globalTableMapper.insert(globalTableDO);
        } catch (Exception e) {
            log.error("insert data error", e);
            return false;
        }
    }

    public int update(GlobalTableDO globalTableDO) {
        int update = 0;
        try {
            update = globalTableMapper.update(globalTableDO);
        } catch (Exception e) {
            log.error("update data error", e);
        }
        log.info("update data change row :{}", update);
        return update;
    }

    public GlobalTableDO queryByKey(String id) {
        GlobalTableDO globalTableDO = null;
        try {
            globalTableDO = globalTableMapper.queryByKey(id);
            ObjectMapper mapper = new ObjectMapper();
            log.info("query data result :{}", mapper.writerWithDefaultPrettyPrinter().writeValueAsString(globalTableDO));
        } catch (Exception e) {
            log.error("query data error", e);
        }
        return globalTableDO;
    }

}