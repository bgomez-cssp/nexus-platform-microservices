package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import java.time.OffsetDateTime;

@Audited
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cssp_it_software_installations")
public class  ITSoftwareInstallationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cssp_it_computer_id")
    private ITComputerEntity computer;

    @ManyToOne
    @JoinColumn(name = "cssp_it_software_id")
    private ITSoftwareEntity software;

    private String codeInstallation;

    private String email;

    private String password;

    @Column(name = "creation_date")
    private OffsetDateTime creationDate;

    @Column(name = "modification_date")
    private OffsetDateTime modificationDate;
}
