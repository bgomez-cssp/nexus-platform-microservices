package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITMonitorDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITMonitorMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITMonitorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITMonitorImpl extends ITEquipmentImpl implements ITMonitorDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITMonitorImpl.class);
    private ITMonitorMapper mapper;

    protected ITMonitorImpl(@Qualifier("ITMonitorRepository") ITMonitorRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITMonitorMapper mapper){this.mapper = mapper;};
}
