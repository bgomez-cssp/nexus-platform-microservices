package cssp.gob.sv.nexusplatformitinventory.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import cssp.gob.sv.nexusplatformitinventory.domain.enums.StatusEquipment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ITEquipment {
    private String id;
    protected String type;
    private String name;
    private String description;
    private String brand;
    private String model;
    private String serialNumber;
    private BigDecimal price;
    private StatusEquipment status;
    private String image;
    private ITEquipmentMaintenance equipmentMaintenance;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate purchaseDate;
    private int usefulLife;
    private double residualValue;
    private Long organizationalUnit;
    private Long location;
    private Long assignedTo;
    private List<ITAccessory> accessories = new ArrayList<>();
    private OffsetDateTime creationDate;
    private OffsetDateTime modificationDate;

}
