/**
 * Team One
 * Gomoku
 * CSCE 320 - Spring 2015
 * 3/16/2015
 * Java - JVM
 * Sources:
 * 
 * Revisions:
 * 3/14/2015 - Class created by Joseph Bowley.
 */
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PLUCSCE
 */
public class GameView {  
    JFrame frame=new JFrame(); //creates frame
    JButton[][] grid; //names the grid of buttons
    
    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton pressedButton = (JButton)e.getSource();
            pressedButton.setBackground(Color.BLUE);
            pressedButton.setEnabled(false);
        }
    };
    
    public GameView(int width, int length){ //constructor
        frame.setLayout(new GridLayout(width,length)); //set layout
        grid=new JButton[width][length]; //allocate the size of grid
        for(int y=0; y<length; y++){
                for(int x=0; x<width; x++){
                        grid[x][y]=new JButton(); //creates new button 
                        grid[x][y].addActionListener(listener);
                        frame.add(grid[x][y]); //adds button to grid
                }
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); //sets appropriate size for frame
        frame.setVisible(true); //makes frame visible
    }
    public static void main(String[] args) {
        new GameView(30,30);//makes new ButtonGrid with 2 parameters
    }
}

