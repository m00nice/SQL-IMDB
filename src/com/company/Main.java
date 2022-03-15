package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Data/imdb-data.csv");

        Scanner filereader = new Scanner(file);
        Scanner scanner = new Scanner(System.in);
        ArrayList<DATA> dataTypesList = new ArrayList<>();
        String[] dataTypes = filereader.nextLine().split(";");

        for (int i = 0; i < dataTypes.length; i++) {
            String former = dataTypes[i];
            System.out.println(dataTypes[i]);
            dataTypes[i] = scanner.next();
            if(dataTypes[i].equals("") || dataTypes[i].equals(" ")){
                dataTypes[i] = former;
            }

        }

        ArrayList<String[]> arrayList = new ArrayList<>();

        while(filereader.hasNext()){
            String data[] = filereader.nextLine().split(";");
            arrayList.add(data);
        }
        FileWriter fileWriter = new FileWriter("ddl.sql");


    }
}
