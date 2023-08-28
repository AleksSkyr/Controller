package com.example.controllermy;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class PurchasesService {

    private final Purchases purchases;

    public PurchasesService(Purchases purchases) {
        this.purchases = purchases;
    }

    public void add(Integer[] ids) {
        purchases.add(ids);
    }

    public List<Integer> all() {
        return purchases.getAll();
    }

}
