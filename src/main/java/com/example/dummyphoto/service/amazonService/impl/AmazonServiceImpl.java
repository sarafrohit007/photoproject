package com.example.dummyphoto.service.amazonService.impl;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.example.dummyphoto.service.amazonService.IAmazonService;

public class AmazonServiceImpl implements IAmazonService{
	
	private static final Logger LOG          = LoggerFactory.getLogger(AmazonServiceImpl.class);

	@Override
	public AmazonS3Client getAmazonS3Client() {
		AmazonS3Client s3Client = null;
        AWSCredentials s3Credentials = new BasicAWSCredentials("", "");
        s3Client = new AmazonS3Client(s3Credentials);
        return s3Client;
	}

	@Override
	public void uploadFile(String key, File file, String contentType, CannedAccessControlList acl) {
		try {
            //String bucketName = CacheManager.getInstance().getCache(SystemPropertiesCache.class).getS3BucketName();
			String bucketName = "";
            AmazonS3 s3Client = getAmazonS3Client();
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, file);
            ObjectMetadata metaData = new ObjectMetadata();
            metaData.setContentType(contentType);
            //metaData.setCacheControl(cacheControl);
            metaData.setCacheControl("");
            String md5 = s3Client.putObject(putObjectRequest.withCannedAcl(acl).withMetadata(metaData)).getETag();
            LOG.info(key + " was stored successfully on S3.");
            //return md5;
        } catch (AmazonServiceException ase) {
            LOG.error("Error Message: " + ase.getMessage() + " HTTP Status Code: " + ase.getStatusCode() + " AWS Error Code: " + ase.getErrorCode() + " Error Type: "
                    + ase.getErrorType() + " Request ID: " + ase.getRequestId());
            throw ase;
        } catch (AmazonClientException ace) {
            LOG.error("Error Message: " + ace.getMessage());
            throw ace;
        }
	}

}
