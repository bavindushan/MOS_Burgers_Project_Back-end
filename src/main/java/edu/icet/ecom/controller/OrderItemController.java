package edu.icet.ecom.controller;

import edu.icet.ecom.dto.OrderItem;
import edu.icet.ecom.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-items")
@RequiredArgsConstructor
@CrossOrigin
public class OrderItemController {

    final OrderItemService service;

    @PostMapping("/add")
    public void addOrderItem(@RequestBody OrderItem orderItem){
        service.addOrderItem(orderItem);
    }

    @GetMapping("/getAll")
    public List<OrderItem> getAll(){
        return service.getAll();
    }

    @PutMapping("/update")
    public void updateOrderItem(@RequestBody OrderItem orderItem){
        service.updateOrderItem(orderItem);
    }
}
