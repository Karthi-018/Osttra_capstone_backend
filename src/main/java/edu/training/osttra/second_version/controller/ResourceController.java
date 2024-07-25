package edu.training.osttra.second_version.controller;

import edu.training.osttra.second_version.dtos.CreateResourceDto;
import edu.training.osttra.second_version.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
@RequiredArgsConstructor
public class ResourceController {

    private final ResourceService service;

    public void createNewResource(@RequestBody CreateResourceDto resource)
    {
        service.createNewResource(resource);
    }
}
