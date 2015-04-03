
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Team One
 * Gomoku
 * CSCE 320 - Spring 2015
 * 3/16/2015
 * Java - JVM
 * Sources:
 * 
 * Revisions:
 * 3/14/2015 - Class created by Karen Bullinger.
 */
public class ClientModel {
    private LeaderboardController leaderboardController;
    private LobbyController lobbyController;
    private LoginController loginController;
    public Socket socket;
   
    /**
     * Associates ClientModel and LoginController.  Opens new socket to
     * specified host and port.
     * @param cont
     * @param host
     * @param port 
     */
  public void newSeverConnection(LoginController cont, String host, int port) {
        this.loginController = cont;
        try {
            socket = new Socket(host, port);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClientModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientModel.class.getName()).log(Level.SEVERE, null, ex);
        }
            
         
           
           
           
    }
}
