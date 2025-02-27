package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Order;
import edu.icet.ecom.dto.Product;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
@CrossOrigin
public class OrderController {

    final OrderService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addOrder(@RequestBody Order order){
        service.addOrder(order);
    }

    @PutMapping("/update")
    public void updateOrder(@RequestBody Order order){
        service.updateOrder(order);
    }
}
