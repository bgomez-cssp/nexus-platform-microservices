package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITProjectorDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITProjectorMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITProjectorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITProjectorImpl extends ITEquipmentImpl implements ITProjectorDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITProjectorImpl.class);
    private ITProjectorMapper mapper;

    protected ITProjectorImpl(@Qualifier("ITProjectorRepository") ITProjectorRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITProjectorMapper mapper){this.mapper = mapper;};
}
