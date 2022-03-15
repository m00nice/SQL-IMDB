package com.company;

import DATA.DATA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/DATA/imdb-data.csv");
        Scanner filereader = new Scanner(file);
        Scanner scanner = new Scanner(System.in);
        DATA data = new DATA();
        String tableName = scanner.next();
        String[] columnsData = filereader.nextLine().split(";");

        String column1 = "";
        String column2 = "";
        String column3 = "";
        String column4 = "";
        String column5 = "";
        String column6 = "";
        String column7 = "";

        for (int i = 0; i < columnsData.length; i++) {
        if(i == 1){column1 = columnsData[i];}
        if(i == 2){column2 = columnsData[i];}
        if(i == 3){column3 = columnsData[i];}
        if(i == 4){column4 = columnsData[i];}
        if(i == 5){column5 = columnsData[i];}
        if(i == 6){column6 = columnsData[i];}
        if(i == 7){column7 = columnsData[i];}
        }
        System.out.println(data.createTable(tableName,column1,column2,column3,column4,column5,column6,column7,columnsData.length));

        while (filereader.hasNext()) {
            String data1 = "";
            String data2 = "";
            String data3 = "";
            String data4 = "";
            String data5 = "";
            String data6 = "";
            String data7 = "";
            String[] datas = filereader.nextLine().split(";");
            for (int j = 0; j < datas.length; j++) {
                if(j == 1){data1 = datas[j];}
                if(j == 2){data2 = datas[j];}
                if(j == 3){data3 = datas[j];}
                if(j == 4){data4 = datas[j];}
                if(j == 5){data5 = datas[j];}
                if(j == 6){data6 = datas[j];}
                if(j == 7){data7 = datas[j];}
            }
            System.out.println(data.insertDATA(tableName,column1,column2,column3,column4,column5,column6,column7,data1,data2,data3,data4,data5,data6,data7, datas.length));
        }

    }
}
