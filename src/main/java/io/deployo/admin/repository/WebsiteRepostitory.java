package io.deployo.admin.repository;

import io.deployo.admin.model.domain.Website;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebsiteRepostitory extends JpaRepository<Website, Long> {
}
