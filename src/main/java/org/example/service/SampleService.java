package org.example.service;

import org.example.dto.SampleRequestDTO;
import org.example.dto.SampleResponseDTO;

public interface SampleService {
    SampleResponseDTO getById(Long id);
    SampleResponseDTO create(SampleRequestDTO request);
}
