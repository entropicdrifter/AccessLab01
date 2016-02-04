package barth.nolan.AccessLab01;

import java.util.ArrayList;

/**
 * Created by Nolan Barth on 1/25/16.
 */
public class ConnectionManager {


    private static Connection a = new Connection("1", "192.168.0.1");
    private static Connection b = new Connection("2", "192.168.0.2");
    private static Connection c = new Connection("3", "192.168.0.3");
    private static ArrayList<Connection> cm = new ArrayList<Connection>(3);
    private static int i = 0;

    static Connection getConnection() {
        if (i==0) {
            cm.add(0, a);
            i++;
            return cm.get((i-1));
        }
        else if (i == 1){
            cm.add(1, b);
            i++;
            return cm.get((i-1));
        }
        else if (i == 2){
            cm.add(2, c);
            i++;
            return cm.get((i-1));
        }
        else return null;


    }
    static Connection getConnection(int n){
        if (n <= cm.size()){
            return cm.get((n-1));
        }
        else return null;
    }

    static void displayConnection(int n) {
        System.out.println("You currently have " + i + " Connections open.");
        for (int j = 0; j < i; j++) {
            System.out.println("Connection " + (j+1) + " is connected on port: " + cm.get(j).getPortNum() + " to IP: " + cm.get(j).getiPAddress());
        }

    }

    static void removeConnection(int n) {
        cm.remove(n-1);
        i--;
        System.out.println("Connection " + n + " removed.");
    }


}
