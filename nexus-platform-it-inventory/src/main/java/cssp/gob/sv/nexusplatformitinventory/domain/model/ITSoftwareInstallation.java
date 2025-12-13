package cssp.gob.sv.nexusplatformitinventory.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class  ITSoftwareInstallation {
    private Long id;
    private ITComputer computer;
    private ITSoftware software;
    private String codeInstallation;
    private String email;
    private String password;
    private OffsetDateTime creationDate;
    private OffsetDateTime modificationDate;
}
