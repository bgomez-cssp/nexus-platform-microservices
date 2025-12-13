package cssp.gob.sv.nexusplatformitinventory.domain.model;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.ITMobileDevicesTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class ITMobileDevice extends ITEquipment {
    private double sizeScreen;
    private ITMobileDevicesTypes mobileDeviceType;
    private int ramGb;
    private int storageGb;
    private boolean sim;
    private String number;
    private boolean dualSim;
    private boolean opticalPensil;

}
