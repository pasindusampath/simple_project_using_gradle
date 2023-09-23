package lk.ijse.gdse.webapp_gradle.repo;

import lk.ijse.gdse.webapp_gradle.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface ProjectRepo extends JpaRepository<Project, UUID> {
}
