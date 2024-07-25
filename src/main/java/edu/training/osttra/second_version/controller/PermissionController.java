package edu.training.osttra.second_version.controller;

import edu.training.osttra.second_version.dtos.CreatePermissionDto;
import edu.training.osttra.second_version.model.Permission;
import edu.training.osttra.second_version.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permission")
@RequiredArgsConstructor
public class PermissionController {

    private final PermissionService service;

    @PostMapping("new_permission")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewPermission(@RequestBody CreatePermissionDto permission)
    {
        service.createNewPermission(permission);
    }

    @GetMapping("permissions")
    @ResponseStatus(HttpStatus.OK)
    public List<Permission> getAllPermissions()
    {
        return service.getAllPermissions();
    }

    @GetMapping("permissions/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Permission getPermissionsById(@PathVariable String id)
    {
        return service.getPermissionsById(id);
    }

    @PutMapping("permissions/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public void updatePermissionsById(@PathVariable String id,@RequestBody CreatePermissionDto updatedPermissionValue)
    {
        service.updatePermissionById(id,updatedPermissionValue);
    }

    @DeleteMapping("permissions/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public void deletePermissionsById(@PathVariable String id)
    {
        service.deletePermissionById(id);
    }
}
