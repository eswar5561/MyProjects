package com.example.demo.controller;

import com.example.demo.entity.Achievement;
import com.example.demo.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/achievements")
public class AchievementController {

    @Autowired
    private AchievementService service;

    @PostMapping
    public Achievement create(@RequestBody Achievement achievement) {
        return service.save(achievement);
    }

    @GetMapping
    public List<Achievement> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Achievement getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Achievement update(@PathVariable int id, @RequestBody Achievement achievement) {
        return service.update(id, achievement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}