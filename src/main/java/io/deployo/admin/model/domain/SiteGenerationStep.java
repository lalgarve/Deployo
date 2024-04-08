package io.deployo.admin.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class SiteGenerationStep extends  Step {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean generateFuture;
    private boolean generateDraft;
    private String executable;
    private SiteGenerationType siteGenerationType;
}
