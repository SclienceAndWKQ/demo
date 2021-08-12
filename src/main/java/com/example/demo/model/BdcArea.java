package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "区域信息", discriminator = "区域信息")
@Table(name = "bdc_area")
public class BdcArea implements Serializable {

    @Column(name = "address_id")
    @ApiModelProperty(value = "网点具体地址id", name = "addressId", example = "110012")
    private String addressId;
    @Column(name = "area_name")
    @ApiModelProperty(value = "网点名称", name = "areaName", example = "市民中心")
    private String areaName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", name = "id", example = "1")
    private Integer id;
    @Column(name = "create_time", columnDefinition = "创建时间")
    @ApiModelProperty(value = "创建时间", name = "createTime", example = "2021-08-12 21:02:26", dataType = "Date")
    private Date createTime;


}
