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
 * @description ：机器激活信息记录
 * @date ： 2021/08/12 21:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "激活信息记录", description = "激活信息记录")
@Table(name = "bdc_activation_msg")
public class BdcActivationMsg implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
    private Integer id;
    @Column(name = "machine_id", columnDefinition = "机器ID")
    @ApiModelProperty(value = "机器ID", name = "machineId", example = "1001001", dataType = "String")
    private String machineId;
    @Column(name = "type", columnDefinition = "激活类型")
    @ApiModelProperty(value = "激活类型", name = "type", example = "虹软激活", dataType = "String")
    private String type;
    @Column(name = "code", columnDefinition = "激活码")
    @ApiModelProperty(value = "激活码", name = "code", example = "ERDW-21RT-YHWC-HTAC", dataType = "String")
    private String code;
    @Column(name = "remarks", columnDefinition = "备注")
    @ApiModelProperty(value = "备注", name = "remarks", example = "硬件指纹码：ERDW21RERDW21RTYHWCHTACTYHWCHTAC", dataType = "String")
    private String remarks;
    @Column(name = "activation_time", columnDefinition = "激活时间")
    @ApiModelProperty(value = "激活时间", name = "activationTime", example = "2021-08-12 21:02:26", dataType = "Date")
    private Date activationTime;

}
