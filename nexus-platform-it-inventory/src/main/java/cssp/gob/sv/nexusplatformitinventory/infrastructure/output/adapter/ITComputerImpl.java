package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITComputerDomainContract;

import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITComputerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITComputerImpl extends ITEquipmentImpl implements ITComputerDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITComputerImpl.class);
    private ITComputerImpl mapper;

    protected ITComputerImpl(@Qualifier("ITComputerRepository") ITComputerRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMapper(ITComputerImpl mapper) {
        this.mapper = mapper;
    }
}
