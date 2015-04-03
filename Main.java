/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Karen
 */
 import javax.swing.JFrame;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	    new GameView(30,30);//makes new ButtonGrid with 2 parameters
    	    
    	    JFrame frame = new JFrame();
    	    LoginView view = new LoginView();
    	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    frame.add(view);
    	    frame.pack(); //sets appropriate size for frame
    	    frame.setVisible(true); //makes frame visibled
    	    
    	     JFrame frameLobby = new JFrame();
    	    LobbyView viewLobby = new LobbyView();
    	    frameLobby.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    frameLobby.add(viewLobby);
    	    frameLobby.pack(); //sets appropriate size for frame
    	    frameLobby.setVisible(true); //makes frame visibled
    	    
    	    JFrame frameLeader = new JFrame();
    	    LeaderboardView viewLeader = new LeaderboardView();
    	    frameLeader.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    frameLeader.add(viewLeader);
    	    frameLeader.pack(); //sets appropriate size for frame
    	    frameLeader.setVisible(true); //makes frame visibled
    
    	    
    
    }
}
