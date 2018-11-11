package com.example.dummyphoto.service.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileUtils implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 4259815671434158646L;
	private static final Logger LOG = LoggerFactory.getLogger(FileUtils.class);

	public static void upload(InputStream uploadStream, String contentType, String filePath) {
		// Upload file to Disk
		File file = new File(filePath);
		file.getParentFile().mkdirs();

		BufferedInputStream bufferedInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			bufferedInputStream = new BufferedInputStream(uploadStream);
			fileOutputStream = new FileOutputStream(filePath);
			byte[] by = new byte[32768]; // 32K buffer buf, 0, buf.length
			int index = bufferedInputStream.read(by, 0, 32768);
			while (index != -1) {
				fileOutputStream.write(by, 0, index);
				index = bufferedInputStream.read(by, 0, 32768);
			}
		} catch (IOException e) {
			LOG.error("IOException: " + e.toString());
		} finally {
			try {
				if (fileOutputStream != null)
					fileOutputStream.flush();
				if (bufferedInputStream != null)
					bufferedInputStream.close();
				if (fileOutputStream != null)
					fileOutputStream.close();
			} catch (IOException e) {
				LOG.error("IOException while cleaning up upload temp file");
			}
		}
	}

}
