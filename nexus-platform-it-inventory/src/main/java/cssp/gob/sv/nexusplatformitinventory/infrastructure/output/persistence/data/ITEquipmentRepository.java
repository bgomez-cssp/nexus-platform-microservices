package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data;

import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITEquipmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ITEquipmentRepository")
    public interface ITEquipmentRepository extends JpaRepository<ITEquipmentEntity, String> {
}
