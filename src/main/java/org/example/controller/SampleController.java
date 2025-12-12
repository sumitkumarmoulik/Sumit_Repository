package org.example.controller;

import org.example.dto.SampleRequestDTO;
import org.example.dto.SampleResponseDTO;
import org.example.service.SampleService;
import org.example.util.ApiResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sample")
public class SampleController {
    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<SampleResponseDTO> getById(@PathVariable Long id) {
        SampleResponseDTO resp = sampleService.getById(id);
        return ApiResponseUtil.ok(resp);
    }

    @PostMapping
    public ResponseEntity<SampleResponseDTO> create(@RequestBody SampleRequestDTO request) {
        SampleResponseDTO resp = sampleService.create(request);
        return ApiResponseUtil.created(resp);
    }
}
