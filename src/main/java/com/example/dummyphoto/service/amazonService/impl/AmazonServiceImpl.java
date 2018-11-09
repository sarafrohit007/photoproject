package com.example.dummyphoto.service.amazonService.impl;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.example.dummyphoto.service.amazonService.IAmazonService;

public class AmazonServiceImpl implements IAmazonService{

	@Override
	public AmazonS3Client getAmazonS3Client() {
		AmazonS3Client s3Client = null;
        AWSCredentials s3Credentials = new BasicAWSCredentials("", "");
        s3Client = new AmazonS3Client(s3Credentials);
        return s3Client;
	}

}
