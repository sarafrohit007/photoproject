package com.example.dummyphoto.service.amazonService;

import com.amazonaws.services.s3.AmazonS3Client;

public interface IAmazonService {

	AmazonS3Client getAmazonS3Client();
}
