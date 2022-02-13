package com.example.demo.dao;

import com.example.demo.pojo.deliveryman;

public interface deliverymanMapper {

    deliveryman  queryDeliverymanByDid(String id);

    int insertDeliveryman(deliveryman deliveryman);

    int updateDeliveryman(deliveryman deliveryman);

    int deleteDeliveryman(String id);
}
