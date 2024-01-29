package com.coderscampus;

//this is the Students POJO

public  class Student implements Comparable<Student>{

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

    @Override
    public int compareTo(Student OtherStudent) {
    //Ascending order sort by Course, then Desc by Grade
        if (this.getCourse().compareTo(OtherStudent.getCourse()) == 0) {
            return OtherStudent.getGrade().compareTo(this.getGrade());
        } else {
            return this.getCourse().compareTo(OtherStudent.getCourse());
        }

    }
}
