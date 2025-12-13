package cssp.gob.sv.nexusplatformitinventory.domain.model;


import cssp.gob.sv.nexusplatformitinventory.domain.enums.ITScannerTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ITScanner extends ITEquipment {
    private ITScannerTypes scannerType;
    private String opticalResolution;
}
