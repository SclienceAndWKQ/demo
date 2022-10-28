package com.example.demo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author ： 185
 * @description ： 对机器相关信息记录
 * @date ： 2021/8/12 9:17
 */
@ApiModel(value = "机器对象", description = "机器信息")
@Data
public class BdcMachineInfoVo implements Serializable {
    /**
     * 设备所在区域(网点)
     */
    @ApiModelProperty(value = "区域ID", name = "areaId", example = "1")
    private Integer areaId;


    @ApiModelProperty(value = "id", name = "id", example = "1")
    private Integer id;
    /**
     * 安装部署时间
     */
    @ApiModelProperty(value = "部署时间", name = "installTime", example = "2019-11-21")
    private Date installTime;
    /**
     * 更新信息时间
     */
    @ApiModelProperty(value = "更新信息时间", name = "updateTime", example = "2019-11-21")
    private Date updateTime;
    /**
     * 自动门类型
     */
    @ApiModelProperty(value = "自动门类型", name = "automaticDoorType", example = "电吸门")
    private String automaticDoorType;
    /**
     * 机器ip
     */
    @ApiModelProperty(value = "机器ip", name = "machineIp", example = "192.168.0.1")
    private String machineIp;
    /**
     * 打印机类型
     */
    @ApiModelProperty(value = "打印机类型", name = "printerType", example = "惠普")
    private String printerType;

    /**
     * 盖章机型号
     */
    @ApiModelProperty(value = "盖章机类型", name = "stampType", example = "兆伟")
    private String stampType;
    /**
     * 机器型号
     */
    @ApiModelProperty(value = "机器型号", name = "type", example = "8086")
    private String type;

    /**
     * OCR类型（百度、之元）
     */
    @ApiModelProperty(value = "OCR类型（百度、之元）", name = "ocrType", example = "RD21-FRSX-RSFD-42HN")
    private String ocrType;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", name = "remarks", example = "机器运行良好！")
    private String remarks;
    /**
     * 人证比对类型（搜狗、百度、虹软）
     */
    @ApiModelProperty(value = "人证比对类型（搜狗、百度、虹软）", name = "rzbdType", example = "虹软")
    private String rzbdType;
    /**
     * 所属服务ID
     */
    @ApiModelProperty(value = "部署的服务ID", name = "serviceId", example = "1001")
    private String serviceId;
    /**
     * 机器唯一标识 SN
     */
    @ApiModelProperty(value = "机器唯一标识 SN", name = "machineSn", example = "YT1026561")
    private String machineSn;
    /**
     * 设备状态。0:正常;1：故障;2:报废
     */
    @ApiModelProperty(value = "设备状态(0:正常;1：故障;2:报废)", name = "state", example = "0")
    private String state;

    /**
     * 设备功能。
     * 0:查档机    1:证明机    2:申报  3:证书机  4:缴费机  5:智能问答
     * 6:视频通话  7:办事指南  8:网签  9:发证柜  10:pad
     */
    @ApiModelProperty(value = "设备功能", name = "machineFunction", example = "0")
    private String machineFunction;
    /**
     * 设备CPU
     */
    @ApiModelProperty(value = "设备cpu", name = "machineCpu", example = "8")
    private String machineCpu;
    /**
     * 设备内存
     */
    @ApiModelProperty(value = "设备内存", name = "machineRam", example = "90")
    private String machineRam;
    /**
     * 设备硬盘
     */
    @ApiModelProperty(value = "设备硬盘", name = "machineDisk", example = "90")
    private String machineDisk;
    /**
     * 进纸盒个数
     */
    @ApiModelProperty(value = "进纸盒个数", name = "cartonNum", example = "5")
    private String cartonNum;
    /**
     * 发证柜个数
     */
    @ApiModelProperty(value = "发证柜个数", name = "cabinetNum", example = "5")
    private String cabinetNum;
    /**
     * 设备id
     */
    @ApiModelProperty(value = "设备id", name = "machineId", example = "10005")
    private String machineId;
    /**
     * 设备Mac
     */
    @ApiModelProperty(value = "设备Mac", name = "machineMac", example = "5")
    private String machineMac;
    /**
     * 人证比对阈值
     */
    @ApiModelProperty(value = "人证比对阈值", name = "comparethreshold", example = "5")
    private String compareThreshold;
    /**
     * 继电器ip
     */
    @ApiModelProperty(value = "继电器ip", name = "relayIp", example = "5")
    private String relayIp;
    /**
     * 地址
     */
    @ApiModelProperty(value = "地址", name = "location", example = "河南省开封市")
    private String location;




}
