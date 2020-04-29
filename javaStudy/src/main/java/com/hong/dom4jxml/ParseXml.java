package com.hong.dom4jxml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class ParseXml {
    public static void main(String[] args) throws Exception {
        String filePath = "config.xml";
//        testDom4j1(filePath);
        testDom4j2(filePath);
//        testSax(filePath);


    }

    private static void testSax(String filePath) throws ParserConfigurationException, SAXException, IOException {
        //1.或去SAXParserFactory实例
        SAXParserFactory factory = SAXParserFactory.newInstance();
        //2.获取SAXparser实例
        SAXParser saxParser = factory.newSAXParser();
        //创建Handel对象
        SAXDemoHandel handel = new SAXDemoHandel();
        saxParser.parse(filePath, handel);
    }

    private static void testDom4j2(String filePath) throws DocumentException {
        //1.创建Reader对象
        SAXReader reader = new SAXReader();
        //2.加载xml
        Document document = reader.read(new File(filePath));
        //3.获取根节点
        Element rootElement = document.getRootElement();
        Iterator iterator = rootElement.elementIterator();
        while (iterator.hasNext()) {
            Element stu = (Element) iterator.next();
            List<Attribute> attributes = stu.attributes();
            System.out.println("======获取属性值======");
            for (Attribute attribute : attributes) {
                System.out.println("name = " + attribute.getName() + ";value = " + attribute.getValue());
            }
            System.out.println("======遍历子节点======");
            Iterator iterator1 = stu.elementIterator();
            while (iterator1.hasNext()) {
                Element stuChild = (Element) iterator1.next();
                System.out.println("节点名：" + stuChild.getName() + "-节点值："
                        + stuChild.getStringValue()
                        + "- value = " + stuChild.getNodeType());
            }
        }
    }

    private static void testDom4j1(String filePath) throws DocumentException {
        SAXReader reader = new SAXReader();
        File file = new File(filePath);
        Document document = reader.read(file);
        Element root = document.getRootElement();
        List<Element> childElements = root.elements();
        for (Element child : childElements) {
            List<Attribute> attributeList = child.attributes();
            for (Attribute attr : attributeList) {
                System.out.println("节点名 = " + attr.getName() + ":Value =  " + attr.getValue());
            }

            List<Element> elementList = child.elements();
            for (Element ele : elementList) {
                System.out.println("元素节点名：" + ele.getName() + ": " + ele.getText());
            }
        }
    }
}
