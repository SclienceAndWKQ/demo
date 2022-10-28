package com.example.demo.controller.deliver;

import com.alibaba.fastjson.JSON;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.model.BdcPcClient;
import com.example.demo.service.BdcPcClientService;
import com.example.demo.vo.BdcDeliverRequestVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author ： 185
 * @description ： 客户端信息处理
 * @date ： 2022/4/8 13:55
 */

@Api(value = "客户端信息", tags = "客户端信息处理接口")
@RestController
@RequestMapping("/bdc/deliver/pcclient")
public class BdcPcClientController {
  private static final Logger logger = LoggerFactory.getLogger(BdcPcClientController.class);
  @Resource
  private BdcPcClientService bdcPcClientService;

  /**
   * 根据设备sn获取设备客户端信息
   *
   * @param pcClientVo 客户端信息
   * @return 客户端信息
   */
  @ApiOperation(value = "根据设备sn获取设备客户端信息")
  @RequestMapping(value = "/getPcClientByMachineSn", method = RequestMethod.POST)
  private Result getPcClientByMachineSn(@RequestBody BdcDeliverRequestVo<BdcPcClient> pcClientVo) {
    logger.info("获取指定网点设备的交付信息,传入参数:{}", JSON.toJSONString(pcClientVo));
    if (StringUtils.isEmpty(pcClientVo.getMachineSn())) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(BdcPcClient.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("machineSn", pcClientVo.getMachineSn());
    List<BdcPcClient> pcClientList = bdcPcClientService.findByCondition(condition);
    return ResultGenerator.genSuccessResult(pcClientList);
  }

  /**
   * 新增设备客户端信息
   *
   * @param bdcPcClient 客户端信息
   * @return 是否入库成功
   */
  @ApiOperation(value = "新增设备客户端信息")
  @RequestMapping(value = "/insertPcClient", method = RequestMethod.POST)
  private Result insertPcClient(@RequestBody BdcPcClient bdcPcClient) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcPcClient));
    Date date = new Date();
    bdcPcClient.setRecordTime(date);
    bdcPcClient.setUpdateTime(date);
    bdcPcClientService.save(bdcPcClient);
    return ResultGenerator.genSuccessResult();
  }

  /**
   * 更新设备客户端信息
   *
   * @param bdcPcClient 客户端信息
   * @return 是否更新成功
   */
  @ApiOperation(value = "更新设备客户端信息")
  @RequestMapping(value = "/updatePcClient", method = RequestMethod.POST)
  private Result updatePcClient(@RequestBody BdcPcClient bdcPcClient) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcPcClient));
    bdcPcClient.setUpdateTime(new Date());
    bdcPcClientService.update(bdcPcClient);
    return ResultGenerator.genSuccessResult();
  }
}
