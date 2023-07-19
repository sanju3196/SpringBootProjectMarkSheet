package com.student.marksheet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.marksheet.Entity.MarkSheet;

public interface MarkSheetRepository extends JpaRepository<MarkSheet, Long> {
}
