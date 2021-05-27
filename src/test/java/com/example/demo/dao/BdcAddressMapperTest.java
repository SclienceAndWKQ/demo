package com.example.demo.dao;


import com.example.demo.DemoApplication;
import com.example.demo.model.BdcAddress;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
public class BdcAddressMapperTest {
  @Autowired(required = false)
  private BdcAddressMapper addressMapper;

  @Test
  public void getAddressByAreaId() {
    BdcAddress address = addressMapper.getAddressByAreaId("1");
    System.out.println("------" + address);
  }

  @Test
  public void getAreasByAddressId() {

    System.out.println("{\\\"head\\\":{\\\"message\\\":\\\"未找到匹配的证照信息\\\",\\\"status\\\":\\\"10\\\"},\\\"data\\\":{}}");
  }

}
