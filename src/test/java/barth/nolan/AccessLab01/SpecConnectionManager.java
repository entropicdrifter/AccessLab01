package barth.nolan.AccessLab01;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Nolan Barth on 1/25/16.
 */
public class SpecConnectionManager {
    @Test
    public void testConnectionGetter(){

        assertTrue("getConnection should return a Connection", ConnectionManager.getConnection() instanceof Connection);
    }
    @Test
    public void testRemoveConnection(){
        ConnectionManager.getConnection();
        assertNotNull(ConnectionManager.getConnection(1)); //It's a connection.
        ConnectionManager.getConnection();
        assertNotNull(ConnectionManager.getConnection(2));
        ConnectionManager.removeConnection(2); // Wanna see a magic trick?
        assertNull(ConnectionManager.getConnection(2)); // It's gone!

    }
}
