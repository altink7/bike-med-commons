package at.altin.bikemed.commons.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

/**
 * LagerEventDTO, which should be used for BikeMed lager events.
 * @author Altin
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class LagerEventDTO extends EventDTO implements Serializable {
    private Map<String, Double> products;
}
