package com.vibecoding.documentanalyzer.model;

import java.util.List;

/**
 * Defines the API request body for analyzing images from URLs or a single classpath file.
 */
public record UrlAnalysisRequest(
        List<String> imageUrls,
        String prompt,
        String fileName
) {
}