package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data;

import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITSoftwareEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITSoftwareRepository extends JpaRepository<ITSoftwareEntity, Long> {

}
