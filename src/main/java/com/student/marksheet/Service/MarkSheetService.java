package com.student.marksheet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.student.marksheet.DAO.MarkSheetDao;
import com.student.marksheet.Entity.MarkSheet;

@Service
public class MarkSheetService {
   @Autowired 
   MarkSheetDao markSheetDao;
   @Autowired
   RestTemplate restTemplate1;
  

    public String createMarkSheet(MarkSheet markSheet) {
        markSheet.setSem1Total(markSheet.getSem1Theory() + markSheet.getSem1Practicals());
        markSheet.setSem2Total(markSheet.getSem2Theory() + markSheet.getSem2Practicals());

        return markSheetDao.createMarkSheet(markSheet);
    }
    public List<MarkSheet> getAllMarks() {
        return markSheetDao.getAllMarks();
    }

}
