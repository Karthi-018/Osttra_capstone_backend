package edu.training.osttra.second_version.repository;

import edu.training.osttra.second_version.model.ResourceType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResourceTypeRepository extends JpaRepository<ResourceType,String> {


}
