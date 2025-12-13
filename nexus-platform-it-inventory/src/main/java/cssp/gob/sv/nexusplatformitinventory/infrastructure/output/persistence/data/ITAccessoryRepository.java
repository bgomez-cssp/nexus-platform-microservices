package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data;


import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITAccessoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITAccessoryRepository extends JpaRepository<ITAccessoryEntity, Long> {
}
