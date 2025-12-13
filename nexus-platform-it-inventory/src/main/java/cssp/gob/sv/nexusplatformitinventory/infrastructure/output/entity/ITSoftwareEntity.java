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
@Table(name = "cssp_it_software")
public class ITSoftwareEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String version;

    private String description;

    private String itBrand;

    @Column(name = "creation_date")
    private OffsetDateTime creationDate;

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
