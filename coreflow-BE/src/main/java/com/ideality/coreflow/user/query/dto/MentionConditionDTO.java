package com.ideality.coreflow.user.query.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class MentionConditionDTO {
    private Long projectId;
    private String deptName;
    private String name;
}
