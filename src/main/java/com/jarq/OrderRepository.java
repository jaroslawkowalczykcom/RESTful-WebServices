package com.jarq;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface OrderRepository extends CrudRepository<Order, Integer>{

}
