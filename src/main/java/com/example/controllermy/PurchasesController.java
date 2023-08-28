package com.example.controllermy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class PurchasesController {

    private final PurchasesService purchasesService;

    public PurchasesController(PurchasesService purchasesService) {
        this.purchasesService = purchasesService;
    }

    @GetMapping("/add")
    public void add(@RequestParam Integer[] ids) {
        purchasesService.add(ids);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return purchasesService.all();
    }
}
