package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.model.Take;
import kr.ac.hansung.service.TakeService;

@Controller
public class ShowController {
	
	@Autowired
	private TakeService takeService;
	
	@RequestMapping("/showTakes")
	public String showTakes(Model model, @RequestParam("year") int year, @RequestParam("semester") int semester) {
		List<Take> takes = takeService.getTakesByYearAndSemester(year, semester);
		model.addAttribute("takes", takes);
		return "showTakes";
	}

}
