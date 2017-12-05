package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.TakeDAO;
import kr.ac.hansung.model.Take;

@Service
public class TakeService {
	
	@Autowired
	private TakeDAO takeDao;

	public List<Take> getCreditsBySemester() {
		
		List<Take> takes = takeDao.getDistinctYearAndSemester();

		return takes;
	}

	public List<Take> getTakesByYearAndSemester(int year, int semester) {
		
		List<Take> takes = takeDao.getTakesByYearAndSemester(year, semester);
		
		return takes;
		
	}
	
	public List<Take> getCreditsBySeparation() {
		
		List<Take> takes = takeDao.getCreditBySeparation();
		
		return takes;
		
	}

	public int getTotalCredit() {
		
		int totalCredit = takeDao.getTotalCredit();
		
		return totalCredit;
	}

	public void insert(Take take) {

		takeDao.insert(take);
		
	}

}
