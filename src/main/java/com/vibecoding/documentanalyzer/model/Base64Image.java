package com.vibecoding.documentanalyzer.model;

/**
 * Represents a single image encoded as a Base64 string, including its MIME type.
 */
public record Base64Image(
        String mimeType,
        String data  // The Base64 encoded string
) {
}