package com.coderscampus;

//this is the Students POJO

public class Student {

    private String StudentID;
    private String StudentName;
    private String Course;
    private String Grade;

    //create the constructor for Students

    public Student(String StudentID, String StudentName, String Course, String Grade){
        this.StudentID=StudentID;
        this.StudentName=StudentName;
        this.Course=Course;
        this.Grade=Grade;
    }

    //create the getter for the object fields
    public String getStudentID(){return StudentID;}
    public String getStudentName(){return StudentName;}
    public String getCourse(){return Course;}
    public String getGrade(){return Grade;}

}
