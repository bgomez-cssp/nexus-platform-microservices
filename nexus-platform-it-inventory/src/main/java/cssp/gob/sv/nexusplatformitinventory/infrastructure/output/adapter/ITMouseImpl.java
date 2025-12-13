package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITMouseDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITMouseMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITMouseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITMouseImpl extends ITEquipmentImpl implements ITMouseDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITMouseImpl.class);
    private ITMouseMapper mapper;

    protected ITMouseImpl(@Qualifier("ITMouseRepository") ITMouseRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITMouseMapper mapper){this.mapper = mapper;};
}
