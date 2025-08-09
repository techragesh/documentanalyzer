# Document Analyzer

Document Analyzer is a Spring Boot-based application that allows users to analyze images and ask questions about the content of the images in a chat interface. The application uses GeminiAI as the Large Language Model (LLM) for processing and Lovable as the frontend tool for creating the user interface.

## Live Application

The application is live and accessible at: [https://ai-image-prompt.lovable.app/](https://ai-image-prompt.lovable.app/)

## Features

- Analyze images to extract meaningful information.
- Chat interface for users to ask questions about the analyzed image.
- Powered by GeminiAI for advanced language and image understanding.

## Technologies Used

- **Backend**: Java, Spring AI
- **Frontend**: Lovable
- **Build Tool**: Maven
- **LLM**: GeminiAI
- **Containerization**: Docker
- **Deployment**: Render.com

## Endpoints

### 1. Analyze Image
- **URL**: `/api/v1/documentimage/analysis?prompt={prompt}`
- **Method**: `POST`
- **Description**: Accepts an image file and analyzes its content.
- **Request**:
    - Content-Type: `multipart/form-data`
    - Body:
        - `images`: The image file to be analyzed.
- **Response**:
  ```json
  {
  "response": "The total withdrawal amount is $1,515.63."
}