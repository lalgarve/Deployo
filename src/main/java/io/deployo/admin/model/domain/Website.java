package io.deployo.admin.model.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Website {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String url;
    @OneToOne
    private Server deployServer;
    @OneToMany
    private List<ServerStep> serverSteps;
    @OneToMany
    private List<SiteGenerationStep> siteGenerationSteps;
    @OneToMany
    private List<JavaDocGenerationStep> javaDocGenerationSteps;

    public List<Step> getSteps(){
        List<Step> steps = new ArrayList<>();
        steps.addAll(serverSteps);
        steps.addAll(siteGenerationSteps);
        steps.addAll(javaDocGenerationSteps);
        steps.sort((step1, step2) -> step1.getOrder() - step2.getOrder());
        return steps;
    }

}
