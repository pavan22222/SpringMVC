package com.vrnda.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vrnda.beans.JobSeeker;
import com.vrnda.service.FileManagementService;

@Controller
public class FileDownloadController {
	
	@Autowired
	private ServletContext sc;
	
	@Autowired
	private FileManagementService service;
	
	@GetMapping("/home")
	public String homeHandler() {
		return "home";
	}
	
	@GetMapping("/upload")
	public String uploadGetHandler(@ModelAttribute("jobSeeker") JobSeeker seeker) {
		seeker.setAddr("Hyd");
		return "upload";
	}
	
	@PostMapping("/upload")
	public String uploadPostHandler(RedirectAttributes redirect,@ModelAttribute("jobSeeker") JobSeeker seeker) throws Exception {
		String desFolder=sc.getInitParameter("location");
		File file=new File(desFolder);
		if(!file.exists())
			file.mkdir();
		String resumeFileName=seeker.getResume().getOriginalFilename();
		String photoFileName=seeker.getPhoto().getOriginalFilename();
		
		InputStream resumeIs=seeker.getResume().getInputStream();
		InputStream photoIs=seeker.getPhoto().getInputStream();
		
		OutputStream resumeOs=new FileOutputStream(desFolder+"/"+resumeFileName);
		OutputStream photoOs=new FileOutputStream(desFolder+"/"+photoFileName);
		IOUtils.copy(resumeIs, resumeOs);
		IOUtils.copy(photoIs, photoOs);
		redirect.addFlashAttribute("resumeFileName", resumeFileName);
		redirect.addFlashAttribute("photoFileName", photoFileName);
		return "redirect:result";
	}
	
	@GetMapping("/result")
	public String resultGetHandler(Model model) {
		return "result";
	}
	
	@GetMapping("/getAllFilesList")
	public String getAllFilesList(Model model) {
		String location=sc.getInitParameter("location");
		model.addAttribute("files", service.fetchAllFileNames(location));
		return "files";
	}
	
	@GetMapping("/download")
	public String fileDownload(@RequestParam String fileName,HttpServletResponse res) throws Exception {
		String filePath=sc.getInitParameter("location")+"/"+fileName;
		File file=new File(filePath);
		res.setContentLengthLong(file.length());
		String mimeType=sc.getMimeType(filePath);
		res.setContentType(mimeType == null ?"application/octet-stream":mimeType);
		InputStream is=new FileInputStream(filePath);
		OutputStream os=res.getOutputStream();
		res.addHeader("Content-Disposition","attachment;fileName="+fileName);
		IOUtils.copy(is, os);
		return null;
	}
	
}
