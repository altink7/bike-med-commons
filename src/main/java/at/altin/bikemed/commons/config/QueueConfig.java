package at.altin.bikemed.commons.config;

import lombok.Getter;

/**
 * QueueConfig
 * This enum is used to define the queue configuration.
 * This Queues should be used for BikeMed.
 * No need for env or profile-specific configuration.
 *
 * @author Altin
 */
@Getter
public enum QueueConfig {
    QUEUE_DISPATCHER("bike-med-dispatcher-queue"),
    QUEUE_API("bike-med-api-queue"),
    QUEUE_WERKSTATT("bike-med-werkstatt-queue"),
    QUEUE_LAGER("bike-med-lager-queue"),
    QUEUE_OFFICE("bike-med-invoicing-queue");

    private final String name;

    QueueConfig(String queueName) {
        this.name = queueName;
    }
}
