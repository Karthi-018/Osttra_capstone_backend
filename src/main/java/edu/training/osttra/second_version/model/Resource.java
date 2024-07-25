package edu.training.osttra.second_version.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Resource {

    @Id
    private String resourceId;
    private String resourceName;
    @ManyToOne
    private ResourceType resourceType;
    private String selectedTable;
    private String userName;
    private String modifiedDate;
}
