package com.vibecoding.documentanalyzer.model;

/**
 * Represents the final text response from the AI model, sent back to the client.
 */
public record ImageAnalysisResponse(
        String response
) {
}