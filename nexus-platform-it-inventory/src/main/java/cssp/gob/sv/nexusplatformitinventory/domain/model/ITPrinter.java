package cssp.gob.sv.nexusplatformitinventory.domain.model;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.ITPrinterTypes;
import cssp.gob.sv.nexusplatformitinventory.domain.enums.PrinterCartridge;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ITPrinter extends ITEquipment {
    private String macAddress;
    private boolean adf;
    private ITPrinterTypes printerType;
    private PrinterCartridge printerCartridge;
    private List<ITEquipmentNetworkDetail> ipAddresses = new ArrayList<>();

}
