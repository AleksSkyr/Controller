package com.example.controllermy;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class Purchases {

    private final List<Integer> items = new ArrayList<>();

    public void add(Integer[] ids) {
        items.addAll(Arrays.asList(ids));
    }

    public List<Integer> getAll() {
        return Collections.unmodifiableList(items);
    }
}
