package com.vrnda.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vrnda.beans.JobSeeker;

@Controller
public class JobSeekerController {
	
	@Autowired
	private ServletContext sc;
	
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
}
