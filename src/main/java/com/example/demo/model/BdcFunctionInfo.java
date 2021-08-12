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
    private String machineId;
    @Column(name = "state", columnDefinition = "功能状态 0:未投入使用 1:已投入使用")
    @ApiModelProperty(value = "功能状态", name = "state", example = "0", dataType = "String")
    private String state;
    @Column(name = "type", columnDefinition = "功能类型")
    @ApiModelProperty(value = "功能类型", name = "type", example = "有房无房", dataType = "String")
    private String type;

}
