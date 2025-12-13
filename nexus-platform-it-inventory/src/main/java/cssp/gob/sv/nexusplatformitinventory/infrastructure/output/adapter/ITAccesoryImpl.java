package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITAccessory;
import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITAccesoryDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITAccessoryEntity;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITAccessoryMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITAccessoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ITAccesoryImpl extends GenericImpl<ITAccessory,ITAccessoryEntity,Long, ITAccessoryRepository> implements ITAccesoryDomainContract {

    private static final Logger log = LoggerFactory.getLogger(ITAccesoryImpl.class);
    private final ITAccessoryMapper mapper;

    protected ITAccesoryImpl(ITAccessoryRepository repository, ITAccessoryMapper mapper) {
        super(repository);
        this.mapper = mapper;
    }

    @Override
    protected ITAccessoryEntity toEntity(ITAccessory model) {
        return mapper.toEntity(model);
    }

    @Override
    protected ITAccessory toDomain(ITAccessoryEntity entity) {
        return mapper.toDomain(entity);
    }
}
