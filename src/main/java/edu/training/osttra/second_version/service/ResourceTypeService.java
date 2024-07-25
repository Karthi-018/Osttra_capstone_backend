package edu.training.osttra.second_version.service;

import edu.training.osttra.second_version.dtos.CreateResourceTypeDto;
import edu.training.osttra.second_version.model.ResourceType;
import edu.training.osttra.second_version.repository.ResourceTypeRepository;
import edu.training.osttra.second_version.repository.TablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Service

public class ResourceTypeService {

    @Autowired
    private ResourceTypeRepository repository;

    @Autowired
    private TablesRepository tablesRepository;

    public List<String> getAllTables()
    {

        return tablesRepository.getAllTables();
    }

    public List<String> getTableAllColumns(String tableName)
    {
        return tablesRepository.getTableAllColumns(tableName);
    }

    public void createNewResourceType(CreateResourceTypeDto resourceType) {

        ResourceType newResourceType = ResourceType
                                        .builder()
                                        .resourceTypeID(UUID.randomUUID().toString())
                                        .resourceTypeName(resourceType.getResourceTypeName())
                                        .resourceTypeSource(resourceType.getResourceTypeSource())
                                        .availablePermission(resourceType.getAvailablePermission())
                                        .permissionConditionsEnabled(resourceType.isPermissionConditionsEnabled())
                                        .modifiedDateAndTime("Created By: User1 on "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")))
                                        .build();
        repository.save(newResourceType);
    }

    public List<ResourceType> getAllResourceType()
    {
        return repository.findAll();
    }

    public ResourceType getResourceTypeById(String id) {

        return repository.findById(id).orElseThrow();
    }

    public void updateResourceTypeById(String id, CreateResourceTypeDto updatedResourceType) {
        ResourceType resourceType = repository.findById(id).orElseThrow();
        resourceType.builder()
                .resourceTypeSource(updatedResourceType.getResourceTypeSource())
                .availablePermission(updatedResourceType.getAvailablePermission())
                .permissionConditionsEnabled(updatedResourceType.isPermissionConditionsEnabled())
                .modifiedDateAndTime("Modified By: User1 on "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")))
                .build();
        repository.save(resourceType);
    }

    public void deleteResourceTypeById(String id) {

        repository.deleteById(id);
    }
}
