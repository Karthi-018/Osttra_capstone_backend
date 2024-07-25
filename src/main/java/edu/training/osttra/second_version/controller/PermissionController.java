package edu.training.osttra.second_version.controller;

import edu.training.osttra.second_version.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/permission")
@RequiredArgsConstructor
public class PermissionController {

    private final PermissionService service;
}
