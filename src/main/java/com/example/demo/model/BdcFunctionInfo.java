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
 * @description ： 功能实体类
 * @date ： 2021/8/12 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "机器部署信息", description = "机器部署相关信息记录")
@Table(name = "bdc_function_info")
public class BdcFunctionInfo implements Serializable {
    @Column(name = "add_time")
    @ApiModelProperty(value = "添加时间", name = "addTime", example = "2021-08-12 12:23:56", dataType = "Date")
    private Date addTime;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
    private Integer id;
    @Column(name = "machine_id", columnDefinition = "机器ID")
    @ApiModelProperty(value = "机器ID", name = "machineId", example = "1001001", dataType = "String")
    private Integer machineId;
    @Column(name = "state", columnDefinition = "功能状态 0:未投入使用 1:已投入使用")
    @ApiModelProperty(value = "功能状态", name = "state", example = "0", dataType = "String")
    private String state;
    @Column(name = "details", columnDefinition = "功能类型")
    @ApiModelProperty(value = "功能类型", name = "details", example = "有房无房", dataType = "String")
    private String details;
    @Column(name = "area_id", columnDefinition = "区域id")
    @ApiModelProperty(value = "区域id", name = "areaId", example = "区域id", dataType = "String")
    private Integer areaId;
    @Column(name = "code", columnDefinition = "功能编号")
    @ApiModelProperty(value = "功能编号", name = "code", example = "功能编号", dataType = "String")
    private String code;
    @Column(name = "machine_sn", columnDefinition = "机器SN号")
    @ApiModelProperty(value = "机器SN号", name = "machineSn", example = "XT00365", dataType = "String")
    private String machineSn;
}
