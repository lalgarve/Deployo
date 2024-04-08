package io.deployo.admin.model.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;


@Getter
@Setter
public abstract class Step {
    private Integer order;
    private String sourcePath;
    private String targetPath;
}
