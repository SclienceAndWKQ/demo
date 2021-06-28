package com.example.demo.service.impl;

import com.example.demo.DemoApplication;
import com.example.demo.core.result.Result;
import com.example.demo.service.ProvinceService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
class ProvinceServiceImplTest {
  @Autowired(required = false)
  private ProvinceService provinceService;

  @Test
  void getProvincesAndCitysAndAreas() {
    Result areas = provinceService.getProvincesAndCitysAndAreas();
    System.out.println(areas);
  }
}
