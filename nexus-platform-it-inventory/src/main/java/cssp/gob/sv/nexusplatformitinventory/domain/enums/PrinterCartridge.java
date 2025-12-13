package cssp.gob.sv.nexusplatformitinventory.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PrinterCartridge {
    // Cartuchos de tinta HP (Inkjet)
    HP_662_BLACK("HP 662 Black", "Inkjet"),
    HP_662_COLOR("HP 662 Tri-color", "Inkjet"),
    HP_664_BLACK("HP 664 Black", "Inkjet"),
    HP_664_COLOR("HP 664 Tri-color", "Inkjet"),
    HP_678_BLACK("HP 678 Black", "Inkjet"),
    HP_678_COLOR("HP 678 Tri-color", "Inkjet"),

    // Cartuchos de tóner HP (Laser)
    HP_12A_TONER("HP 12A", "Laser"),
    HP_83A_TONER("HP 83A", "Laser"),
    HP_85A_TONER("HP 85A", "Laser"),
    HP_17A_TONER("HP 17A", "Laser"),
    HP_26A_TONER("HP 26A", "Laser"),
    HP_80A_TONER("HP 80A", "Laser"),
    HP_305A_TONER("HP 305A", "Laser Color"),
    HP_305A_TONER_COLOR("HP 305A COLOR", "Laser Color");

    private final String displayName;
    private final String technology;
}
