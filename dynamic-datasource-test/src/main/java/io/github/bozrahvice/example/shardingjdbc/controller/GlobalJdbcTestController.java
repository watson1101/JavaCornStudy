package io.github.bozrahvice.example.shardingjdbc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bozrahvice.example.shardingjdbc.sql.dao.GlobalTableDAO;
import io.github.bozrahvice.example.shardingjdbc.sql.dto.GlobalTableDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class GlobalJdbcTestController {

    @Autowired
    private GlobalTableDAO globalTableDAO;

    @RequestMapping("/globalTableInsertTest")
    public String globalTableInsertTest(@RequestParam("typeName") String typeName,@RequestParam("typeValue") String typeValue) {
        GlobalTableDO globalTableDO = new GlobalTableDO();
        globalTableDO.setId(UUID.randomUUID().toString().replaceAll("-",""));
        globalTableDO.setTypeValue(typeValue);
        globalTableDO.setTypeName(typeName);
        ObjectMapper mapper = new ObjectMapper();

        try {
            log.info("入参：{}", mapper.writerWithDefaultPrettyPrinter().writeValueAsString(globalTableDO));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        boolean insert = globalTableDAO.insert(globalTableDO);
        return String.valueOf(insert);
    }

    @RequestMapping("/globalTableUpdateTest")
    public String globalTableUpdateTest(@RequestParam("id") String id, @RequestParam("typeName") String typeName, @RequestParam("typeValue") String typeValue) {
        GlobalTableDO globalTableDO = new GlobalTableDO();
        globalTableDO.setId(id);
        globalTableDO.setTypeName(typeName);
        globalTableDO.setTypeValue(typeValue);
        int update = globalTableDAO.update(globalTableDO);
        return String.valueOf(update);
    }

    @RequestMapping("/globalTableQueryTest")
    public String globalTableQueryTest(@RequestParam("id") String id) {
        GlobalTableDO globalTableDO = globalTableDAO.queryByKey(id);
        ObjectMapper mapper = new ObjectMapper();
        String result = null;
        try {
            result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(globalTableDO);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
}