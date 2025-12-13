package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITHardDiskDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITHardDiskMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITHardDiskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITHardDiskImpl extends ITEquipmentImpl implements ITHardDiskDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITHardDiskImpl.class);
    private ITHardDiskMapper mapper;

    protected ITHardDiskImpl(@Qualifier("ITHardDiskRepository") ITHardDiskRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITHardDiskMapper mapper){this.mapper = mapper;};
}
