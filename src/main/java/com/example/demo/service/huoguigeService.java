package com.example.demo.service;

import com.example.demo.dao.huoguigeMapper;
import com.example.demo.pojo.huoguige;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class huoguigeService {

    @Resource
    private huoguigeMapper huoguigeMapper;

    private Lock lock = new ReentrantLock();
    /**
     * 修改货柜格状态
     * @param huoguige
     */
    public void updateHuoguige(huoguige huoguige){

        huoguigeMapper.updateHuoguige(huoguige);
    }

    /**
     * 查询货柜格状态
     * @param container_id
     */
    public List<Integer> queryHuoguige(Integer container_id){
        return huoguigeMapper.queryHuoguige(container_id);
    }


}
