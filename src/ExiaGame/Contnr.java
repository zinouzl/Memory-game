package ExiaGame;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Contnr extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Contnr(){
		this.setLayout(new BorderLayout());
		
	  
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
	
			Image image;
			try {
				image = ImageIO.read(new File("Untitled-1.png"));
				 g.drawImage(image,0,0,this.getWidth(),this.getHeight(),this);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//g.drawRect(0, 0, 110, 110);
	
	}
	

}
