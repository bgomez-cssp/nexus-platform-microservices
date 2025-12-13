package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;

@Audited
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cssp_it_equipment_maintences")
public class ITEquipmentMaintenanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "next_maintenance",precision = 10, scale = 2)
    private OffsetDateTime nextMaintenance;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "last_maintenance",precision = 10, scale = 2)
    private OffsetDateTime lastMaintenance;

    @Column(name = "maintenance_done",precision = 10, scale = 2)
    private boolean maintenanceDone;

    @OneToOne(mappedBy = "equipmentMaintenance")
    private ITEquipmentEntity equipment;

}
