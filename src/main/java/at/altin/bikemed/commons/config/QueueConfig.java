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
public class QueueConfig {

   private QueueConfig() {
       // utility class
   }

    public static final String QUEUE_DISPATCHER = "bike-med-dispatcher-queue";
    public static final String QUEUE_API = "bike-med-api-queue";
    public static final String QUEUE_WERKSTATT = "bike-med-werkstatt-queue";
    public static final String QUEUE_LAGER = "bike-med-lager-queue";
    public static final String QUEUE_OFFICE = "bike-med-invoicing-queue";
}
