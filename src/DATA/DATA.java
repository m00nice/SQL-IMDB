package DATA;

public class DATA {

    public String createTable(String tableName, String column1, String column2, String column3, String column4, String column5, String column6, String column7, int columnAmount){
        if(columnAmount == 1) {
            return "CREATE TABLE '" + tableName + "' ( '" + column1 + "' VARCHAR(75))";
        }
        if(columnAmount == 2) {
            return "CREATE TABLE '" + tableName + "' ( '" + column1 + "' VARCHAR(75)" +
                    "'" + column1 + "' VARCHAR(75))";
        }
        if(columnAmount == 3) {
            return "CREATE TABLE '" + tableName + "' ( '" + column1 + "' VARCHAR(75)" +
                    "'" + column2 + "' VARCHAR(75)" +
                    "'" + column3 + "' VARCHAR(75))";
        }
        if(columnAmount == 4) {
            return "CREATE TABLE '" + tableName + "' ( '" + column1 + "' VARCHAR(75)" +
                    "'" + column2 + "' VARCHAR(75)" +
                    "'" + column3 + "' VARCHAR(75)" +
                    "'" + column4 + "' VARCHAR(75))";
        }
        if(columnAmount == 5) {
            return "CREATE TABLE '" + tableName + "' ( '" + column1 + "' VARCHAR(75)" +
                    "'" + column2 + "' VARCHAR(75)" +
                    "'" + column3 + "' VARCHAR(75)" +
                    "'" + column4 + "' VARCHAR(75)" +
                    "'" + column5 + "' VARCHAR(75))";
        }
        if(columnAmount == 6) {
            return "CREATE TABLE '" + tableName + "' ( '" + column1 + "' VARCHAR(75)" +
                    " '" + column2 + "' VARCHAR(75)" +
                    " '" + column3 + "' VARCHAR(75)" +
                    " '" + column4 + "' VARCHAR(75)" +
                    " '" + column5 + "' VARCHAR(75)" +
                    " '" + column6 + "' VARCHAR(75))";
        }
        if(columnAmount == 7) {
            return "CREATE TABLE '" + tableName + "' ( '" + column1 + "' VARCHAR(75)" +
                    " '" + column2 + "' VARCHAR(75)" +
                    " '" + column3 + "' VARCHAR(75)" +
                    " '" + column4 + "' VARCHAR(75)" +
                    " '" + column5 + "' VARCHAR(75)" +
                    " '" + column6 + "' VARCHAR(75)" +
                    " '" + column7 + "' VARCHAR(75))";
        }

        return "";
    }


    public String insertDATA(String tableName, String column1, String column2, String column3, String column4, String column5, String column6, String column7, String data1, String data2, String data3, String data4, String data5, String data6, String data7,int columnAmount){
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
        return "";
    }
}
