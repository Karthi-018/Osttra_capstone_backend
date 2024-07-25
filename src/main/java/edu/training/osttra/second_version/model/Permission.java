package edu.training.osttra.second_version.model;

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
public class Permission {
    @Id
    private String permissionId;
    private String permissionName;
    @ManyToOne
    private Resource resourceID;
    private String resourceTableName;
    private String displayTableColumnName;
    private String selectedTableColumnName;
    private String displayTypeList;
    private String resourceQuery;
}
