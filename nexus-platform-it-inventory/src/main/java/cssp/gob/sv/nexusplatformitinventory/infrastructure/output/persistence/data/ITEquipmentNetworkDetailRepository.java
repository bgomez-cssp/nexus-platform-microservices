package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data;

import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITEquipmentNetworkDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITEquipmentNetworkDetailRepository extends JpaRepository<ITEquipmentNetworkDetailEntity, Long> {
}
