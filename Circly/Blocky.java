//Blocky With Circly

/*
 * Taken from Java Painting Tutorial
 * http://docs.oracle.com/javase/tutorial/uiswing/painting
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;


public class Blocky {
    
    public static void main(String[] args) {
    	JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.add(new MyPanel());
        frame.pack();
        frame.setVisible(true);
    }
}


class MyPanel extends JPanel {
	
	/*
	 * Objective: adjust these integer values and see how it changes Blocky
	 */

	//these are the starting position of Blocky
    private int squareX = 50;
    private int squareY = 50;
      
    //these are the dimensions of Blocky
    private int squareW = 20;
    private int squareH = 20;
    
    //these are the starting position of Circly
    private int circleX = 15;
    private int circleY = 15;
    
    //these are the dimensions of Circly
    private int circleW = 20;
    private int circleH = 20;
    
    
    
    

    public MyPanel() {

        setBorder(BorderFactory.createLineBorder(Color.black));
        setFocusable(true); //must have this for key press!!
        
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                moveSquare(e.getX(),e.getY());
            }
        });     
        
        addKeyListener(new KeyAdapter(){
        	 public void keyPressed(KeyEvent e) {
        	        //VK_UP  VK_LEFT  VK_RIGHT   VK_DOWN
        		 if(e.getKeyCode() == KeyEvent.VK_UP){
        			 moveCircle(0, -5);
        		 }
        		 else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
        			 moveCircle(5, 0);
        		 }
        		 else if(e.getKeyCode() == KeyEvent.VK_LEFT){
        			 moveCircle(-5, 0);
        		 }
        		 else if(e.getKeyCode() == KeyEvent.VK_DOWN){
        			 moveCircle(0, 5);
        		 }
        	    }
        });

    }
    private void moveCircle(int x, int y){
    	
        int OFFSET = 1;
        if ((circleX!=x) || (circleY!=y)) {
            repaint(circleX,circleY,circleW+OFFSET,circleH+OFFSET);
            circleX+=x;
            circleY+=y;
            repaint(circleX, circleY,circleW+OFFSET,circleH+OFFSET);
        } 
    	
    }
    private void moveSquare(int x, int y) {
        int OFFSET = 1;
        if ((squareX!=x) || (squareY!=y)) {
            repaint(squareX,squareY,squareW+OFFSET,squareH+OFFSET);
            squareX=x;
            squareY=y;
            repaint(squareX,squareY,squareW+OFFSET,squareH+OFFSET);
        } 
    }
    

    public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);       
        g.setColor(Color.RED);
        g.fillRect(squareX,squareY,squareW,squareH);
        g.setColor(Color.BLACK);
        g.drawRect(squareX,squareY,squareW,squareH);
        
        //circly
        g.setColor(Color.BLUE);
        g.fillOval(circleX,circleY,circleW,circleH);
        
        
        
    }  
}