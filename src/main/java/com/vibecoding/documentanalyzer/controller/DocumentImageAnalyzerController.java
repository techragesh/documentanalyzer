package com.vibecoding.documentanalyzer.controller;

import com.vibecoding.documentanalyzer.model.ImageAnalysisResponse;
import com.vibecoding.documentanalyzer.model.UrlAnalysisRequest;
import com.vibecoding.documentanalyzer.service.DocumentImageAnalyzerService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/documentimage/analysis")
public class DocumentImageAnalyzerController {

  private final DocumentImageAnalyzerService documentImageAnalyzerService;

  public DocumentImageAnalyzerController(DocumentImageAnalyzerService documentImageAnalyzerService) {
    this.documentImageAnalyzerService = documentImageAnalyzerService;
  }


  @PostMapping("/images")
  public ResponseEntity<ImageAnalysisResponse> analyzeFromClasspath(@RequestBody UrlAnalysisRequest request) {
    ImageAnalysisResponse imageAnalysisResponse = documentImageAnalyzerService.analyzeImageFromClasspath(request.fileName(), request.prompt());
    return ResponseEntity.ok(imageAnalysisResponse);
  }

  @PostMapping("/from-files")
  public ResponseEntity<ImageAnalysisResponse> analyzeFromMultipart(@RequestParam("images") List<MultipartFile> images, @RequestParam("prompt") String prompt) {
    ImageAnalysisResponse imageAnalysisResponse = documentImageAnalyzerService.analyzeImagesFromMultipart(images, prompt);
    return ResponseEntity.ok(imageAnalysisResponse);
  }
}
