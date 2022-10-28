package com.example.demo.service.impl;

import com.example.demo.core.service.AbstractService;
import com.example.demo.model.BdcServiceMsg;
import com.example.demo.service.BdcServiceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ： 185
 * @description ： 设备服务实体类
 * @date ： 2021/5/26 19:57
 */
@Service
@Transactional
public class BdcServiceServiceImpl extends AbstractService<BdcServiceMsg> implements BdcServiceService {

}
