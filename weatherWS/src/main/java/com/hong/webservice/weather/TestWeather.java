package com.hong.webservice.weather;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.hong.WeatherWebServiceLocator;
import com.hong.WeatherWebServiceSoap_BindingStub;
//import com.hong.WeatherWebServiceSoapStub;

public class TestWeather {

    public static void main(String[] args) throws ServiceException,
            RemoteException {
        WeatherWebServiceLocator locator = new WeatherWebServiceLocator();
        WeatherWebServiceSoap_BindingStub service = (WeatherWebServiceSoap_BindingStub) locator
                .getPort(WeatherWebServiceSoap_BindingStub.class);
        invokeGetSupportProvince(service);
        System.out.println("...................");
        invokeGetSupportCity(service);
        invokeGetWeatherByOneCity(service);
    }

    // 调用获取支持的省份、州接口
    public static void invokeGetSupportProvince(
            WeatherWebServiceSoap_BindingStub service) throws RemoteException {
        String[] provices = service.getSupportProvince();
        System.out.println("总共" + provices.length + "个");
        int count = 0;
        for (String str : provices) {
            if (0 != count && count % 5 == 0) {
                System.out.println();
            }
            System.out.print(str + "\t");
            count++;
        }
    }

    // 调用获取支持查询某个省份内的城市接口
    public static void invokeGetSupportCity(WeatherWebServiceSoap_BindingStub service)
            throws RemoteException {
        String provinceName = "江苏";
        String[] cities = service.getSupportCity(provinceName);
        System.out.println("总共" + cities.length + "个市");
        for (int i = 0; i < cities.length; i++) {
            if (0 != i && i % 5 == 0) {
                System.out.println();
            }
            System.out.print(cities[i] + "\t");
        }
    }

    // 调用查询某个城市天气的接口
    public static void invokeGetWeatherByOneCity(
            WeatherWebServiceSoap_BindingStub service) throws RemoteException {
        String cityName = "南京";
        String[] weatherInfo = service.getWeatherbyCityName(cityName);
        for (String str : weatherInfo) {
            System.out.println(str);
        }
    }


}
