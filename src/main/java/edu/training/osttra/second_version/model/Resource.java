package edu.training.osttra.second_version.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Resource {

    @Id
    private String resourceId;
    private String resourceName;
    @ManyToOne(cascade = CascadeType.ALL)
    private ResourceType resourceType;
    private String selectedTable;
    private String modifiedDateAndTime;
}
