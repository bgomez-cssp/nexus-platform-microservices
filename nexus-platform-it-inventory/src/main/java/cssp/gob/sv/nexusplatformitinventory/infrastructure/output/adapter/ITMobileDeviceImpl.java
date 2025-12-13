package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITMobileDeviceDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITMobileDeviceMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITMobileDeviceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITMobileDeviceImpl extends ITEquipmentImpl implements ITMobileDeviceDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITMobileDeviceImpl.class);
    private ITMobileDeviceMapper mapper;

    protected ITMobileDeviceImpl(@Qualifier("ITMobileDeviceRepository") ITMobileDeviceRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITMobileDeviceMapper mapper){this.mapper = mapper;};
}
