package cssp.gob.sv.nexusplatformitinventory.infrastructure.input.repository;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;

public interface IGenericInfraController <M,E,ID> {
    ResponseEntity<?> save(E entity, BindingResult bindingResult);
    ResponseEntity<?> update(E model, BindingResult bindingResult);
    ResponseEntity<?> findById(ID id);
    ResponseEntity<?> findAll();
    ResponseEntity<?> deleteById(ID id);
}
