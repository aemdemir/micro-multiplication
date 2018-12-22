package microservices.book.gamification.client;

import microservices.book.gamification.client.dto.MultiplicationResultAttempt;

/**
 * This interface defines functions to connect to the Multiplication microservice.
 */
public interface MultiplicationResultAttemptClient {

    MultiplicationResultAttempt retrieveMultiplicationResultAttemptbyId(final Long multiplicationId);

}
