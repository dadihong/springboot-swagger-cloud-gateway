package com.golden.springbootorder.controller;

import com.golden.springbootorder.pojo.Order;
import com.golden.springbootorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping(value = "order/{id}")
    public Order findOrderByid(@PathVariable("id") Long id){

        Order order = new Order();
        order.setCreateTime(new Date());
        order.setId(id);
        order.setItems(orderService.findAllItem());
        return order;
    }
}
