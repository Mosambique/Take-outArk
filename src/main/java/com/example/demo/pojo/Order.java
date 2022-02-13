package com.example.demo.pojo;

public class Order {
    private Integer id;
    private String user_phone;
    private String deliveryman_phone;
    private Integer container_id;
    private Integer huoge_id;


    public Order(Integer id, String user_phone, String deliveryman_phone, Integer container_id, Integer huoge_id) {
        this.id = id;
        this.user_phone = user_phone;
        this.deliveryman_phone = deliveryman_phone;
        this.container_id = container_id;
        this.huoge_id = huoge_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getDeliveryman_phone() {
        return deliveryman_phone;
    }

    public void setDeliveryman_phone(String deliveryman_phone) {
        this.deliveryman_phone = deliveryman_phone;
    }

    public Integer getContainer_id() {
        return container_id;
    }

    public void setContainer_id(Integer container_id) {
        this.container_id = container_id;
    }

    public Integer getHuoge_id() {
        return huoge_id;
    }

    public void setHuoge_id(Integer huoge_id) {
        this.huoge_id = huoge_id;
    }
}
