package cssp.gob.sv.nexusplatformitinventory.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ITAccessory {
    private Long id;
    private String type;
    private ITEquipment itEquipment;
    private OffsetDateTime creationDate;
    private OffsetDateTime modificationDate;
}
