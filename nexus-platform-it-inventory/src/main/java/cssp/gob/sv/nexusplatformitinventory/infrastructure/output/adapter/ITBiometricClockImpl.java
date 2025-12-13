package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITBiometricClockDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITBiometricClockMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITBiometricClockRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITBiometricClockImpl extends ITEquipmentImpl implements ITBiometricClockDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITBiometricClockImpl.class);
    private ITBiometricClockMapper mapper;

    protected ITBiometricClockImpl(@Qualifier("ITBiometricClockRepository") ITBiometricClockRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMapper(ITBiometricClockMapper mapper) {
        this.mapper = mapper;
    }
}
