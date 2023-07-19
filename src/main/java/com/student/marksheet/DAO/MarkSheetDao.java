package com.student.marksheet.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.student.marksheet.Entity.MarkSheet;
import com.student.marksheet.Repository.MarkSheetRepository;

@Repository
public class MarkSheetDao {
	@Autowired
    MarkSheetRepository markSheetRepository;
	@Autowired
	RestTemplate restTemplate;

    public String createMarkSheet(MarkSheet markSheet) {
        markSheetRepository.save(markSheet);
        return "Success";
    }

    public List<MarkSheet> getAllMarks() {
        return markSheetRepository.findAll();
    }
}