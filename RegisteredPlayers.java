
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisteredPlayers 
{
    static Map users = new HashMap();
    public RegisteredPlayers()
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader("users.txt"));
            String line, delims = "[,]";
            String[] UaP;
            
            
            while((line = br.readLine()) != null)
            {
                UaP = line.split(delims);
                users.put(UaP[0], UaP[1]);
                //System.out.println(UaP[0] + ", " + UaP[1]);
            }
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RegisteredPlayers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
	}
    }
    
    public static void printMap(Map m)
    {
        for(Object key : users.keySet())
        {
            System.out.println("Key: " + key + "\tValue: " + users.get(key));
        }
    }
    
    public void addPlayer(String uName, String pass)
    {
        users.put(uName, pass);
    }
    
    public void removePlayer(String uName)
    {
        users.remove(uName);
    }
    
    public boolean loginIsRegistered(String uName)
    {
        if(users.containsKey(uName))
            return true;
        else
            return false;
    }
    
    public boolean registerIsRegistered(String uName, String pass)
    {
        if(users.containsKey(uName))
            return false;
        else
        {
            addPlayer(uName, pass);
            return true;
        }
    }
}
