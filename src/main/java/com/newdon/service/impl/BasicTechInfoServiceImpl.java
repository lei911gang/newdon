package com.newdon.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.newdon.entity.BasicTechInfo;
import com.newdon.entity.NewdonCustomer;
import com.newdon.mapper.BasicTechInfoMapper;
import com.newdon.mapper.NewdonCustomerMapper;
import com.newdon.service.BasicTechInfoService;
import com.newdon.service.NewdonCustomerService;
import org.springframework.stereotype.Service;

@Service
public class BasicTechInfoServiceImpl extends ServiceImpl<BasicTechInfoMapper, BasicTechInfo> implements BasicTechInfoService {

}
