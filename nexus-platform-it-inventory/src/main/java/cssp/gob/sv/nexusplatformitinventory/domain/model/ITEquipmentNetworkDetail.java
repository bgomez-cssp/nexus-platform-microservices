package cssp.gob.sv.nexusplatformitinventory.domain.model;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.InterfacesNetworkState;
import cssp.gob.sv.nexusplatformitinventory.domain.enums.InterfacesNetworkType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ITEquipmentNetworkDetail {
    private Long id;
    private String ipAddress;
    private InterfacesNetworkType interfaceType;
    private InterfacesNetworkState interfaceState;
    private ITEquipment itEquipment;
}
