package io.github.bozrahvice.example.shardingjdbc.sql.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bozrahvice.example.shardingjdbc.sql.dto.TestTableDO;
import io.github.bozrahvice.example.shardingjdbc.sql.mapper.TestTableMapper;
import io.github.bozrahvice.shardingjdbc.annotation.DS;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository
@DS(value = "testDB")
@Slf4j
public class TestTableDAO {

    @Resource
    private TestTableMapper testTableMapper;

    public boolean insert(TestTableDO testTableDO) {
        try {
            return 1 == testTableMapper.insert(testTableDO);
        } catch (Exception e) {
            log.error("insert data error", e);
            return false;
        }
    }

    public int update(TestTableDO testTableDO) {
        int update = 0;
        try {
            update = testTableMapper.update(testTableDO);
        } catch (Exception e) {
            log.error("update data error", e);
        }
        log.info("update data change row :{}", update);
        return update;
    }

    public TestTableDO queryByKey(String id) {
        TestTableDO testTableDO = null;
        try {
            testTableDO = testTableMapper.queryByKey(id);
            ObjectMapper mapper = new ObjectMapper();
            log.info("query data result :{}", mapper.writerWithDefaultPrettyPrinter().writeValueAsString(testTableDO));
        } catch (Exception e) {
            log.error("query data error", e);
        }
        return testTableDO;
    }

}