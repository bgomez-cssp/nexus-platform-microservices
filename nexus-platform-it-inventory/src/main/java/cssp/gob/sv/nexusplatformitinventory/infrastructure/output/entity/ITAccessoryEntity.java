package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import java.time.OffsetDateTime;

@Audited
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cssp_it_accessories")
public class ITAccessoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @ManyToOne
    private ITEquipmentEntity itEquipmentEntity;

    @Column(name = "creation_date")
    private OffsetDateTime creationDate;

    @Column(name = "modification_date")
    private OffsetDateTime modificationDate;

    @PrePersist
    public void onCreate() {
        creationDate = OffsetDateTime.now();
    }

    @PostPersist
    public void onUpdate() {
        modificationDate = OffsetDateTime.now();
    }

}

