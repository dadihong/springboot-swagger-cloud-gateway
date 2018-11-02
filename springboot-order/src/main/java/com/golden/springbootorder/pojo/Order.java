package com.golden.springbootorder.pojo;

import java.util.Date;
import java.util.List;

public class Order {

    private Long id;

    private Date createTime;

    private List<Item> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Order() {
    }

    public Order(Long id, Date createTime, List<Item> items) {
        this.id = id;
        this.createTime = createTime;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", items=" + items +
                '}';
    }
}
