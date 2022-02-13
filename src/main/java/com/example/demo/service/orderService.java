package com.example.demo.service;

import com.example.demo.dao.orderMapper;
import com.example.demo.pojo.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class orderService {
    @Resource
    private orderMapper orderMapper;

    /**
     * 查询订单通过手机号
     * @param phone
     * @return
     */
    public Order queryOrderByUserPhone(String phone){
        return orderMapper.queryOrderByUserPhone(phone);
    }

    /**
     * 查询用户手机号
     * @param id
     * @return
     */
    public String queryUserPhoneByOrder(Integer id){
        return orderMapper.queryUserPhoneByOrder(id);
    }

}
