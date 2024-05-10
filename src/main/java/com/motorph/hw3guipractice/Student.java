/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.motorph.hw3guipractice;

/**
 *
 * @author kjalcala
 */
public class Student {

    //attributes
    private String studentNumber;
    private String studentName;
    private float milestone1;
    private float milestone2;
    private float ta;
    private float averageGrade;
    
    //getter and setter methods
    //getter methods
    public String getStudentNumber() {
        return studentNumber;
    }
   
    public String getStudentName() {
        return studentName;
    }
   
    public String getMilestone1() {
        return String.valueOf(milestone1);
    }
   
    public String getMilestone2() {
        return String.valueOf(milestone2);
    }
   
    public String getTA() {
        return String.valueOf(ta);
    }
   
    public String getAveGrade() {
        return String.valueOf(averageGrade);
    }
   
    //setter methods
    public void setStudentNumber(String studNumber) {
        studentNumber = studNumber;
    }
   
    public void setStudentName(String studName) {
        studentName = studName;
    }
   
    public void setMilestone1(float ms1) {
        milestone1 = ms1;
    }
   
    public void setMilestone2(float ms2) {
        milestone2 = ms2;
    }
   
    public void setTA(float ta) {
        this.ta = ta;
    }
   
    //methods
    public float computeAverage() {
        averageGrade = (milestone1 + milestone2 + ta) / 3;
        return averageGrade;
    }
}
