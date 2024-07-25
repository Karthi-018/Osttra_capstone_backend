package edu.training.osttra.second_version.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateResourceDto {

    private String resourceName;
    private int resourceType;
    private String selectedTable;

}
