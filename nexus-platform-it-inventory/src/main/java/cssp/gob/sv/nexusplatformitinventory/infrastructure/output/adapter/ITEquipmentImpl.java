package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITEquipment;
import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITEquipmentDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITEquipmentEntity;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITEquipmentMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITEquipmentRepository;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.repository.BaseMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class ITEquipmentImpl  implements ITEquipmentDomainContract {

    private static final Logger log = LoggerFactory.getLogger(ITEquipmentImpl.class);
    private final ITEquipmentRepository repository;
    private ITEquipmentMapper mapper;

    protected ITEquipmentImpl(@Qualifier("ITEquipmentRepository") ITEquipmentRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setMapper(ITEquipmentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Optional<ITEquipment> findByIdModel(String id) {
        return repository.findById(id).map(mapper::toDomain);
    }

    @Override
    public Optional<ITEquipmentEntity> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public ITEquipment save(ITEquipmentEntity itEquipment) {
        return mapper.toDomain(this.repository.save(itEquipment));
    }

    @Override
    public Iterable<ITEquipment> findAll() {
        return repository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
