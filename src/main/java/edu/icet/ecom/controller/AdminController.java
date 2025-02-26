package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Admin;
import edu.icet.ecom.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
@CrossOrigin
public class AdminController {

    final AdminService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAdmin(@RequestBody Admin admin){
        service.addAdmin(admin);
    }

    @PutMapping("/update")
    public void updateAdmin(@RequestBody Admin admin){
        service.updateAdmin(admin);
    }

    @GetMapping("/getAll")
    public List<Admin> getAll(){
        return service.getAll();
    }
}
