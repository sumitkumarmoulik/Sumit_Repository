package org.example.service.impl;

import org.example.dto.SampleRequestDTO;
import org.example.dto.SampleResponseDTO;
import org.example.service.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    private static final Logger log = LoggerFactory.getLogger(SampleServiceImpl.class);

    @Override
    public SampleResponseDTO getById(Long id) {
        log.info("Fetching Sample by id: {}", id);

        // stub implementation
        SampleResponseDTO resp = new SampleResponseDTO();
        resp.setId(id);
        resp.setName("Sample_" + id);

        log.debug("Sample fetched: id={}, name={}", resp.getId(), resp.getName());
        return resp;
    }

    @Override
    public SampleResponseDTO create(SampleRequestDTO request) {
        log.info("Creating Sample with name: {}", request != null ? request.getName() : null);

        SampleResponseDTO resp = new SampleResponseDTO();
        resp.setId(1L); // stub id
        resp.setName(request.getName());

        log.debug("Sample created: id={}, name={}", resp.getId(), resp.getName());
        return resp;
    }
}
