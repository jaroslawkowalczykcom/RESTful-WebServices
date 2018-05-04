package com.jarq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderResource {

    @Autowired
    OrderRepository repo;

    @CrossOrigin
    @GetMapping("/orders")
    public List<Order> getOrders() {
        List<Order> orders = (List<Order>) repo.findAll();
        return orders;
    }

    @CrossOrigin
    @GetMapping("/order/{id}")
    public Order getOrder(@PathVariable("id") int id) {
        return repo.findOne(id);
    }

    @CrossOrigin
    @DeleteMapping("/order/{id}")
    public void deleteOrder(@PathVariable("id") int id) {
        repo.delete(id);
    }

    @CrossOrigin
    @PostMapping("/order")
    public Order createOrder(@RequestBody Order order) {
        return repo.save(order);
    }

    @CrossOrigin
    @PutMapping("/order/{id}")
    public Order updateOrder(@PathVariable("id") int id, @RequestBody Order order) {
        order.setId(id);
        return repo.save(order);
    }

}
