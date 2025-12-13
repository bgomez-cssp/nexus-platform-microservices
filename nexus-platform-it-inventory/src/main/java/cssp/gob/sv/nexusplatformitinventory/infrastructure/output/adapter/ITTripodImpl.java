package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITTripodDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITTripodMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITTripodRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITTripodImpl extends ITEquipmentImpl implements ITTripodDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITTripodImpl.class);
    private ITTripodMapper mapper;

    protected ITTripodImpl(@Qualifier("ITTripodRepository") ITTripodRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITTripodMapper mapper){this.mapper = mapper;};
}
