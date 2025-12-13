package cssp.gob.sv.nexusplatformitinventory.domain.model;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.InputPortType;
import cssp.gob.sv.nexusplatformitinventory.domain.enums.VideoInputType;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class ITComputer extends ITEquipment {
    private String macAddress;
    private String networkAdapter;

    private boolean isLaptop;
    private int ramGb;
    private int storageGb;
    private int batteryState;
    private String processor;
    private String graphicCard;
    private List<InputPortType> usbPorts;
    private List<VideoInputType> entradaVideos;
    private List<ITEquipmentNetworkDetail> ipAddresses = new ArrayList<>();

}
