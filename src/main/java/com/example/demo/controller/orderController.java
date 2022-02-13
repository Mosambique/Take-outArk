package com.example.demo.controller;


import com.example.demo.pojo.Order;
import com.example.demo.service.orderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class orderController {

    @Resource
    private orderService orderService;

    /**
     * 查询订单
     * @param phone
     * @return
     */
    @GetMapping("/order/phone/{phone}")
    public Order queryMapperByUserPhone(@PathVariable String phone){
        return orderService.queryOrderByUserPhone(phone);
    }

    /**
     * 查询用户手机号
     * @param id
     * @return
     */
    @GetMapping("/order/user_phone/{id}")
    public String queryUserPhoneByOrder(@PathVariable Integer id){
        return  orderService.queryUserPhoneByOrder(id);
    }


}
