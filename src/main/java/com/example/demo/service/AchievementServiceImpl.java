package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Achievement;
import com.example.demo.repository.AchievementRepository;

@Service
public class AchievementServiceImpl implements AchievementService {

    @Autowired
    private AchievementRepository repo;

    public Achievement save(Achievement achievement) {
        return repo.save(achievement);
    }

    public List<Achievement> getAll() {
        return repo.findAll();
    }

    public Achievement getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Achievement update(int id, Achievement updated) {
        Achievement a = getById(id);
        if (a != null) {
            a.setCandidateName(updated.getCandidateName());
            a.setTitle(updated.getTitle());
            return repo.save(a);
        }
        return null;
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}

