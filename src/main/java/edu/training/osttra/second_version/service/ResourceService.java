package edu.training.osttra.second_version.service;

import edu.training.osttra.second_version.dtos.CreateResourceDto;
import edu.training.osttra.second_version.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResourceService {

    private final ResourceRepository repository;

    public void createNewResource(CreateResourceDto resource) {
    }
}
