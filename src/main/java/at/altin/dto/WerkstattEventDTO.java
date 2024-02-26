package at.altin.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * WerkstattEventDTO, which should be used for BikeMed werkstatt events.
 * @author Altin
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class WerkstattEventDTO extends EventDTO implements Serializable {
    private DiagnoseEventDTO diagnoseEventDTO;
    private String werkstattName;
    private int anzahlMitarbeiter;
    private double stundenSatz;
}
