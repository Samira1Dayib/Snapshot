package com.example.snapshot.service;


import com.example.snapshot.model.Capsule;
import com.example.snapshot.repository.CapsuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CapsuleService {
    private final CapsuleRepository capsuleRepository;

    public CapsuleService(CapsuleRepository capsuleRepository) {
        this.capsuleRepository = capsuleRepository;
    }

    public Capsule createCapsule(Capsule capsule) {
        return capsuleRepository.save(capsule);
    }

    public Optional<Capsule> getCapsuleById(Long id) {
        return capsuleRepository.findById(id);
    }

    public List<Capsule> getAllCapsules() {
        return capsuleRepository.findAll();
    }
}




