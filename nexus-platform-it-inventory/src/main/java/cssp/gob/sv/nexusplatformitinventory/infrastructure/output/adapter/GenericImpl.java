package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.adapter;

import cssp.gob.sv.nexusplatformitinventory.domain.repository.IGenericDomainContract;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.stream.Collectors;

public abstract class GenericImpl<M,E,ID,R extends JpaRepository<E,ID>> implements IGenericDomainContract<M,E,ID> {
    private static final Logger log = LoggerFactory.getLogger(GenericImpl.class);
    protected final R repository;
    protected abstract E toEntity(M model);
    protected abstract M toDomain(E entity);

    protected GenericImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public Optional<E> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public Optional<M> findByIdModel(ID id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public M save(E entity) {
        return toDomain(repository.save(entity));
    }

    @Override
    public Iterable<M> findAll() {
        return repository.findAll().stream()
                .map(this::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

}
