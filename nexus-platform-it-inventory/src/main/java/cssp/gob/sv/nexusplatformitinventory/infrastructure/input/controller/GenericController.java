package cssp.gob.sv.nexusplatformitinventory.infrastructure.input.controller;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITEquipment;
import cssp.gob.sv.nexusplatformitinventory.domain.repository.IGenericDomainContract;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.input.repository.IGenericInfraController;
import cssp.gob.sv.nexusplatformitinventory.shared.ResponseUtil;
import cssp.gob.sv.nexusplatformitinventory.shared.Utils;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class GenericController<M,E,ID,S extends IGenericDomainContract<M,E,ID>> implements IGenericInfraController<M,E,ID>
{
    protected final S service;
    protected String entityName;
    private static final Logger log = LoggerFactory.getLogger(GenericController.class);

    public GenericController(S service) {
        this.service = service;
    }

    @PostMapping("/save")
    @Override
    public ResponseEntity<?> save(@RequestBody @Valid  E domain, BindingResult bindingResult) {
        log.info("METHOD: SAVE {}",entityName);
        Map<String,Object> validation = Utils.getValidation(bindingResult);
        if (validation !=null){
            return ResponseUtil.buildErrorResponse(HttpStatus.BAD_REQUEST,false,validation);
        }
        var entitySave = service.save(domain);
        if (entitySave!=null){
            return ResponseUtil.buildSuccessResponse(HttpStatus.CREATED,String.format("%ss saved successfully",entityName));
        }
        return ResponseUtil.buildErrorResponse(HttpStatus.BAD_REQUEST,false);
    }

    @PatchMapping("/update")
    @Override
    public ResponseEntity<?> update(E entity, BindingResult bindingResult) {
        log.info("METHOD: UPDATE {}",entityName);
        Map<String,Object> validation = Utils.getValidation(bindingResult);
        if (validation !=null){
            return ResponseUtil.buildErrorResponse(HttpStatus.BAD_REQUEST,false,validation);
        }
        if(entity instanceof ITEquipment equipment){
            ID id = (ID) equipment.getId();
            Optional<E> optionalEntity = service.findById(id);
            if(optionalEntity.isPresent()){
                BeanUtils.copyProperties(equipment, optionalEntity, Utils.getNullPropertyNames(equipment));
                var entitySave = service.save(optionalEntity.get());
                if (entitySave!=null){
                    return ResponseUtil.buildSuccessResponse(HttpStatus.CREATED,String.format("%ss saved successfully",entityName));
                }
            }else{
                return ResponseUtil.buildErrorResponse(HttpStatus.NOT_FOUND,false);
            }
        }
        return ResponseUtil.buildErrorResponse(HttpStatus.BAD_REQUEST,false);
    }

    @GetMapping("/find-id")
    @Override
    public ResponseEntity<?> findById(ID id) {
        log.info("METHOD: FIND-BY-ID -> {}",id);
        Optional<M> oEntity = service.findByIdModel(id);
        return oEntity.map(entity -> ResponseUtil.buildSuccessResponse(HttpStatus.OK, entity)).orElseGet(() -> ResponseUtil.buildErrorResponse(HttpStatus.NOT_FOUND, false));
    }

    @GetMapping("/find-all")
    @Override
    public ResponseEntity<?> findAll() {
        log.info("METHOD: FIND-ALL");
        List<M> list = (List<M>) service.findAll();
        if (list.isEmpty()) {
            Map<String, Object> message = new HashMap<>();
            message.put("success", Boolean.TRUE);
            message.put("message", String.format("No se han encontrado %ss", entityName));
            return ResponseEntity.ok().body(message);
        }

        return ResponseEntity.ok(Map.of("success", Boolean.TRUE, "data",list));
    }

    @DeleteMapping("/delete-id")
    @Override
    public ResponseEntity<?> deleteById(ID id) {
        log.info("METHOD: DELETE-BY-ID -> {}",id);
        Optional<M> oEntity = service.findByIdModel(id);
        if (oEntity.isEmpty()){
            return ResponseUtil.buildErrorResponse(HttpStatus.NOT_FOUND,false);
        }
        service.deleteById(id);
        return ResponseUtil.buildSuccessResponse(HttpStatus.OK,"Entitdad has sido eliminada "+ oEntity.get().getClass().getName());
    }
}
