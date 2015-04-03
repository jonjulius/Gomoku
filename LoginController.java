
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Team One Gomoku CSCE 320 - Spring 2015 3/16/2015 Java - JVM Sources:
 *
 * Revisions: 3/14/2015 - Class created by Karen Bullinger.
 */
public class LoginController {

    private LoginView view;
    private ClientModel model;
    private OutputStream outStream;
    private InputStream inStream;
    private DataInputStream dataIn;
    private DataOutputStream dataOut;
    private byte[] msg = new byte[1024];
    private String returnedMsg;

   /**
    * Gets username and password from view. Sends output stream to server
    * containing user and password for authentication.
    * @param user
    * @param password
    * @return true if login is success, false if fail
    */
    public boolean login(String user, char[] password) {

        boolean waiting = true;
        user = user.toLowerCase();
        String info = "login " + user + " " + password;
        try {
            dataOut.writeBytes(info);
            dataOut.flush();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (waiting) {
            try {
                int len = dataIn.read(msg);

                if (len > 0) {
                    returnedMsg = new String(msg, 0, len);
                    if (returnedMsg.contains("success")) {
                        waiting = false;
                        return true;
                    } else {
                        System.out.println("Login failed.");
                        return false;
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;


    }

    /**
     * Calls method in ClientModel to create new connection to server. Initiates
     * input and output streams.
     */
    public void newConnection() {
        try {
            model.newSeverConnection(this, "127.1.1.1", 54321);
            inStream = model.socket.getInputStream();
            dataIn = new DataInputStream(inStream);
            outStream = model.socket.getOutputStream();
            dataOut = new DataOutputStream(outStream);
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
