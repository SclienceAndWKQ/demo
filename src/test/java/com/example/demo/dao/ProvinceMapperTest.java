package com.example.demo.dao;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.DemoApplication;
import com.example.demo.model.Province;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
public class ProvinceMapperTest {
  @Autowired(required = false)
  private ProvinceMapper provinceMapper;

  @Test
  public void getAllAreas() {
    List<Province> allAreas = provinceMapper.getProvincesAndCitysAndAreas();
    String s = JSON.toJSONString(allAreas);
    System.out.println(s);
  }

  @Test
  public void getAreasByAddressId() {

    System.out.println("{\\\"head\\\":{\\\"message\\\":\\\"未找到匹配的证照信息\\\",\\\"status\\\":\\\"10\\\"},\\\"data\\\":{}}");
  }

}
