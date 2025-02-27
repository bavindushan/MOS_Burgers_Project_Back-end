package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Order;
import edu.icet.ecom.dto.Product;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getAll")
    public List<Order> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable Integer id){
        service.deleteOrder(id);
    }

    @GetMapping("/searchById/{id}")
    public Order searchById(@PathVariable Integer id){
        return service.searchById(id);
    }

}
