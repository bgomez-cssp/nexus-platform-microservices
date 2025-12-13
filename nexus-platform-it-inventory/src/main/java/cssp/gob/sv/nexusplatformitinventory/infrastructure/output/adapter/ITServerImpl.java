package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITServerDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITServerMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITServerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITServerImpl extends ITEquipmentImpl implements ITServerDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITServerImpl.class);
    private ITServerMapper mapper;

    protected ITServerImpl(@Qualifier("ITServerRepository") ITServerRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITServerMapper mapper){this.mapper = mapper;};
}
