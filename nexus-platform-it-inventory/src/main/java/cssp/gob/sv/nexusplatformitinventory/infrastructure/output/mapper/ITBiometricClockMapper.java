package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITBiometricClock;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITBiometricClockEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITBiometricClockMapper{
    ITBiometricClockEntity toEntity(ITBiometricClock itBiometricClock);
    ITBiometricClock toDomain(ITBiometricClockEntity itBiometricClockEntity);
}
