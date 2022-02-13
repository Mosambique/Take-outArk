package com.example.demo.service;

import com.example.demo.dao.deliverymanMapper;
import com.example.demo.pojo.deliveryman;
import com.example.demo.utils.AssertUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class deliverymanService {

    @Resource
    private deliverymanMapper deliverymanMapper;

    /**
     * 查找
     * @param id
     * @return
     */
    public deliveryman queryDeliverymanByDid(String id){
        return deliverymanMapper.queryDeliverymanByDid(id);
    }

    /**
     * 添加
     * @param deliveryman
     */
    public void insertDeliveryman(deliveryman deliveryman){
        AssertUtil.isTrue(StringUtils.isBlank(deliveryman.getId().toString()),"id不能为空");
        AssertUtil.isTrue(StringUtils.isBlank(deliveryman.getName()),"姓名不能为空");
        AssertUtil.isTrue(StringUtils.isBlank(deliveryman.getPhone_number()),"电话不能为空");
        AssertUtil.isTrue(StringUtils.isBlank(deliveryman.getWx_id().toString()),"wx_id不能为空");
        //通过id查询是否存在
        deliveryman temp = deliverymanMapper.queryDeliverymanByDid(deliveryman.getId().toString());
        AssertUtil.isTrue(null != temp,"已存在");
        AssertUtil.isTrue(deliverymanMapper.insertDeliveryman(deliveryman) < 1,"添加失败");
    }

    /**
     * 修改
     * @param deliveryman
     */
    public void updateDeliveryman(deliveryman deliveryman){
        AssertUtil.isTrue(StringUtils.isBlank(deliveryman.getId().toString()),"id不能为空");
        AssertUtil.isTrue(StringUtils.isBlank(deliveryman.getName()),"姓名不能为空");
        AssertUtil.isTrue(StringUtils.isBlank(deliveryman.getPhone_number()),"电话不能为空");
        AssertUtil.isTrue(StringUtils.isBlank(deliveryman.getWx_id().toString()),"wx_id不能为空");
        //通过id查询是否存在
        deliveryman temp = deliverymanMapper.queryDeliverymanByDid(deliveryman.getId().toString());
        AssertUtil.isTrue(null != temp && !(deliveryman.getId().equals(temp.getId())),"已存在");
        AssertUtil.isTrue(deliverymanMapper.updateDeliveryman(deliveryman) < 1,"修改失败");

    }

    /**
     * 删除
     * @param id
     */
   public void deleteDeliveryman(String id){
        deliverymanMapper.deleteDeliveryman(id);
        //AssertUtil.isTrue(null != Did || null == deliverymanMapper.queryDeliverymanByDid(Did),"记录不存在");
        AssertUtil.isTrue(deliverymanMapper.deleteDeliveryman(id) < 1,"删除失败或记录不存在");

    }
}
