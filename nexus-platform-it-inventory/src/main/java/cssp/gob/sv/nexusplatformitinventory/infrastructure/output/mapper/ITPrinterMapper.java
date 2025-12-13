package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITPrinter;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITPrinterEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITPrinterMapper{
    ITPrinterEntity toEntity(ITPrinter itAccessory);
    ITPrinter toDomain(ITPrinterEntity itPrinterEntity);
}
