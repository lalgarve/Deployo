package io.deployo.admin.repository;

import io.deployo.admin.model.domain.SiteGenerationStep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteGenerationStepRepository extends JpaRepository<SiteGenerationStep, Long> {
}
