package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.ITScannerTypes;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.listener.ITEquipmentListener;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

@Audited
@Data
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cssp_it_scanners")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(ITEquipmentListener.class)
public class ITScannerEntity extends ITEquipmentEntity {

    @Column(name = "scanner_type")
    @Enumerated(EnumType.STRING)
    private ITScannerTypes scannerType;

    @Column(name = "optical_resolution")
    private String opticalResolution;
}
