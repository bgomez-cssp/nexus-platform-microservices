package cssp.gob.sv.nexusplatformitinventory.infrastructure.input.controller;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITEquipment;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter.ITEquipmentImpl;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITEquipmentEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory/equipments/")
public class ITEquipmentController extends GenericController<ITEquipment, ITEquipmentEntity,String, ITEquipmentImpl> {

    public ITEquipmentController(@Qualifier("ITEquipmentImpl") ITEquipmentImpl service) {
        super(service);
        super.entityName = "ITEquipment";
    }

}
