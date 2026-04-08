package com.xuyang.classmanager.entity;

public class Grade {
    private  Integer id;
    private  Integer studentId;
    private  String course;
    private  Integer score;
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getStudentId(){
        return studentId;
    }
    public  void setStudentId(Integer studentId){
        this.studentId = studentId;
    }
    public String getCourse(){
        return course;
    }
    public  void setCourse(String course){
        this.course = course;
    }
    public Integer getScore(){
        return score;
    }
    public void  setScore(Integer score){
        this.score = score;
    }
}
