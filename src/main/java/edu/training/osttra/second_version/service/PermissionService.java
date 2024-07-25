package edu.training.osttra.second_version.service;

import edu.training.osttra.second_version.repository.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PermissionService {

    private final PermissionRepository repository;
}
