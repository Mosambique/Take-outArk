package com.example.demo.dao;

import com.example.demo.pojo.huoguige;

import java.util.List;

public interface huoguigeMapper {

    int updateHuoguige(huoguige huoguige);

    huoguige getHuoguige_bgs(Integer id,Integer container_id);

    List<Integer> queryHuoguige(Integer container_id);
}
