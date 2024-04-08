package io.deployo.admin.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class JavaDocGenerationStep extends Step {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String javaHome;
    private boolean generateSnapshot;
    private int maxSnapShot;
}
