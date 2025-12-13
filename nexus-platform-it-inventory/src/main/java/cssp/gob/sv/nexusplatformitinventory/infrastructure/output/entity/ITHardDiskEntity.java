package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.ITHardDIskTypes;
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
@Table(name = "cssp_it_hard_disks")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(ITEquipmentListener.class)
public class ITHardDiskEntity extends ITEquipmentEntity {

    @Column(name = "capacity_gb",nullable = false)
    private int capacityGB;

    @Column(name = "hard_disk_type")
    @Enumerated(EnumType.STRING)
    private ITHardDIskTypes hardDIskType;
}
