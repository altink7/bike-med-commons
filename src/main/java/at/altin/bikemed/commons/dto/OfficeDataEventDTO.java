package at.altin.bikemed.commons.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * OfficeDataEventDTO, which should be used for BikeMed office data events.
 * Gathered data from both Lager and Werkstatt.
 * @author Altin
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class OfficeDataEventDTO extends EventDTO implements Serializable {
    private LagerEventDTO lagerEventDTO;
    private WerkstattEventDTO werkstattEventDTO;
}
