package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author ： 185
 * @description ：
 * @date ： 2021/1/28 16:57
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "客戶端信息", description = "客戶端信息记录")
@Table(name = "bdc_pc_client")
public class BdcPcClient {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "客户端id", name = "id", example = "1001", dataType = "Integer")
  private Integer id;
  @Column(name = "edition", columnDefinition = "客户端版本")
  @ApiModelProperty(value = "客户端版本", name = "edition", example = "1.0.9.4", dataType = "String")
  private String edition;
  @Column(name = "machine_id", columnDefinition = "机器ID")
  @ApiModelProperty(value = "机器ID", name = "machineId", example = "cdj1001001", dataType = "String")
  private String machineId;
  @Column(name = "type", columnDefinition = "客户端类型（黑窗口、百度、虹软、汉威信）")
  @ApiModelProperty(value = "客户端类型", name = "type", example = "虹软客户端", dataType = "String")
  private String type;
  @Column(name = "is_customized", columnDefinition = "是否定制 0：是  1：否")
  @ApiModelProperty(value = "是否定制", name = "isCustomized", example = "是", dataType = "String")
  private String isCustomized;
 @Column(name = "custom_content", columnDefinition = "定制方案、内容 eg：分户图宗地图内容以二维码方式展示在附记页")
  @ApiModelProperty(value = "定制内容", name = "customContent", example = "分户图宗地图内容以二维码方式展示在附记页", dataType = "String")
  private String customContent;

}
