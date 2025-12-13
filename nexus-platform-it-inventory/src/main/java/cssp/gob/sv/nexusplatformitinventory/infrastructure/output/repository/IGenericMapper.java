package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.repository;

public interface IGenericMapper<E, D> {
    D toDomain(E entity);
    E toEntity(D dto);
}

