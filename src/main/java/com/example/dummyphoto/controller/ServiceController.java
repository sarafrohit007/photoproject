package com.example.dummyphoto.controller;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.dummyphoto.service.amazonService.IAmazonService;
import com.example.dummyphoto.service.util.FileUtils;

@Controller
@RequestMapping("/service")
public class ServiceController {
	
	@Autowired
	private IAmazonService amazonService;
	
	private static final Logger LOG = LoggerFactory.getLogger(ServiceController.class);

	@RequestMapping(value = "/upload/picture", method = RequestMethod.POST)
	@ResponseBody
	public String uploadDocument(@RequestParam("uploadedFile") MultipartFile file) {
		try {
			FileUtils.upload(file.getInputStream(), file.getContentType(), "");
			// amazonStorageService.uploadFileWithPublicAccess(contentPath, new
			// File(uploadFilePath), file.getContentType());
			amazonService.uploadFile("", null, "", null);
		} catch (IOException e) {
			LOG.error("error uploading pan details");
		}
		return "";
	}
}
