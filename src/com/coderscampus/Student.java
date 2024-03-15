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
    //Segregate by Course Name (excluding the course level number), then order by Grade Desc


        if (this.getCourse().substring(0, 7).compareTo(OtherStudent.getCourse().substring(0, 7)) == 0) {
            return OtherStudent.getGrade().compareTo(this.getGrade());
        } else if (this.getCourse().substring(0, 4).compareTo(OtherStudent.getCourse().substring(0, 4)) == 0){
            return OtherStudent.getGrade().compareTo(this.getGrade());
        } else if (this.getCourse().substring(0, 5).compareTo(OtherStudent.getCourse().substring(0, 5)) == 0){
            return OtherStudent.getGrade().compareTo(this.getGrade());
        }
        return this.getCourse().compareTo(OtherStudent.getCourse());
    }
}
