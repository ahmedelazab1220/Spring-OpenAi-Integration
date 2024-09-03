# OpenAI Chat Integration with Spring Boot

This project demonstrates the integration of OpenAI's API into a Spring Boot application using Spring's AI chat client. The API provides an interface for interacting with OpenAI's language models via a simple RESTful endpoint.

## Project Structure

1. Configuration Class
   **`OpenAiConfiguration`** : This class configures the **ChatClient** bean, which is responsible for communicating with the OpenAI API. The ChatClient is initialized using its builder and managed by Spring's IoC container, making it accessible throughout the application.

2. Controller Class
   **`AiController`** : This REST controller exposes an endpoint that allows users to send messages to the OpenAI chat model. The controller uses the **ChatClient** to process the input message and returns the AI-generated response.

## Endpoints

**`GET /api/v1/ai`** :

- Description: Sends a user-provided message to OpenAI's chat model and returns the generated response.

- Parameters:
  - message (optional): The input message to be processed by the AI. Defaults to "Tell a joke" if not provided.
  - Response: A JSON object containing the AI's response.

## How to Use

1. Clone the repository.
   - git clone https://github.com/ahmedelazab1220/Spring-OpenAi-Integration.git
   - cd Spring-OpenAi-Integration
   - Ensure you have the necessary OpenAI API credentials.
   - Run the application using your preferred IDE or via the command line using **`./mvnw spring-boot:run`**.
   - Send a GET request to /api/v1/ai?message=YourMessage to interact with OpenAI.
   - curl "http://localhost:8080/api/v1/ai?message=Hello"

## Conclusion

This project provides a straightforward implementation for integrating OpenAI's language models with a Spring Boot application. By following this structure, you can easily extend the functionality to include more complex AI-driven features, making your application more dynamic and interactive.
