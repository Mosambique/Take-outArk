package com.example.demo.pojo;

public class deliveryman {
    private Integer id;
    private String phone_number;
    private String name;
    private String wx_id;

    public deliveryman(Integer id, String phone_number, String name, String wx_id) {
        this.id = id;
        this.phone_number = phone_number;
        this.name = name;
        this.wx_id = wx_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWx_id() {
        return wx_id;
    }

    public void setWx_id(String wx_id) {
        this.wx_id = wx_id;
    }
}
