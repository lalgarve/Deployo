package io.deployo.admin.repository;

import io.deployo.admin.model.domain.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> {
}
