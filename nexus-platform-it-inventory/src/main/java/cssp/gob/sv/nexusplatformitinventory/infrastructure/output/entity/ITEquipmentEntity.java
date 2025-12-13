package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity;

import com.fasterxml.jackson.annotation.*;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.StatusEquipment;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.listener.ITEquipmentListener;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Audited
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "cssp_it_equipment")
@JsonTypeInfo(
        use=JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ITComputerEntity.class,name = "COMPUTER"),
        @JsonSubTypes.Type(value = ITPrinterEntity.class,name = "PRINTER"),
        @JsonSubTypes.Type(value = ITProjectorEntity.class,name = "PROJECTOR"),
        @JsonSubTypes.Type(value = ITAccessoryEntity.class,name = "ACCESSORY"),
        @JsonSubTypes.Type(value = ITMobileDeviceEntity.class,name = "MOBILE_DEVICE"),
        @JsonSubTypes.Type(value = ITKeyboardEntity.class,name = "KEYBOARD"),
        @JsonSubTypes.Type(value = ITMouseEntity.class,name = "MOUSE"),
        @JsonSubTypes.Type(value = ITMonitorEntity.class,name = "MONITOR"),
        @JsonSubTypes.Type(value = ITUpsEntity.class,name = "UPS"),
        @JsonSubTypes.Type(value = ITSpeakerEntity.class,name = "SPEAKER"),
        @JsonSubTypes.Type(value = ITPrinterEntity.class,name = "PRINTER"),
        @JsonSubTypes.Type(value = ITScannerEntity.class,name = "SCANNER"),
        @JsonSubTypes.Type(value = ITServerEntity.class,name = "SERVER"),
        @JsonSubTypes.Type(value = ITCameraEntity.class,name = "WEB_CAMERA"),
        @JsonSubTypes.Type(value = ITHardDiskEntity.class,name = "HARD_DISK"),
        @JsonSubTypes.Type(value = ITProjectorEntity.class,name = "PROJECTOR"),
        @JsonSubTypes.Type(value = ITMicrophoneEntity.class,name = "MICROPHONE"),
        @JsonSubTypes.Type(value = ITTripodEntity.class,name = "TRIPOD"),
        @JsonSubTypes.Type(value = ITSignaturePadEntity.class,name = "SIGNATURE_PAD"),
        @JsonSubTypes.Type(value = ITWirelessRouterEntity.class,name = "WIRELESS_ROUTER"),
        @JsonSubTypes.Type(value = ITBiometricClockEntity.class,name = "BIOMETRIC_CLOCK"),
        @JsonSubTypes.Type(value = ITElectricBoardEntity.class,name = "ELECTRIC_BOARD"),
        @JsonSubTypes.Type(value = ITVoltageRegulatorEntity.class,name = "VOLTAGE_REGULATOR")
})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@EntityListeners(ITEquipmentListener.class)
public class ITEquipmentEntity {
    @Id
    private String id;

    @JsonProperty("type")
    protected String type;

    @NotBlank(message = "Debe de digitar el nombre del equipo")
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @NotBlank(message = "Debe de digitar la marca del equipo")
    @Column(name = "brand")
    private String brand;

    @NotBlank(message = "Debe de digitar el modelo del equipo")
    @Column(name = "model")
    private String model;

    @NotBlank(message = "Debe de digitar la serial del equipo")
    @Column(name = "serial_number")
    private String serialNumber;

    @NotNull(message = "Debe de digitar el precio del equipo")
    @Column(name = "price")
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private StatusEquipment status;

    @Column(name = "image", unique = true)
    private String image;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "equipment_maintenance_id",referencedColumnName = "id")
    private ITEquipmentMaintenanceEntity equipmentMaintenance;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "purchase_date",precision = 10, scale = 2)
    private LocalDate purchaseDate;

    @Column(name = "useful_life")
    private int usefulLife;

    @Column(name = "residual_value")
    private double residualValue;

    @Column(name = "organizational_unit")
    private Long organizationalUnit;

    @Column(name = "location")
    private Long location;

    @Column(name = "assigned_to")
    private Long assignedTo;

    @Builder.Default
    @OneToMany(mappedBy = "itEquipmentEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ITAccessoryEntity> accessories = new ArrayList<>();

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Column(name = "creation_date")
    private OffsetDateTime creationDate;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Column(name = "modification_date")
    private OffsetDateTime modificationDate;

    @PrePersist
    public void onCreate() {
        this.creationDate = OffsetDateTime.now();
    }

    @PreUpdate
    public void onUpdate() {
        this.modificationDate = OffsetDateTime.now();
    }

}
