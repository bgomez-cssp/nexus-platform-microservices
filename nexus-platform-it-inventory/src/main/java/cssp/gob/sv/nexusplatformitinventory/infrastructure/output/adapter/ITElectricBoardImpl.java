package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITElectricBoardDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITElectricBoardMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITElectricBoardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITElectricBoardImpl extends ITEquipmentImpl implements ITElectricBoardDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITElectricBoardImpl.class);
    private ITElectricBoardMapper mapper;

    protected ITElectricBoardImpl(@Qualifier("ITElectricBoardRepository") ITElectricBoardRepository repository) {
        super(repository);
    }
    @Autowired
    public void setMappper(ITElectricBoardMapper mapper){this.mapper = mapper;};
}
