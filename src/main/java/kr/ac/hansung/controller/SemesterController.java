package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Take;
import kr.ac.hansung.service.TakeService;

@Controller
public class SemesterController {
	
	@Autowired
	private TakeService takeService;
	
	@RequestMapping("/creditBySemester")
	public String showTakes(Model model) {
		List<Take> takes = takeService.getCreditsBySemester();
		model.addAttribute("takes", takes);
		return "creditBySemester";
	}
	/*/semester로 request가 날아올 경우 showTakes가 불려서 수행되고 모델에 결과를 담고 semester.jsp로 이동*/

}
