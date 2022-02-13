package com.example.demo.controller;

import com.example.demo.exception.ParamsException;
import com.example.demo.pojo.deliveryman;
import com.example.demo.service.deliverymanService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class deliverymanController {

    @Resource
    private deliverymanService deliverymanService;

    /**
     * 通过id查询
     * @param Did
     * @return
     */
    @GetMapping("/delivery/id/{Did}")
    public deliveryman queryDeliverymanByDid(@PathVariable String Did){
        return deliverymanService.queryDeliverymanByDid(Did);
    }

    /**
     * 添加
     * @param deliveryman
     */
    @RequestMapping(value = "/insertDeliveryman", method = RequestMethod.GET)
    //@PutMapping("/insertDeliveryman")
    public void insertDeliveryman(deliveryman deliveryman){

        try{
            deliverymanService.insertDeliveryman(deliveryman);
            System.out.print("insert");
        }
        catch (ParamsException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 修改
     * @param deliveryman
     */
    @RequestMapping(value = "/updateDeliveryman", method = RequestMethod.GET)
    //@PostMapping("updateDeliveryman")
    public void updateDeliveryman(deliveryman deliveryman){
        try{
            deliverymanService.updateDeliveryman(deliveryman);
            System.out.print("update");
        }
        catch (ParamsException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 删除
     * @param Did
     */
    @RequestMapping(value = "/deleteDeliveryman/{Did}", method = RequestMethod.GET)
    //@DeleteMapping("/deleteDeliveryman/{Did}")
    public void deleteDeliveryman(@PathVariable String Did){
        try{
            deliverymanService.deleteDeliveryman(Did);
            System.out.print("delete");
        }
        catch (ParamsException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
