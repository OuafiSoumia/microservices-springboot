package com.microservices.inventory_service.controller;

import com.microservices.inventory_service.dto.InventoryResponse;
import com.microservices.inventory_service.model.Inventory;
import com.microservices.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        System.out.println("InventoryController is called");
       return inventoryService.isInStock(skuCode);
    }
}
