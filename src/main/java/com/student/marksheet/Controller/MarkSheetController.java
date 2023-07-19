package com.student.marksheet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.marksheet.Entity.MarkSheet;
import com.student.marksheet.Service.MarkSheetService;

@RestController
public class MarkSheetController {
    private final MarkSheetService markSheetService;

    @Autowired
    public MarkSheetController(MarkSheetService markSheetService) {
        this.markSheetService = markSheetService;
    }

    @PostMapping("/markSheet")
    public String createMarkSheet(@RequestBody MarkSheet markSheet) {
        return markSheetService.createMarkSheet(markSheet);
    }
    @GetMapping("/getAllMarks")
    public List<MarkSheet> getAllMarks() {
        return markSheetService.getAllMarks();
    }
}
