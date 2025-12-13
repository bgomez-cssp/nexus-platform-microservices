package cssp.gob.sv.nexusplatformitinventory.domain.model;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.ITHardDIskTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class ITHardDisk extends ITEquipment {
    private int capacityGB;
    private ITHardDIskTypes hardDIskType;
}
