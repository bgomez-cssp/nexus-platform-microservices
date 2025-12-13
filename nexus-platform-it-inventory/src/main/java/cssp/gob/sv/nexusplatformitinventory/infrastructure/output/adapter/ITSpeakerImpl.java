package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITSpeakerDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITSpeakerMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITSpeakerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITSpeakerImpl extends ITEquipmentImpl implements ITSpeakerDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITSpeakerImpl.class);
    private ITSpeakerMapper mapper;

    protected ITSpeakerImpl(@Qualifier("ITSpeakerRepository") ITSpeakerRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITSpeakerMapper mapper){this.mapper = mapper;};
}
