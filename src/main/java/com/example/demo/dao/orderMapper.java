package com.example.demo.dao;

import com.example.demo.pojo.Order;

public interface orderMapper {

    Order queryOrderByUserPhone(String phone);

    String queryUserPhoneByOrder(Integer id);


}
