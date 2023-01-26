package io.github.bozrahvice.example.shardingjdbc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bozrahvice.example.shardingjdbc.sql.dao.MasterSlaveTestTableDAO;
import io.github.bozrahvice.example.shardingjdbc.sql.dto.TestTableDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@Slf4j
public class MasterSlaveJdbcTestController {

    @Autowired
    private MasterSlaveTestTableDAO masterSlaveTestTableDAO;


    @RequestMapping("/masterSlaveTableInsertTest")
    public String masterSlaveTableInsertTest(@RequestParam("valueName") String valueName) {
        TestTableDO testTableDO = new TestTableDO();
        testTableDO.setId(UUID.randomUUID().toString().replaceAll("-",""));
        testTableDO.setTrade(UUID.randomUUID().toString().replaceAll("-",""));
        testTableDO.setValueName(valueName);
        ObjectMapper mapper = new ObjectMapper();

        try {
            log.info("入参：{}", mapper.writerWithDefaultPrettyPrinter().writeValueAsString(testTableDO));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        boolean insert = masterSlaveTestTableDAO.insert(testTableDO);
        return String.valueOf(insert);
    }

    @RequestMapping("/masterSlaveTableUpdateTest")
    public String masterSlaveTableUpdateTest(@RequestParam("id") String id,@RequestParam("valueName") String valueName) {
        TestTableDO testTableDO = new TestTableDO();
        testTableDO.setId(id);
        testTableDO.setValueName(valueName);
        int update = masterSlaveTestTableDAO.update(testTableDO);
        return String.valueOf(update);
    }

    @RequestMapping("/masterSlaveTableQueryTest")
    public String masterSlaveTableQueryTest(@RequestParam("id") String id) {
        TestTableDO testTableDO = masterSlaveTestTableDAO.queryByKey(id);
        ObjectMapper mapper = new ObjectMapper();
        String result = null;
        try {
            result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(testTableDO);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

}