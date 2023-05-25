package com.bilport.demo.domain.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

@Document(collection = "students")
public class Student extends User {
    String studentName;
    String studentSurname;
    String studentEmail;
    String assignedEvaluatorId;
    String assignedTaId;
    String assignedSupervisorId;
    int reportVersionCS299;
    int reportVersionCS399;

    public Student() {
    }

    public Student(String userName, String userPassword, List<GrantedAuthority> userAuthorities, String studentName,
            String studentSurname,
            String studentEmail, String assignedEvaluatorId, String assignedTaId, String assignedSupervisorId,
            int reportVersionCS299, int reportVersionC399) {
        super(userName, userPassword, userAuthorities);
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentEmail = studentEmail;
        this.assignedEvaluatorId = assignedEvaluatorId;
        this.assignedTaId = assignedTaId;
        this.assignedSupervisorId = assignedSupervisorId;
        this.reportVersionCS299 = reportVersionCS299;
        this.reportVersionCS399 = reportVersionC399;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String surname) {
        this.studentSurname = surname;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String email) {
        this.studentEmail = email;
    }

    public String getAssignedEvaluatorId() {
        return assignedEvaluatorId;
    }

    public void setAssignedEvaluatorId(String assignedEvaluatorId) {
        this.assignedEvaluatorId = assignedEvaluatorId;
    }

    public String getAssignedTaId() {
        return assignedTaId;
    }

    public void setAssignedTaId(String assignedTaId) {
        this.assignedTaId = assignedTaId;
    }

    public String getAssignedSupervisorId() {
        return assignedSupervisorId;
    }

    public void setAssignedSupervisorId(String assignedSupervisorId) {
        this.assignedSupervisorId = assignedSupervisorId;
    }

    public int getReportVersionCS299() {
        return reportVersionCS299;
    }

    public void setReportVersionCS299(int reportVersionCS299) {
        this.reportVersionCS299 = reportVersionCS299;
    }

    public int getReportVersionCS399() {
        return reportVersionCS399;
    }

    public void setReportVersionCS399(int reportVersionCS399) {
        this.reportVersionCS399 = reportVersionCS399;
    }

}
