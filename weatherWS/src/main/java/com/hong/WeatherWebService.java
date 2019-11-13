/**
 * WeatherWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hong;

public interface WeatherWebService extends javax.xml.rpc.Service {

/**

 */
    public java.lang.String getWeatherWebServiceSoapAddress();

    public com.hong.WeatherWebServiceSoap_PortType getWeatherWebServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.hong.WeatherWebServiceSoap_PortType getWeatherWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
