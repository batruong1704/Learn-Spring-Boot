package org.example.learn_spring_boot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class greetingModel {
    private Long id;
    private String message;
}
