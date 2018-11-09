package com.example.dummyphoto.service.amazonService;

import java.io.File;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;

public interface IAmazonService {

	AmazonS3Client getAmazonS3Client();
	
	void uploadFile(String key, File file, String contentType, CannedAccessControlList acl);
}
