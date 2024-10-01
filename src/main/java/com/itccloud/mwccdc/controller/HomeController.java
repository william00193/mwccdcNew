package com.itccloud.mwccdc.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	
	@GetMapping("/home")
	public String home(Model model) throws IOException {
		
	
	    return "home-form";
	    
	    
	}
	
	@GetMapping("/business1")
	public String business1(Model model) throws IOException {
		
	
	    return "business1-form";
	    
	    
	}
	
	
	@GetMapping("/bootstrap-home")
	public String bootstrapHome(Model model) throws IOException {
		
	
	    return "bootstrap-home-form";
	    
	    
	}
	
	
	
	@GetMapping("/bootstrap-feature1")
	public String bootstrapFeature1(Model model) throws IOException {
		
	
	    return "bootstrap-feature1-form";
	    
	    
	}
	
	
	
	@GetMapping("/advance")
	public String advance(Model model) throws IOException {
		
		//PS I wound up using Gemini for this following line of code, I originally had about 15 lines here
		// Gemini shoed me how to condense this into a single line which was kind of cool, it saved me from having to manually 
		// add each of the different personObject attributes
		
	    List<personObject> users = csvFileHandling.readCSV(); 
	    model.addAttribute("users1", users);
	    return "advance-form";
	    
	    
	}
	
}

		
