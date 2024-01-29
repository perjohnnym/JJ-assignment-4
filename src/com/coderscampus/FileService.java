package com.coderscampus;

import java.io.*;


public class FileService {
    BufferedWriter fileWriterCourse1 = null;

    public Student[] getStudentsFromFile () {

        BufferedReader fileReader = null;

        try {
            int i = 0;
            String line = null;
            Student[] students = new Student[100];
            fileReader = new BufferedReader(new FileReader("student-master-list.csv"));

            while ((line = fileReader.readLine()) != null) {
                if (line.contains("Student ID")) continue;

                String[] lineData = line.split(",");
                Student student = new Student(lineData[0], lineData[1], lineData[2], lineData[3]);
                students[i] = student;
                i++;

            }
            return students;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;


    }

    public void writeStudentsToFileCourse1(){
        //System.out.println("this record belongs to file course1.csv");
        try {
            BufferedWriter fileWriterCourse1 = new BufferedWriter(new FileWriter("course1.csv"));
              System.out.println("you've reached the filewriter");
              fileWriterCourse1.write("this is COMP SCI\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void initializeFileCourse1(){

        System.out.println("Initializing file COURSE1.CSV");

/*        try {
            BufferedWriter fileWriterCourse1 = new BufferedWriter(new FileWriter("course1.csv"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

    }
}
