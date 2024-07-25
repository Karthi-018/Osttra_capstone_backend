package edu.training.osttra.second_version.repository;

import edu.training.osttra.second_version.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource,String> {
}
