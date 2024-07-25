package edu.training.osttra.second_version.service;

import edu.training.osttra.second_version.dtos.CreateResourceDto;
import edu.training.osttra.second_version.model.Resource;
import edu.training.osttra.second_version.repository.ResourceRepository;
import edu.training.osttra.second_version.repository.ResourceTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ResourceService {

    private final ResourceRepository repository;
    private final ResourceTypeRepository typeRepository;

    public void createNewResource(CreateResourceDto resource) {
        Resource newResource = Resource
                                .builder()
                .resourceId(UUID.randomUUID().toString())
                .resourceName(resource.getResourceName())
                .resourceType(typeRepository.findById(resource.getResourceType()).orElseThrow())
                .selectedTable(resource.getSelectedTable())
                .modifiedDateAndTime("Created By: User1 on "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")))
                .build();
        repository.save(newResource);
    }

    public List<Resource> getAllResource()
    {
        return repository.findAll();
    }

    public Resource getResourceById(String id) {
        return repository.findById(id).orElseThrow();
    }

    public void deleteResourceById(String id) {

        repository.deleteById(id);
    }

    public void updateResourceById(String id, CreateResourceDto updateResource) {

        Resource updateResourceValues = repository.findById(id).orElseThrow();
                 updateResourceValues = Resource
                                        .builder()
                                        .resourceName(updateResource.getResourceName())
                                        .resourceType(typeRepository.findById(updateResource.getResourceType()).orElseThrow())
                                        .selectedTable(updateResource.getSelectedTable())
                                        .modifiedDateAndTime("Modified By: User1 on "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")))
                                        .build();
        repository.save(updateResourceValues);

    }
}
