package Singelton;
public class Singelton {
    public static void main(String[] args) {
        dbConn conn = dbConn.getInstance();
        conn.connect();
    }

}
