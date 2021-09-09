package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args)throws IOException {
	var fileName = "student.txt";
    String all_names = Files.readString(Paths.get(fileName));
    String[] name_list = all_names.split("\n");
    for (String name: name_list){
        System.out.println(name);
    }
    }
}
