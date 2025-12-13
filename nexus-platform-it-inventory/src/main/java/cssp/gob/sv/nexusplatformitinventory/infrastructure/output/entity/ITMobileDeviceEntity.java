package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.ITMobileDevicesTypes;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.listener.ITEquipmentListener;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

@Audited
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cssp_it_mobile_devices")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(ITEquipmentListener.class)
public class ITMobileDeviceEntity extends ITEquipmentEntity {
    @Column(name = "size_screen")
    private double sizeScreen;

    @Column(name = "mobile_device_type")
    @Enumerated(EnumType.STRING)
    private ITMobileDevicesTypes mobileDeviceType;

    @Column(name = "ram_gb")
    private int ramGb;

    @Column(name = "storage_gb")
    private int storageGb;

    @Column(name = "sim")
    private boolean sim;

    @Column(name = "number")
    private String number;

    @Column(name = "dual_sim")
    private boolean dualSim;

    @Column(name = "optical_pensil")
    private boolean opticalPensil;

}
