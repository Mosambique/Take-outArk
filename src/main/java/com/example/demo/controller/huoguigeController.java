package com.example.demo.controller;

import com.example.demo.exception.ParamsException;
import com.example.demo.pojo.deliveryman;
import com.example.demo.pojo.huoguige;
import com.example.demo.service.huoguigeService;
import com.example.demo.service.orderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RestController
public class huoguigeController {

    @Resource
    private huoguigeService huoguigeService;
    @Resource
    private orderService orderService;

    private Lock lock = new ReentrantLock();
    /**
     * 修改货柜格
     * @param huoguige
     */
    @RequestMapping(value = "/updateHuoguige/{order_id}", method = RequestMethod.GET)
    public void updateHuoguige(huoguige huoguige, @PathVariable int order_id) {
        lock.lock();
        try {
            Date date = new Date();//获取当前的日期
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");//设置日期格式,精确到毫秒
            String time_str = df.format(date);//获取String类型的时间
            huoguige.setTime(time_str);
            String phone = orderService.queryUserPhoneByOrder(order_id);//根据订单号确认手机号
            huoguige.setOrder_id(Integer.parseInt(phone.substring(phone.length() - 4)));
            huoguigeService.updateHuoguige(huoguige);
            System.out.println("success");
        } catch (ParamsException e) {
            e.printStackTrace();
            System.out.println("fail");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("fail");
        } finally {
            lock.unlock();
        }
    }


    /**
     * 查询货柜格状态
     * @param container_id
     * @return
     */
    @GetMapping("/getHuoguige/container_id/{container_id}")
    public List<Integer> queryHuoguige(@PathVariable Integer container_id){
        return huoguigeService.queryHuoguige(container_id);
    }

}
