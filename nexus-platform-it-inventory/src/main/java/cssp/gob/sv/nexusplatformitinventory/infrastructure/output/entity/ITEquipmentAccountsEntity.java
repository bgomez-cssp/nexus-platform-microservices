package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

@Audited
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cssp_it_equipments_accounts")
public class ITEquipmentAccountsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String username;

    private String password;

    @ManyToOne
    private ITComputerEntity computer;
}
