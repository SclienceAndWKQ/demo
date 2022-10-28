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
    @Column(name = "address_class")
    @ApiModelProperty(value = "网点具体地址保存级别", name = "addressClass", example = "0:市本级  1:区县  2:乡镇")
    private String addressClass;
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
    @Column(name = "user_id")
    @ApiModelProperty(value = "账户id", name = "userId", example = "1001")
    private String userId;
    @Column(name = "update_time", columnDefinition = "更新时间")
    @ApiModelProperty(value = "更新时间", name = "updateTime", example = "2021-08-12 21:02:26", dataType = "Date")
    private Date updateTime;


}
