package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.persistence.listener;

import cssp.gob.sv.nexusplatformitinventory.domain.enums.ITEquipmentsTypesEnum;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.*;
import jakarta.persistence.PrePersist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ITEquipmentListener {

    private static ITEquipmentIDServices itEquipmentIDServices;
    private static final Logger log = LoggerFactory.getLogger(ITEquipmentListener.class);

    @Autowired
    public void setItEquipmentIDServices(ITEquipmentIDServices services) {
        ITEquipmentListener.itEquipmentIDServices = services;
    }

    @PrePersist
    public void setID(ITEquipmentEntity equipment) {
        log.info("AGREGANDO ID A EQUIPO");
        if (equipment != null) {
            switch (equipment){
                case ITComputerEntity computer -> {
                    if (computer.isLaptop()){
                        equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_LAPTOP.getCode(),ITComputerEntity.class.getName()));
                    }else {
                        equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_COMPUTER.getCode(),ITComputerEntity.class.getName()));
                    }
                }
                case ITKeyboardEntity keyboard -> {
                    getInfo(keyboard);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_KEYBOARD.getCode(),ITKeyboardEntity.class.getName()));
                }
                case ITMouseEntity mouse -> {
                    getInfo(mouse);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_MOUSE.getCode(),ITMouseEntity.class.getName()));
                }
                case ITMonitorEntity monitor -> {
                    getInfo(monitor);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_MONITOR.getCode(),ITMonitorEntity.class.getName()));
                }
                case ITUpsEntity ups-> {
                    getInfo(ups);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_UPS.getCode(),ITUpsEntity.class.getName()));
                }
                case ITSpeakerEntity speaker -> {
                    getInfo(speaker);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_SPEAKER.getCode(),ITSpeakerEntity.class.getName()));
                }
                case ITPrinterEntity printer-> {
                    getInfo(printer);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_PRINTER.getCode(),ITPrinterEntity.class.getName()));
                }
                case ITScannerEntity scanner-> {
                    getInfo(scanner);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_SCANNER.getCode(),ITScannerEntity.class.getName()));
                }
                case ITServerEntity server-> {
                    getInfo(server);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_SERVER.getCode(),ITServerEntity.class.getName()));
                }
                case ITCameraEntity camera-> {
                    getInfo(camera);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_WEB_CAMERA.getCode(),ITCameraEntity.class.getName()));
                }
                case ITHardDiskEntity hardDisk-> {
                    getInfo(hardDisk);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_HARD_DISK.getCode(),ITHardDiskEntity.class.getName()));
                }
                case ITProjectorEntity projector-> {
                    getInfo(projector);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_PROJECTOR.getCode(),ITProjectorEntity.class.getName()));
                }
                case ITMicrophoneEntity microphone-> {
                    getInfo(microphone);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_MICROPHONE.getCode(),ITMicrophoneEntity.class.getName()));
                }
                case ITTripodEntity tripod-> {
                    getInfo(tripod);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_TRIPOD.getCode(),ITTripodEntity.class.getName()));
                }
                case ITSignaturePadEntity signaturePad-> {
                    getInfo(signaturePad);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_SIGNATURE_PAD.getCode(),ITSignaturePadEntity.class.getName()));
                }
                case ITWirelessRouterEntity router-> {
                    getInfo(router);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_WIRELESS_ROUTER.getCode(),ITWirelessRouterEntity.class.getName()));
                }
                case ITBiometricClockEntity biometricClock-> {
                    getInfo(biometricClock);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_BIOMETRIC_CLOCK.getCode(),ITBiometricClockEntity.class.getName()));
                }
                case ITElectricBoardEntity electricBoard-> {
                    getInfo(electricBoard);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_ELECTRIC_BOARD.getCode(),ITElectricBoardEntity.class.getName()));
                }
                case ITVoltageRegulatorEntity voltageRegulator-> {
                    getInfo(voltageRegulator);
                    equipment.setId(itEquipmentIDServices.generateID(ITEquipmentsTypesEnum.IT_VOLTAGE_REGULATOR.getCode(),ITVoltageRegulatorEntity.class.getName()));
                }

                default -> throw new IllegalStateException("Unexpected value: " + equipment);
            }
        }
    }

    private static void getInfo(ITEquipmentEntity equipment){
        log.info("AGREGANDO ID A EQUIPO {}",equipment);
    }
}
