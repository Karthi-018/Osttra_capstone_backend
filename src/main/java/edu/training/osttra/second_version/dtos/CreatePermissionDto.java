package edu.training.osttra.second_version.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreatePermissionDto {

    private String permissionName;
    private String resourceID;
    private String resourceTableName;
    private String displayTableColumnName;


}
