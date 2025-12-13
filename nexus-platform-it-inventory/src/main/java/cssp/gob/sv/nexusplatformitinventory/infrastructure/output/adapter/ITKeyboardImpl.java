package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITKeyboardDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITKeyboardMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITKeyboardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITKeyboardImpl extends ITEquipmentImpl implements ITKeyboardDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITKeyboardImpl.class);
    private ITKeyboardMapper mapper;

    protected ITKeyboardImpl(@Qualifier("ITKeyboardRepository") ITKeyboardRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITKeyboardMapper mapper){this.mapper = mapper;};
}
