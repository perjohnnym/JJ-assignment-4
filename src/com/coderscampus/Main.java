package com.coderscampus;

import java.io.BufferedWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

     //   System.out.println("this is my assignment #4");

        FileService fileService = new FileService();
        Student[] students = fileService.getStudentsFromFile();

        System.out.println("------This is PRE SORT --------");

        for(Student student : students){
            System.out.println(student.getStudentID() + " " +  student.getStudentName() + " " + student.getCourse() + " " + student.getGrade());
        }

//here , sort the students by grade, then separate by course into 3 different student course array

        Arrays.sort(students);

        System.out.println( "\n------This is POST Sort ---- Ascending order by Course, then Desc by Grade---");
        //Now that the array has been sorted in Desc order by Course, then Grade, we can read through it and writ to spec files

        /* Here we should initialize our BufferedWriter for each of the 3 files
                BufferedReader fileReader = null;
         */
        BufferedWriter fileWriterCourse1 = null;
        BufferedWriter fileWriterCourse2 = null;
        BufferedWriter fileWriterCourse3 = null;

        for(Student student : students){
            System.out.println(student.getStudentID() + " " +  student.getStudentName() + " " + student.getCourse() + " " + student.getGrade());
            if (student.getCourse().contains("COMPSCI")) {
                System.out.println("contains string COMPSCI");
              //  fileService.initializeFileCourse1();
                fileService.writeStudentsToFileCourse1();
              } else if(student.getCourse().contains("APMTH")){
                    System.out.println("contains string APMTH");
            } else if (student.getCourse().contains("STAT")){
                System.out.println("contains string STAT");
            }
        }



    }
}
