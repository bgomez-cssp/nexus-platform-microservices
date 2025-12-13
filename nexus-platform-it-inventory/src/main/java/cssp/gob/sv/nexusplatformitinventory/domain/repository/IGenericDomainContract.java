package cssp.gob.sv.nexusplatformitinventory.domain.repository;

import java.util.Optional;

public interface IGenericDomainContract<M,E,ID>{
    Optional<M> findByIdModel(ID id);
    Optional<E> findById(ID id);
    M save(E model);
    Iterable<M>findAll();
    void deleteById(ID id);
}

