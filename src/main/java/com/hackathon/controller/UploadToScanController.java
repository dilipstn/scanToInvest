package com.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hackathon.model.response.FileUploadResponse;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UploadToScanController {
	
	
	@GetMapping(value = "/api/v1/getStatus")
	public ResponseEntity<String> getStatus(){
		
		return new ResponseEntity<>("Success", HttpStatus.OK);
	}
	
	@PostMapping(value = "/api/v1/fileUpload")
	public ResponseEntity<List<FileUploadResponse>> getFileUploadData(@RequestParam("file") MultipartFile file){
		List<FileUploadResponse> fileUploadsData = new ArrayList<>();
		FileUploadResponse fileUploadResponse = new FileUploadResponse();
		fileUploadResponse.setName("Alphabet Inc.");
		fileUploadResponse.setPrice("233.18");
		fileUploadResponse.setQty("5");
		fileUploadResponse.setAction("Buy");
		fileUploadsData.add(fileUploadResponse);
		return new ResponseEntity<>(fileUploadsData, HttpStatus.OK);
	}

}
