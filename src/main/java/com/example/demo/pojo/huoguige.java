package com.example.demo.pojo;

public class huoguige {
    private Integer id;
    private String time;
    private Integer order_id;
    private Integer container_id;
    private Integer version;

    public huoguige(Integer id, String time, Integer order_id, Integer container_id,Integer version) {
        this.id = id;
        this.time = time;
        this.order_id = order_id;
        this.container_id = container_id;
        this.version = version;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getContainer_id() {
        return container_id;
    }

    public void setContainer_id(Integer container_id) {
        this.container_id = container_id;
    }

    @Override
    public String toString() {
        return "huoguige{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", order_id=" + order_id +
                ", container_id=" + container_id +
                ", version=" + version +
                '}';
    }
}
