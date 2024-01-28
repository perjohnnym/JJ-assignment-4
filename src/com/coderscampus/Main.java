package com.coderscampus;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        System.out.println("this is my assignment #4");

        FileService fileService = new FileService();
        Student[] students = fileService.getStudentsFromFile();

        System.out.println("------This is PRE SORT --------");

        for(Student student : students){
            System.out.println(student.getStudentID() + " " +  student.getStudentName() + " " + student.getCourse() + student.getGrade());
        }

//here , sort the students by grade, then separate by course into 3 different student course array

        Arrays.sort(students);
        System.out.println("------This is POST Sort ---- sorted by Descending order by course, then grade----");

        //Now that the array has been sorted in Desc order by Course, then Grade, we can read through it and writ to spec files


        for(Student student : students){
            System.out.println(student.getStudentID() + " " +  student.getStudentName() + " " + student.getCourse() + " " + student.getGrade());
        }



    }
}
