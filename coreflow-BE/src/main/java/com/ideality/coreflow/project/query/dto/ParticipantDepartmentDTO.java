package com.ideality.coreflow.project.query.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ParticipantDepartmentDTO {
    private Long deptId;
    private String deptName;
    private int participantCount;
}
