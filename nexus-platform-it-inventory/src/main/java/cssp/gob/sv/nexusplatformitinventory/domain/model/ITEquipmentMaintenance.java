package cssp.gob.sv.nexusplatformitinventory.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ITEquipmentMaintenance {
    private String id;
    private OffsetDateTime nextMaintenance;
    private OffsetDateTime lastMaintenance;
    private boolean maintenanceDone;
    private ITEquipment equipment;
}
