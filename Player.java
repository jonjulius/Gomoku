
import java.net.InetAddress;
import java.net.Socket;

public class Player implements Runnable {

    String uName;
    InetAddress ip;
    String password;
    Socket sock;
    Thread worker;

    /**
     * @param u the user name of the player
     * @param p the password of the player Constructor for creating a player
     * with a user name and password, and creates a new socket for the player.
     */
    public Player(String u, String p) {
        u = uName;
        p = password;
        sock = new Socket();
    }

    /**
     * Starts a thread for player. Calls run().
     */
    public void startThread() {
        worker = new Thread();
        worker.start();
    }

    /**
     * Getter method for the user name.
     * @return the user name of a player.
     */
    public String getUserName() {
        return uName;
    }

    /**
     * Getter for the InetAddress of a player.
     * @return ip, the InetAddress of the player.
     */
    public InetAddress getInetAddress() {
        return ip;
    }

    /**
     * Getter method for the password
     * @return the password of the player.
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method gets called when the user makes a move during a game.
     */
    public void makeMove() {

    }

    @Override
    public void run() {

    }

}
