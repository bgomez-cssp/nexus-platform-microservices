package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITSignaturePadDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITSignaturePadMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITSignaturePadRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITSignaturePadImpl extends ITEquipmentImpl implements ITSignaturePadDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITSignaturePadImpl.class);
    private ITSignaturePadMapper mapper;

    protected ITSignaturePadImpl(@Qualifier("ITSignaturePadRepository") ITSignaturePadRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITSignaturePadMapper mapper){this.mapper = mapper;};
}
