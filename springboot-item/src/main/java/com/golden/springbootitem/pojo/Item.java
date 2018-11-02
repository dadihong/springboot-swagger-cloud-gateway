package com.golden.springbootitem.pojo;

public class Item {
    private Integer id;

    private String name;

    private Double price;

    private String msg;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item(Integer id, String name, Double price, String msg, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.msg = msg;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", msg='" + msg + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
