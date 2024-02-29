package at.altin.bikemed.commons.config;

import lombok.Getter;

@Getter
public class QueueTestVariables {

    private QueueTestVariables() {
        // utility class
    }

    private static final String HOSTNAME = "goose.rmq2.cloudamqp.com";
    private static final String USERNAME = "juglmawp";
    private static final String PASSWORD = "bg8I7Qo3zvto1wvrSksMJyRf56xuC7EX";
    private static final String VIRTUAL_HOST = "juglmawp";
}
