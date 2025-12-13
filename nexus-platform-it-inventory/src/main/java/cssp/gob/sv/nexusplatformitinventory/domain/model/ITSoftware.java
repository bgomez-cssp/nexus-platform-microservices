package cssp.gob.sv.nexusplatformitinventory.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ITSoftware {
    private Long id;
    private String name;
    private String version;
    private String description;
    private String itBrand;
    private OffsetDateTime creationDate;
    private OffsetDateTime modificationDate;
}
