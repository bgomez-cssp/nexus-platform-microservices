package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.InterfacesNetworkState;
import cssp.gob.sv.nexusplatformitinventory.domain.enums.InterfacesNetworkType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

@Audited
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cssp_it_equipment_network_details")
public class ITEquipmentNetworkDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ip_address")
    private String ipAddress;

    @Enumerated(EnumType.STRING)
    @Column(name = "interface_type")
    private InterfacesNetworkType interfaceType;

    @Enumerated(EnumType.STRING)
    @Column(name = "interface_state")
    private InterfacesNetworkState interfaceState;

    @NotAudited
    @ManyToOne
    @JoinColumn(name = "cssp_it_equipment_id")
    private ITEquipmentEntity itEquipmentEntity;
}
