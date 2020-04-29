package com.hong.jsonTest;

import com.alibaba.fastjson.JSONObject;
import com.hong.javacore.model.DataResourceDTO;
import com.hong.javacore.model.SupportVo;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {
    public static void main(String[] args) {
        List<SupportVo> voList = new ArrayList<>();
        SupportVo vo1 = new SupportVo();
        //SupportVo vo2 = new SupportVo();

        vo1.setId(3L);
        // name of view/index/function
        vo1.setName("test1");
        // 索引
        vo1.setType(1);


        List<DataResourceDTO> dtoList = new ArrayList<>();
        DataResourceDTO dto1 = new DataResourceDTO();
//        DataResourceDTO dto2 = new DataResourceDTO();
        dto1.setHost("192.168.58.215");
//        dto1.setHost("10.139.8.95");
        dto1.setPort(5432);
        dto1.setDbName("quartz");
        dto1.setUsername("postgres");
        dto1.setPassword("postgres");



        dtoList.add(dto1);
        vo1.setDataResourceDtos(dtoList);
        voList.add(vo1);
        System.out.println(JSONObject.toJSONString(voList));
        List<Long> idList = new ArrayList<>();
        idList.add(3L);
        System.out.println(JSONObject.toJSONString(idList));
    }
}
