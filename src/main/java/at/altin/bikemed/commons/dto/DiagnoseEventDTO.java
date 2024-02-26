package at.altin.bikemed.commons.dto;

import at.altin.bikemed.commons.exception.BikeMedException;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Arrays;

/**
 * DiagnoseEventDTO, which should be used for BikeMed diagnose events.
 *
 * @author Altin
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class DiagnoseEventDTO extends EventDTO implements Serializable {
    private boolean plattenReparatur;
    private boolean ventil;
    private boolean bremsen;
    private boolean schaltung;
    private boolean beleuchtungVorne;
    private boolean beleuchtungHinten;
    private boolean reflector;
    private boolean federung;
    private boolean rahmen;
    private boolean gabel;
    private boolean kettenantrieb;
    private boolean elektrischeKomponenten;
    private boolean sonstigeProbleme;
    private String customNote;

    /**
     * Counts the number of false booleans in the class, which are the not fixed problems.
     * @return the number of false booleans in the class.
     */
    public long countFalseBooleans() {
        return Arrays.stream(getClass().getDeclaredFields())
                .filter(field -> field.getType() == boolean.class)
                .mapToLong(field -> {
                    try {
                        return field.getBoolean(this) ? 0 : 1;
                    } catch (IllegalAccessException e) {
                        throw new BikeMedException("Fehler beim Zugriff auf das Feld", e);
                    }
                })
                .sum();
    }

    /**
     * Returns the property name at the given index.
     * @param index the index of the property name.
     * @return the property name at the given index.
     */
    public static String getPropertyNameAtIndex(int index) {
        String[] propertyNames = {
                "plattenReparatur",
                "ventil",
                "bremsen",
                "schaltung",
                "beleuchtungVorne",
                "beleuchtungHinten",
                "reflector",
                "federung",
                "rahmen",
                "gabel",
                "kettenantrieb",
                "elektrischeKomponenten"};

        if (index >= 0 && index < propertyNames.length) {
            return propertyNames[index];
        } else {
            throw new IllegalArgumentException("Ungültiger Index für Eigenschaften namen: " + index);
        }
    }

}
