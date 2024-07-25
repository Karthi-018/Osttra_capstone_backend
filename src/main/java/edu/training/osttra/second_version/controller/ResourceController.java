package edu.training.osttra.second_version.controller;

import edu.training.osttra.second_version.dtos.CreateResourceDto;
import edu.training.osttra.second_version.model.Resource;
import edu.training.osttra.second_version.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resource")
@RequiredArgsConstructor
public class ResourceController {

    private final ResourceService service;

    @PostMapping("new_resource")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewResource(@RequestBody CreateResourceDto resource)
    {
        service.createNewResource(resource);
    }

    @GetMapping("resources")
    @ResponseStatus(HttpStatus.OK)
    public List<Resource> getAllResources()
    {
        return service.getAllResource();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Resource getResourceById(@PathVariable String id)
    {
        return service.getResourceById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public void UpdateResourceById(@PathVariable String id,@RequestBody CreateResourceDto updateResource)
    {
        service.updateResourceById(id,updateResource);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public void deleteResourceById(@PathVariable String id)
    {
        service.deleteResourceById(id);
    }

}
