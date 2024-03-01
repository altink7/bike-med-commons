package at.altin.bikemed.commons.config;

/**
 * ExchangeConfig
 * This class is used to define the exchange configuration.
 * This Exchanges should be used for BikeMed.
 *
 * @author Altin
 */
public class ExchangeConfig {

    private ExchangeConfig() {
        // utility class
    }

    public static final String API_DISPATCHER_EXCHANGE = "bike-med-api-dispatcher-exchange";
    public static final String DISPATCHER_WERKSTATT_EXCHANGE = "bike-med-dispatcher-werkstatt-exchange";
    public static final String DISPATCHER_LAGER_EXCHANGE = "bike-med-dispatcher-lager-exchange";
    public static final String DISPATCHER_OFFICE_EXCHANGE = "bike-med-dispatcher-office-exchange";
    public static final String WERKSTATT_DISPATCHER_EXCHANGE = "bike-med-werkstatt-dispatcher-exchange";
    public static final String LAGER_DISPATCHER_EXCHANGE = "bike-med-lager-dispatcher-exchange";
}
