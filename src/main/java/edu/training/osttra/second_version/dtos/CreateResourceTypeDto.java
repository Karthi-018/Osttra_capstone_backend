package edu.training.osttra.second_version.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Permission;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateResourceTypeDto {

    private String resourceTypeName;
    private List<String> availablePermission;
    private List<String> resourceTypeSource;
    private boolean permissionConditionsEnabled;


}
