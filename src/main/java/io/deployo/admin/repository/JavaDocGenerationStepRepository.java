package io.deployo.admin.repository;

import io.deployo.admin.model.domain.JavaDocGenerationStep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JavaDocGenerationStepRepository extends JpaRepository<JavaDocGenerationStep, Long> {
}
