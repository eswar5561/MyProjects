package com.example.demo.service;

import com.example.demo.entity.Achievement;
import java.util.List;

public interface AchievementService {
    Achievement save(Achievement achievement);
    List<Achievement> getAll();
    Achievement getById(int id);
    Achievement update(int id, Achievement updated);
    void delete(int id);
}