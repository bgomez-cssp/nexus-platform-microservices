package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITScannerDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITScannerMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITScannerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITScannerImpl extends ITEquipmentImpl implements ITScannerDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITScannerImpl.class);
    private ITScannerMapper mapper;

    protected ITScannerImpl(@Qualifier("ITScannerRepository") ITScannerRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITScannerMapper mapper){this.mapper = mapper;};
}
