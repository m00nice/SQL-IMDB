package com.company;

public class DATA {
    public String parameter0 = null;
    public String parameter1 = null;
    public String parameter2 = null;
    public String parameter3 = null;
    public String parameter4 = null;
    public String parameter5 = null;
    public String parameter6 = null;
    public String parameter7 = null;
    public String parameter8 = null;
    public String parameter9 = null;
    public int columnAmount = 0;

    public void addToColumnAmount(){
        this.columnAmount = columnAmount + 1;
    }


    public String insertDATA(String tableName, String column1){
        if(columnAmount == 1) {
            return "INSERT INTO " + tableName + " (\"" + column1 + "\") VALUES (\"" + data1 + "\");";
        }
        if(columnAmount == 2) {
            return "INSERT INTO " + tableName + " (\"" + column1 + "\",\"" + column2 + "\") " +
                    "VALUES (\"" + data1 + "\",\"" + data2 + "\");";
        }
        if(columnAmount == 3) {
            return "INSERT INTO " + tableName + " (\"" + column1 + "\",\"" + column2 + "\",\"" + column3 + "\") " +
                    "VALUES (\"" + data1 + "\",\"" + data2 + "\",\"" + data3 + "\",);";
        }
        if(columnAmount == 4) {
            return "INSERT INTO " + tableName + " (\"" + column1 + "\",\"" + column2 + "\",\"" + column3 + "\",\"" + column4 + "\") " +
                    "VALUES (\"" + data1 + "\",\"" + data2 + "\",\"" + data3 + "\",\"" + data4 + "\",);";
        }
        if(columnAmount == 5) {
            return "INSERT INTO " + tableName + " (\"" + column1 + "\",\"" + column2 + "\",\"" + column3 + "\",\"" + column4 + "\",\"" + column5 + "\") " +
                    "VALUES (\"" + data1 + "\",\"" + data2 + "\",\"" + data3 + "\",\"" + data4 + "\",\"" + data5 + "\",);";
        }
        if(columnAmount == 6) {
            return "INSERT INTO " + tableName + " (\"" + column1 + "\",\"" + column2 + "\",\"" + column3 + "\",\"" + column4 + "\",\"" + column5 + "\",\"" + column6 + "\") " +
                    "VALUES (\"" + data1 + "\",\"" + data2 + "\",\"" + data3 + "\",\"" + data4 + "\",\"" + data5 + "\",\"" + data6 + "\");";
        }
        if(columnAmount == 7) {
            return "INSERT INTO " + tableName + " (\"" + column1 + "\",\"" + column2 + "\",\"" + column3 + "\",\"" + column4 + "\",\"" + column5 + "\",\"" + column6 + "\",\"" + column7 + "\") " +
                    "VALUES (\"" + data1 + "\",\"" + data2 + "\",\"" + data3 + "\",\"" + data4 + "\",\"" + data5 + "\",\"" + data6 + "\",\"" + data7 + "\");";
        }

    }
}
