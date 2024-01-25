package com.coderscampus;

public class Main {

    public static void main(String[] args){

        System.out.println("this is my assignment #4");

        FileService fileService = new FileService();
        Student[] students = fileService.getStudentsFromFile();

        String[] studentNames = new String[101];

        System.out.println("------This is PRE SORT --------");
        int i=0;
        for(Student estudiante : students){
            System.out.println(studentNames[i]	= estudiante.getStudentName());
            i++;
        }
    }
}
