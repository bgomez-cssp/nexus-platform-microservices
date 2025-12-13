package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITPrinterDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITPrinterMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITPrinterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ITPrinterImpl extends ITEquipmentImpl implements ITPrinterDomainContract {

    private final Logger log = LoggerFactory.getLogger(ITPrinterImpl.class);
    private ITPrinterMapper mapper;

    protected ITPrinterImpl( @Qualifier("ITPrinterRepository") ITPrinterRepository repository) {
        super(repository);
    }

    @Autowired
    public void setMappper(ITPrinterMapper mapper){this.mapper = mapper;};
}
