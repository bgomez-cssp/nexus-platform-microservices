package cssp.gob.sv.nexusplatformitinventory.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ITVoltageRegulator extends ITEquipment {
    private int vaCapacity;
}
