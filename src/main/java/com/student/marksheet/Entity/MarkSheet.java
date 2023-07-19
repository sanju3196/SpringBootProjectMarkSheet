package com.student.marksheet.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mark_sheet")
public class MarkSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rollNumber;
    private int sem1Theory;
    private int sem1Practicals;
    private int sem2Theory;
    private int sem2Practicals;
    private int sem1Total;
    private int sem2Total;

    public MarkSheet() {
    }

    public MarkSheet(String rollNumber, int sem1Theory, int sem1Practicals, int sem2Theory, int sem2Practicals) {
        this.rollNumber = rollNumber;
        this.sem1Theory = sem1Theory;
        this.sem1Practicals = sem1Practicals;
        this.sem2Theory = sem2Theory;
        this.sem2Practicals = sem2Practicals;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getSem1Theory() {
        return sem1Theory;
    }

    public void setSem1Theory(int sem1Theory) {
        this.sem1Theory = sem1Theory;
    }

    public int getSem1Practicals() {
        return sem1Practicals;
    }

    public void setSem1Practicals(int sem1Practicals) {
        this.sem1Practicals = sem1Practicals;
    }

    public int getSem2Theory() {
        return sem2Theory;
    }

    public void setSem2Theory(int sem2Theory) {
        this.sem2Theory = sem2Theory;
    }

    public int getSem2Practicals() {
        return sem2Practicals;
    }

    public void setSem2Practicals(int sem2Practicals) {
        this.sem2Practicals = sem2Practicals;
    }

    public int getSem1Total() {
        return sem1Total;
    }

    public void setSem1Total(int sem1Total) {
        this.sem1Total = sem1Total;
    }

    public int getSem2Total() {
        return sem2Total;
    }

    public void setSem2Total(int sem2Total) {
        this.sem2Total = sem2Total;
    }
}

