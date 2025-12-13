package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITVoltageRegulatorDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITVoltageRegulatorMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITVoltageRegulatorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITVoltageRegulatorImpl extends ITEquipmentImpl implements ITVoltageRegulatorDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITVoltageRegulatorImpl.class);
    private ITVoltageRegulatorMapper mapper;

    protected ITVoltageRegulatorImpl(@Qualifier("ITVoltageRegulatorRepository") ITVoltageRegulatorRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITVoltageRegulatorMapper mapper){this.mapper = mapper;};
}
