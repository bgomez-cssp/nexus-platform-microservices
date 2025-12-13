package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITWirelessDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITWirelessRouterMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITWirelessRouterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITWirelessRouterImpl extends ITEquipmentImpl implements ITWirelessDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITWirelessRouterImpl.class);
    private ITWirelessRouterMapper mapper;

    protected ITWirelessRouterImpl(@Qualifier("ITWirelessRouterRepository") ITWirelessRouterRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITWirelessRouterMapper mapper){this.mapper = mapper;};
}
