package edu.training.osttra.second_version.controller;

import edu.training.osttra.second_version.dtos.CreateResourceTypeDto;
import edu.training.osttra.second_version.model.ResourceType;
import edu.training.osttra.second_version.service.ResourceTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resource_type")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:3000/")
public class ResourceTypeController {

    private final ResourceTypeService service;

    @GetMapping("tables")
    public List<String> getAllTables()
    {
      return   service.getAllTables();
    }
    @GetMapping("columns")
    public List<String> getTableAllColumns(String tableName)
    {
        return service.getTableAllColumns(tableName);
    }

    @PostMapping("new_resource_type")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewResourceType(@RequestBody CreateResourceTypeDto resourceType)
    {
        service.createNewResourceType(resourceType);
    }

    @GetMapping("resource_types")
    @ResponseStatus(HttpStatus.OK)
    public List<ResourceType> getAllResourceType()
    {
        return service.getAllResourceType();
    }

    @GetMapping("resource_types/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResourceType getResourceTypeById(@PathVariable String id)
    {
        return service.getResourceTypeById(id);
    }

    @PostMapping("update_resource_type/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateResourceTypeById(@PathVariable String id,@RequestBody CreateResourceTypeDto updatedResourceType)
    {
        service.updateResourceTypeById(id,updatedResourceType);
    }

    @DeleteMapping("delete_resource_type/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteResourceTypeById(@PathVariable String id)
    {
        service.deleteResourceTypeById(id);
    }


}
