package org.example._20240922springbootvuetest2.controller;

import org.example._20240922springbootvuetest2.model.Data;
import org.example._20240922springbootvuetest2.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @PostMapping
    public Data saveData(@RequestBody Data data) {
        return dataRepository.save(data);
    }

    @GetMapping
    public List<Data> getAllData() {
        return dataRepository.findAll();
    }
}
