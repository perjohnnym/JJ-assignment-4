package com.coderscampus;


import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        FileService fileService = new FileService();
        Student[] students = fileService.getStudentsFromFile();

//Here, we sort the student file by course into 3 different student files.
// Each file will be ordered by Grade, Descending order.
        Arrays.sort(students);
        fileService.writeStudentsToFiles(students);

    }
}
