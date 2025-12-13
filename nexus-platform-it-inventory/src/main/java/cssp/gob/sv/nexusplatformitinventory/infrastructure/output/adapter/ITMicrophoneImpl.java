package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITMicrophoneDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITMicrophoneMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITMicrophoneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITMicrophoneImpl extends ITEquipmentImpl implements ITMicrophoneDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITMicrophoneImpl.class);
    private ITMicrophoneMapper mapper;

    protected ITMicrophoneImpl(@Qualifier("ITMicrophoneRepository") ITMicrophoneRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITMicrophoneMapper mapper){this.mapper = mapper;};
}
