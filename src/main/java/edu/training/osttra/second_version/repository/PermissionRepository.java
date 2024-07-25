package edu.training.osttra.second_version.repository;

import edu.training.osttra.second_version.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission,String> {
}
