package edu.training.osttra.second_version.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class ResourceType {

    @Id
    private String resourceTypeID;
    private String resourceTypeName;
    private List<String> availablePermission;
    private List<String> resourceTypeSource;
    private boolean permissionConditionsEnabled;
    private String modifiedDateAndTime;

}
