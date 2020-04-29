package com.hong.javacore.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

// 数据源详情信息
@Data
@ToString
public class DataResourceDTO implements Serializable {
    private static final long serialVersionUID = -4161638281338248249L;

    private Long id;

    private String connectName;

    private String host;

    private Integer port;

    private String username;

    private String password;

    private String dbName;

    private String protocolType;

    private String connectMode;

    /**
     * 数据库类型
     */
    private String dataType;

    private String ascription;
    /**
     * 描述 非必填
     */
    private String describe;


    private long createTime;

    private int rules;


    private String url;

    /**
     * zookeeperUrl
     */
    private String zookeeperUrl;

    /**
     * zk port
     */
    private Integer zookeeperPort;

    private String kafkaVersion;
    /**
     * brokerURL 说明：替代原kafka数据源管理中的host，分解为 kafkaBrokerUrl 和 kafkaBrokerPort
     */
    private String kafkaBrokerUrl;

    /**
     * BrokerPort
     */
    private Integer kafkaBrokerPort;

    /**
     * host mapping
     */
    private String kafkaHostMapping;

    /**
     * authentication mode, "none" or "kerberos"
     */
    private String kafkaAuthMode;

    /**
     * principal name
     */
    private String kafkaPrincipalName;
    /**
     * Service name
     */
    private String kafkaServiceName;

    /**
     * keytab (file)
     * 上传的keytab文件的路径+文件名
     */
    private String kafkaKeyTab;
    //private MultipartFile kafkaKeyTabFile;
    /**
     * Krb5Conf
     * 上传的krb5.conf文件的路径+文件名
     */
    private String kafkaKrb5Conf;

    /**
     * ElasticSearch 集群名称
     */
    private String clusterName;

    /**
     * ES的索引
     */
    private String esIndex;

    /**
     * ES的类型
     */
    private String esType;

}
