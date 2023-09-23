package lk.ijse.gdse.webapp_gradle.repo;

import lk.ijse.gdse.webapp_gradle.entity.TL;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface TLRepo extends JpaRepository<TL, UUID> {
}
