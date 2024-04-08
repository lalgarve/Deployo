package io.deployo.admin.repository;

import io.deployo.admin.model.domain.ServerStep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerStepRepository extends JpaRepository<ServerStep, Long> {
}
