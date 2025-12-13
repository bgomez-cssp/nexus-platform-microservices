package cssp.gob.sv.nexusplatformitinventory.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ITEquipmentsTypesEnum {
    IT_ACCESSORY("ACCESSORY","01"),
    IT_COMPUTER("IT_COMPUTER","01"),
    IT_MOBILE_DEVICE("MOBILE_DEVICE","01"),
    IT_KEYBOARD("KEYBOARD","02"),
    IT_MOUSE("MOUSE","03"),
    IT_MONITOR("MONITOR","04"),
    IT_UPS("UPS","05"),
    IT_SPEAKER("SPEAKERS","06"),
    IT_PRINTER("PRINTER","07"),
    IT_LAPTOP("LAPTOP","08"),
    IT_SCANNER("SCANNER","09"),
    IT_SERVER("SERVER","13"),
    IT_WEB_CAMERA("WEB_CAMERA","14"),
    IT_HARD_DISK("HARD_DISK","15"),
    IT_PROJECTOR("PROJECTOR","16"),
    IT_MICROPHONE("MICROPHONE","17"),
    IT_TRIPOD("TRIPOD","18"),
    IT_SIGNATURE_PAD("SIGNATURE_PAD","19"),
    IT_WIRELESS_ROUTER("WIRELESS_ROUTER","20"),
    IT_BIOMETRIC_CLOCK("BIOMETRIC_CLOCK","21"),
    IT_ELECTRIC_BOARD("ELECTRIC_BOARD","22"),
    IT_VOLTAGE_REGULATOR("VOLTAGE_REGULATOR","23"),
    ;

    private final String name;
    private final String code;
}
