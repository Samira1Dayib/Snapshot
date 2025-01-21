package com.example.snapshot.controller;



import com.example.snapshot.model.Capsule;
import com.example.snapshot.service.CapsuleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/capsules")
public class CapsuleController {
    private final CapsuleService capsuleService;

    public CapsuleController(CapsuleService capsuleService) {
        this.capsuleService = capsuleService;
    }

    @PostMapping
    public ResponseEntity<Capsule> createCapsule(@RequestBody Capsule capsule) {
        return ResponseEntity.ok(capsuleService.createCapsule(capsule));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Capsule> getCapsuleById(@PathVariable Long id) {
        return capsuleService.getCapsuleById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Capsule>> getAllCapsules() {
        return ResponseEntity.ok(capsuleService.getAllCapsules());
    }
}

