package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Take;
import kr.ac.hansung.service.TakeService;

@Controller
public class SeparationController {
	
	@Autowired
	private TakeService takeService;
	
	@RequestMapping("/creditBySeparation")
	public String showTakes(Model model) {
		List<Take> takes = takeService.getCreditsBySeparation();
		model.addAttribute("takes", takes);
		int totalCredit = takeService.getTotalCredit();
		model.addAttribute("totalCredit", totalCredit);
		return "creditBySeparation";
	}

}
