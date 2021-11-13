package com.vrnda.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FileManagementService {
	
	public List<String> fetchAllFileNames(String location){
		List<String> filesNames=new ArrayList<String>();
		File fileStore=new File(location);
		File[] files=fileStore.listFiles();
		for(File file:files) {
			if(file.exists()) {
				filesNames.add(file.getName());
			}
		}
		return filesNames;
	}
}
