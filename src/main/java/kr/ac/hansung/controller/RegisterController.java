package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Take;
import kr.ac.hansung.service.TakeService;

@Controller
public class RegisterController {
	
	@Autowired
	private TakeService takeService;
	
	@RequestMapping("/registerForCourse")
	public String registerCourse(Model model) {
		model.addAttribute("take", new Take());
		return "/registerForCourse";
	}
	
	@RequestMapping("/addTake")
	public String addCourse(Model model, @Valid Take take, BindingResult result) {
		
		if(result.hasErrors()) {
			
			System.out.println("===Form data does not validated");
			List<ObjectError> errors = result.getAllErrors();
			
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
			}
			
			return "/registerForCourse";
			
		}
		
		takeService.insert(take);
		
		return "home";
	}
	
/*	@RequestMapping("/docreate")
	public String doCreate(Model model, @Valid Offer offer , BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("===Form data dose not validated");
			List<ObjectError> errors = result.getAllErrors();
			
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "createoffer";
		}
		
		offerService.insert(offer);
		
		return "offercreated";
	}*/
}
