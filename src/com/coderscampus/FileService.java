package com.coderscampus;

import java.io.*;


public class FileService {

    BufferedReader fileReader;
    BufferedWriter fileWriterCourse1 = null;
    BufferedWriter fileWriterCourse2 = null;
    BufferedWriter fileWriterCourse3 = null;


    public Student[] getStudentsFromFile () {



        try {
            int i = 0;

            Student[] students = new Student[100];
            fileReader = new BufferedReader(new FileReader("student-master-list.csv"));
            String line;

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

    public void writeStudentsToFiles(Student[] students) throws IOException {


       fileWriterCourse1 = new BufferedWriter(new FileWriter("course1.csv"));
       fileWriterCourse2 = new BufferedWriter(new FileWriter("course2.csv"));
       fileWriterCourse3 = new BufferedWriter(new FileWriter("course3.csv"));

       writeHeaderRecs();

        for(Student student : students){
            if (student.getCourse().contains("COMPSCI") ) {
                fileWriterCourse1.write(student.getStudentID() + ", " + student.getStudentName() + ", " + student.getCourse() + ", " + student.getGrade() + "\n");

            }else if (student.getCourse().contains("STAT")) {
                fileWriterCourse2.write(student.getStudentID() + ", " + student.getStudentName() + ", " + student.getCourse() + ", " + student.getGrade() + "\n");
            }else if (student.getCourse().contains("APMTH")){
                fileWriterCourse3.write(student.getStudentID() + ", " + student.getStudentName() + ", " + student.getCourse() + ", " + student.getGrade() + "\n");
            }


        } // end for-statement


        fileWriterCourse1.close();
        fileWriterCourse2.close();
        fileWriterCourse3.close();
    }

    private void writeHeaderRecs() throws IOException {

        fileWriterCourse1.write("Student ID, " + "Student Name, " + "Course, " + "Grade" + "\n");
        fileWriterCourse2.write("Student ID, " + "Student Name, " + "Course, " + "Grade" + "\n");
        fileWriterCourse3.write("Student ID, " + "Student Name, " + "Course, " + "Grade" + "\n");

    }

}

