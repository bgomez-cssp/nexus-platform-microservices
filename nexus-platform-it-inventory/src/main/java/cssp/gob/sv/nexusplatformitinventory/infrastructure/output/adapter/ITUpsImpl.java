package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITUpsDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITUpsMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITUpsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITUpsImpl extends ITEquipmentImpl implements ITUpsDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITUpsImpl.class);
    private ITUpsMapper mapper;

    @Autowired
    protected ITUpsImpl(@Qualifier("ITUpsRepository") ITUpsRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITUpsMapper mapper){this.mapper = mapper;};
}
