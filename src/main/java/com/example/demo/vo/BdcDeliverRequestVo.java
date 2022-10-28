package com.example.demo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author ： 185
 * @description ： 交付请求数据实体
 * @date ： 2022/4/14 11:11
 */
@Data
@ApiModel("请求数据")
public class BdcDeliverRequestVo<T> implements Serializable {
  @ApiModelProperty(value = "机器id", name = "machineId", example = "11111")
  private String machineId;
  @ApiModelProperty(value = "机器sn号", name = "machineSn", example = "XT000689")
  private String machineSn;
  /**
   * 备用字段，存储额外定制化数据
   */
  @ApiModelProperty(value = "备用字段，存储额外定制化数据")
  private Map<String, Object> map;
  /**
   * 查询人（不包含被委托人）
   */
  @ApiModelProperty(value = "查询实体", dataType = "List")
  private List<T> vo;


}
