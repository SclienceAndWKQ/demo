package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author ： 185
 * @description ： 部署服务信息记录
 * @date ： 2021/1/29 11:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "机器部署信息", description = "机器部署相关信息记录")
@Table(name = "bdc_service_msg")
public class BdcServiceMsg implements Serializable {
    /**
     * background服务所在磁盘位置
     */
    @Column(name = "background_service_location")
    @ApiModelProperty(value = "background服务所在磁盘位置", name = "backgroundServiceLocation", example = "D:\\resources\\MKBackgroundnt", dataType = "String")
    private String backgroundServiceLocation;
    @Column(name = "background_service_name")
    @ApiModelProperty(value = "background服务名称", name = "backgroundServiceName", example = "MK-Background-CDJ", dataType = "String")
    private String backgroundServiceName;
    @Column(name = "background_url")
    @ApiModelProperty(value = "后台地址", name = "backgroundUrl", example = "http://192.168.0.61:8800", dataType = "String")
    private String backgroundUrl;
    /**
     * 部署时间
     */
    @Column(name = "deploy_time")
    private Date deployTime;
    @Column(name = "fore_end_url")
    @ApiModelProperty(value = "前端地址", name = "foreEndUrl", example = "http://192.168.0.61:7070/dzj", dataType = "String")
    private String foreEndUrl;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
    private Integer id;

    @Column(name = "management_system_url")
    @ApiModelProperty(value = "管理系统登录地址", name = "managementSystemUrl", example = "http://192.168.0.61:7070/htgl", dataType = "String")
    private String managementSystemUrl;
    /**
     * nginx服务所在磁盘位置
     */
    @Column(name = "nginx_service_location")
    @ApiModelProperty(value = "nginx服务所在磁盘位置", name = "nginxServiceLocation", example = "D:\\MOKE\\nginx-1.15.0", dataType = "String")
    private String nginxServiceLocation;
    @Column(name = "nginx_service_name")
    @ApiModelProperty(value = "nginx服务名称", name = "nginxServiceName", example = "MK-Background-CDJ", dataType = "String")
    private String nginxServiceName;

    @Column(name = "server_id")
    @ApiModelProperty(value = "服务器id", name = "serverId", example = "1001", dataType = "String")
    private String serverId;

}
