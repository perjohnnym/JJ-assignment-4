package com.coderscampus;


import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        FileService fileService = new FileService();
        Student[] students = fileService.getStudentsFromFile();

        System.out.println("------This is PRE SORT --------");

        for(Student student : students){
            System.out.println(student.getStudentID() + " " +  student.getStudentName() + " " + student.getCourse() + " " + student.getGrade());
        }

//Here, we sort the students by grade, then separate by course into 3 different student course array
        Arrays.sort(students);
        fileService.writeStudentsToFiles(students);

        Arrays.sort(students, new Comparator<Student>() {

                @Override
                public int compare(Student o1, Student o2) {

                    if (o1.getCourse().contains("COMP")) {
                        String subString1 = o1.getCourse().substring(0, 7);
                        String subString2 = o2.getCourse().substring(0, 7);
                        return subString1.compareTo(subString2);
                    }
                    return 0;

                }
        });
       // fileService.writeStudentsToFiles(students);
    }
}
