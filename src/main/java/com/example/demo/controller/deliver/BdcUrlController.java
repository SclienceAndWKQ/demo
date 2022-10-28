package com.example.demo.controller.deliver;

import com.alibaba.fastjson.JSON;
import com.example.demo.core.result.Result;
import com.example.demo.core.result.ResultGenerator;
import com.example.demo.core.utils.StringUtils;
import com.example.demo.model.BdcInterfaceUrl;
import com.example.demo.service.BdcInterfaceUrlService;
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
 * @description ： 接口地址信息
 * @date ： 2022/4/8 14:01
 */
@Api(value = "接口地址信息", tags = "接口地址信息处理")
@RestController
@RequestMapping("/bdc/deliver/url")
public class BdcUrlController {
  private static final Logger logger = LoggerFactory.getLogger(BdcUrlController.class);

  @Resource
  private BdcInterfaceUrlService bdcInterfaceUrlService;

  /**
   * 根据设备sn获取该设备所部属服务的相关接口地址信息
   *
   * @param url 设备id
   * @return 接口地址信息
   */
  @ApiOperation(value = "根据设备sn获取该设备所部属服务的相关接口地址信息")
  @RequestMapping(value = "/getUrlByMachineSn", method = RequestMethod.POST)
  private Result getUrlByMachineSn(@RequestBody BdcInterfaceUrl url) {
    logger.info("获取指定网点设备的交付信息,传入参数:{}", JSON.toJSONString(url));
    if (StringUtils.isEmpty(url.getMachineSn())) {
      return ResultGenerator.genFailResult("请核查条件信息!");
    }
    Condition condition = new Condition(BdcInterfaceUrl.class);
    Example.Criteria criteria = condition.createCriteria();
    criteria.orEqualTo("machineSn", url.getMachineSn());
    List<BdcInterfaceUrl> urlList = bdcInterfaceUrlService.findByCondition(condition);
    return ResultGenerator.genSuccessResult(urlList);
  }

  /**
   * 批量添加某设备的接口地址信息
   *
   * @param urlVo 接口信息
   * @return 是否入库成功
   */
  @ApiOperation(value = "批量添加某设备的接口地址信息")
  @RequestMapping(value = "/insertUrl", method = RequestMethod.POST)
  private Result insertUrl(@RequestBody BdcDeliverRequestVo<BdcInterfaceUrl> urlVo) {
    logger.info("前端传入参数:{}", JSON.toJSONString(urlVo));
    List<BdcInterfaceUrl> urls = urlVo.getVo();
    Date date = new Date();
    urls.forEach(url -> {
      url.setUpdateTime(date);
      url.setRecordTime(date);
    });
    bdcInterfaceUrlService.save(urls);
    return ResultGenerator.genSuccessResult();
  }

  /**
   * 根据ID更新某设备的接口地址信息
   *
   * @param bdcInterfaceUrl 接口信息
   * @return 是否更新成功
   */
  @ApiOperation(value = "根据ID更新某设备的接口地址信息")
  @RequestMapping(value = "/updateUrl", method = RequestMethod.POST)
  private Result updateUrl(@RequestBody BdcInterfaceUrl bdcInterfaceUrl) {
    logger.info("前端传入参数:{}", JSON.toJSONString(bdcInterfaceUrl));
    bdcInterfaceUrl.setUpdateTime(new Date());
    bdcInterfaceUrlService.update(bdcInterfaceUrl);
    return ResultGenerator.genSuccessResult();
  }
}
