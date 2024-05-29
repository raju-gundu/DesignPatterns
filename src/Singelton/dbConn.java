package Singelton;

public class dbConn {
        private static dbConn instance;
        private dbConn(){

        }
        public static dbConn getInstance(){
            if(instance==null){
                synchronized (dbConn.class){
                    if(instance==null){
                        instance=new dbConn();
                    }
                }
            }
            return instance;
        }
        public void connect(){
            System.out.println("Connecting to the database...");
        }
}
