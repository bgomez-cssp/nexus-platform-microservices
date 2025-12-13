package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITEquipmentNetworkDetail;
import cssp.gob.sv.nexusplatformitinventory.domain.repository.ITEquipmentNetworkDetailDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITEquipmentNetworkDetailEntity;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper.ITEquipmentNetworkDetailMapper;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.data.ITEquipmentNetworkDetailRepository;
import org.springframework.stereotype.Service;

@Service
public class ITEquipmentNetworkDetailImpl extends GenericImpl<ITEquipmentNetworkDetail, ITEquipmentNetworkDetailEntity,Long, ITEquipmentNetworkDetailRepository> implements ITEquipmentNetworkDetailDomainContract {

    private final ITEquipmentNetworkDetailMapper mapper;

    protected ITEquipmentNetworkDetailImpl(ITEquipmentNetworkDetailRepository repository, ITEquipmentNetworkDetailMapper mapper) {
        super(repository);
        this.mapper = mapper;
    }

    @Override
    protected ITEquipmentNetworkDetailEntity toEntity(ITEquipmentNetworkDetail model) {
        return mapper.toEntity(model);
    }

    @Override
    protected ITEquipmentNetworkDetail toDomain(ITEquipmentNetworkDetailEntity entity) {
        return mapper.toDomain(entity);
    }

}
