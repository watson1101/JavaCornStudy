package com.hong.webservice.weather;

import com.hong.WeatherWebServiceLocator;
import com.hong.WeatherWebServiceSoap_BindingStub;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
//import com.hong.WeatherWebServiceSoapStub;

public class TestWeatherAuto {

    public static void main(String[] args) throws ServiceException,
            RemoteException {
        WeatherWebServiceLocator locator = new WeatherWebServiceLocator();
        WeatherWebServiceSoap_BindingStub service = (WeatherWebServiceSoap_BindingStub) locator
                .getPort(WeatherWebServiceSoap_BindingStub.class);
        String[] provices = invokeGetSupportProvince(service);
        while(true){
            for (String str : provices) {
                System.out.println("当前省份："+str);
                String[] cities = invokeGetSupportCity(service,str);
                for (int i = 0; i < cities.length; i++) {
                    String city = cities[i];
                    System.out.println("当前城市："+city);// city = "上海 (58367)" ; 需要取出城市名
                    //invokeGetWeatherByOneCity(service,city.split(" ")[0]);
                    String cityName = city.split(" ")[0].trim();
                    invokeGetWeatherByOneCity(service,cityName);
                    try {
                        System.out.println();
                        int time = (int)Math.random()*1000+ 1000;
                        System.out.println("system wait for "+time+"ms...");
                        System.out.println();
                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // 调用获取支持的省份、州接口
    public static String[] invokeGetSupportProvince(
            WeatherWebServiceSoap_BindingStub service) throws RemoteException {
        String[] provices = service.getSupportProvince();
        System.out.println("总共" + provices.length + "个");

        return provices;
    }

    // 调用获取支持查询某个省份内的城市接口
    public static String[] invokeGetSupportCity(WeatherWebServiceSoap_BindingStub service, String provinceName)
            throws RemoteException {
        // String provinceName = "江苏";
        String[] cities = service.getSupportCity(provinceName);
        System.out.println(provinceName+"  总共" + cities.length + "个市");

        return cities;
    }

    // 调用查询某个城市天气的接口
    public static void invokeGetWeatherByOneCity(
            WeatherWebServiceSoap_BindingStub service, String cityName) throws RemoteException {
        //String cityName = "南京";
        String[] weatherInfo = service.getWeatherbyCityName(cityName);
        for (String str : weatherInfo) {
            System.out.println(str);
        }
    }


}
