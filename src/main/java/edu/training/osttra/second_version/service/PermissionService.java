package edu.training.osttra.second_version.service;

import edu.training.osttra.second_version.dtos.CreatePermissionDto;
import edu.training.osttra.second_version.model.Permission;
import edu.training.osttra.second_version.repository.PermissionRepository;
import edu.training.osttra.second_version.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PermissionService {

    private final PermissionRepository repository;
    private final ResourceRepository resourceRepository;

    public void createNewPermission(CreatePermissionDto permission) {

        Permission newPermission = Permission
                                    .builder()
                                    .permissionId(UUID.randomUUID().toString())
                                    .permissionName(permission.getPermissionName())
                                    .resourceID(resourceRepository.findById(permission.getResourceID()).orElseThrow())
                                    .resourceTableName(permission.getResourceTableName())
                                    .displayTableColumnName(permission.getDisplayTableColumnName())
                                    .selectedTableColumnName(permission.getSelectedTableColumnName())
                                    .displayTypeList("list")
                                    .resourceQuery("select "+permission.getDisplayTableColumnName()+","+permission.getSelectedTableColumnName()+" from "+permission.getResourceTableName())
                                    .build();
        repository.save(newPermission);
    }

    public List<Permission> getAllPermissions()
    {
       return repository.findAll();
    }

    public Permission getPermissionsById(String id)
    {
        return repository.findById(id).orElseThrow();
    }

    public void updatePermissionById(String id,CreatePermissionDto permission)
    {
        Permission updatePermissionValue = repository.findById(id).orElseThrow();

        updatePermissionValue = Permission.builder()
                                .permissionName(permission.getPermissionName())
                                .resourceID(resourceRepository.findById(permission.getResourceID()).orElseThrow())
                                .resourceTableName(permission.getResourceTableName())
                                .displayTableColumnName(permission.getDisplayTableColumnName())
                                .selectedTableColumnName(permission.getSelectedTableColumnName())
                                .displayTypeList("list")
                                .resourceQuery("select "+permission.getDisplayTableColumnName()+","+permission.getSelectedTableColumnName()+" from "+permission.getResourceTableName())
                                .build();

        repository.save(updatePermissionValue);


    }

    public void deletePermissionById(String id)
    {
        repository.deleteById(id);
    }

}
