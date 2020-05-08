package com.hong.csvFile;

import com.csvreader.CsvReader;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author cmss-hong
 */
//@Slf4j
public class CsvFileUtils {
    public static List<Map<String, Object>> parsingCsv(String filePath) {
        List<Map<String, Object>> dataList = new ArrayList<>();
        Map<String, Object> map = null;

        CsvReader reader = null;
        try {
            filePath = "../csv/";
            String fileName = "aa.csv";
            //以“|”作为分隔符
            reader = new CsvReader(filePath + fileName, '|', Charset.forName("UTF-8"));
            //读取表头
            reader.readHeaders();
            while (reader.readRecord()) {
                for(int i = 0;i< reader.getColumnCount();i++){
                    System.out.println(reader.get(i));
                }
                String rawRecord = reader.getRawRecord();
                List<String> rawList = Arrays.asList(rawRecord.split("\\|"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            reader.close();
        }
        return dataList;
    }

    public static void main(String[] args) {
        List<Map<String, Object>> list = parsingCsv(null);
        //System.out.println(list.size());
    }
}



