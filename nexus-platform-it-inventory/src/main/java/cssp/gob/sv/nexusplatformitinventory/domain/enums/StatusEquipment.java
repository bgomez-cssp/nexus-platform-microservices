package cssp.gob.sv.nexusplatformitinventory.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusEquipment {
    REQUESTED ("SOLICITADO"),
    BORROWED("EN PRESTAMO"),
    LOST("PERDIDO"),
    DAMAGED("DAÑADO"),
    IN_TRANSIT("EN TRÁNSITO ");

    private final String name;
}
