package edu.training.osttra.second_version.controller;

import edu.training.osttra.second_version.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
@RequiredArgsConstructor
public class ResourceController {

    private final ResourceService service;
}
