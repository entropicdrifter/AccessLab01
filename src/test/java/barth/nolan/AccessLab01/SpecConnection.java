package barth.nolan.AccessLab01;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Nolan Barth on 1/25/16.
 */
public class SpecConnection {
    @Test
    public void getIPTest(){
        ConnectionManager.getConnection();
        assertTrue(ConnectionManager.getConnection(1).getiPAddress().equals("192.168.0.1"));
    }
    @Test
    public void getPortTest(){
        ConnectionManager.getConnection();
        assertTrue(ConnectionManager.getConnection(1).getPortNum().equals("1"));
    }
}
