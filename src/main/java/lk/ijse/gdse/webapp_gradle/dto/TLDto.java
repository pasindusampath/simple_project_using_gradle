package lk.ijse.gdse.webapp_gradle.dto;

import lk.ijse.gdse.webapp_gradle.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TLDto {
    private UUID tlId;

    private String tlName;

    private String tlEmail;

    private List<Project> projects;
}
