package ExiaGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.w3c.dom.events.MouseEvent;

@SuppressWarnings("unused")
public class Gmebut extends JButton implements MouseListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Boolean clicked ;
    private Image image;
    private Boolean out;
    public Boolean getOut() {
		return out;
	}
	public void setOut(Boolean out) {
		this.out = out;
	}
	private String path;
     public Boolean getClicked() {
		return clicked;
	}
	public void setClicked(Boolean clicked) {
		this.clicked = clicked;
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Gmebut(String paht){
		this.path = paht;
    	 clicked=false;
    	 out = false;
    	// this.addMouseListener(this);
    	// System.out.println("trueé");
     }
	@Override
	protected void paintComponent(Graphics g) {
	
		if(!clicked){
			try {
				image = ImageIO.read(new File("logo.png"));
				System.out.println("trs");
				 g.drawImage(image,0,0,this.getWidth(),this.getHeight(),this);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else 
		{
			if(out==true){
				g.setColor(Color.white);
			g.fillRect(0, 0,this.getWidth(), this.getHeight());	
			}else {
			try {
				image = ImageIO.read(new File(path));
				 g.drawImage(image,0,0,this.getWidth(),this.getHeight(),this);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}
		
	}
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("zionodskflskdj");
		this.clicked = true;
		this.repaint();
	}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("zionodskflskdj");
	}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
