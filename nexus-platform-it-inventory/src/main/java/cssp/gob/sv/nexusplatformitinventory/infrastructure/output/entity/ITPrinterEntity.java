package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.ITPrinterTypes;
import cssp.gob.sv.nexusplatformitinventory.domain.enums.PrinterCartridge;
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
@Table(name = "cssp_it_printers")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(ITEquipmentListener.class)
public class ITPrinterEntity extends ITEquipmentEntity {

    @Column(name = "mac_address")
    private String macAddress;

    @Column(name = "adf")
    private boolean adf;

    @Enumerated(EnumType.STRING)
    @Column(name = "printer_type")
    private ITPrinterTypes printerType;

    @Enumerated(EnumType.STRING)
    @Column(name = "printer_cartridge")
    private PrinterCartridge printerCartridge;

    @Builder.Default
    @OneToMany(mappedBy = "itEquipmentEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ITEquipmentNetworkDetailEntity> ipAddresses = new ArrayList<>();

}
