package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.InputPortType;
import cssp.gob.sv.nexusplatformitinventory.domain.enums.VideoInputType;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.listener.ITEquipmentListener;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Audited
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cssp_it_computers")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(ITEquipmentListener.class)
public class ITComputerEntity extends ITEquipmentEntity {

    @Column(name = "mac_address")
    private String macAddress;

    @Column(name = "network_adapter")
    private String networkAdapter;

    @Column(name = "is_laptop")
    private boolean isLaptop;

    @Column(name = "ram_gb")
    private int ramGb;

    @Column(name = "storage_gb")
    private int storageGb;

    @Column(name = "battery_state")
    private int batteryState;

    @Column(name = "processor")
    private String processor;

    @Column(name = "graphic_card")
    private String graphicCard;

    @ElementCollection(targetClass = InputPortType.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "input_port",
            joinColumns = @JoinColumn(name = "id")
    )
    @Column(name = "input_ports")
    private List<InputPortType> inputPorts;

    @ElementCollection(targetClass = VideoInputType.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "video_input_type",
            joinColumns = @JoinColumn(name = "id")
    )
    @Column(name = "video_input_types")
    private List<VideoInputType> videoInputTypes;

    @Builder.Default
    @OneToMany(mappedBy = "itEquipmentEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ITEquipmentNetworkDetailEntity> ipAddresses = new ArrayList<>();

}
