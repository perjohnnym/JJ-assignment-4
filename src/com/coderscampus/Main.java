package com.coderscampus;


import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        FileService fileService = new FileService();
        Student[] students = fileService.getStudentsFromFile();

        System.out.println("------This is PRE SORT --------");

        for(Student student : students){
            System.out.println(student.getStudentID() + " " +  student.getStudentName() + " " + student.getCourse() + " " + student.getGrade());
        }

//here , sort the students by grade, then separate by course into 3 different student course array
        Arrays.sort(students);

        fileService.writeStudentsToFiles(students);

    }
}
