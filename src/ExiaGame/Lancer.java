package ExiaGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("unused")
public class Lancer extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Contnr cnt;
	private int count;
	private Joueur joueur1;
	private Joueur joueur2;
	private String playerturn;
	private JLabel joueur_1_label;
	private JLabel joueur_2_label;
	private JPanel scorecnt;
	private JLabel tour;
	private JButton button;
	private JPanel backgroun;
	private JPanel contnr;
	private JTextField j1 = new HintTextField("psudo joueur 1");
	private JTextField j2 = new HintTextField("psudo joueur 2");
	private Gmebut gb1;
	private Gmebut gb2;
	private Gmebut gb3;
	private Gmebut gb4;
	private Gmebut gb5;
	private Gmebut gb6;
	private Gmebut gb7;
	private Gmebut gb8;
	private Gmebut gb9;
	private Gmebut gb10;
	private Gmebut gb11;
	private Gmebut gb12;
	private Gmebut gb13;
	private Gmebut gb14;
	private Gmebut gb15;
	private Gmebut gb16;
	private Boolean firstclick=false;
	private JOptionPane oppane;
	Gmebut j = null ;
	Gmebut i =null;
	Thread th=null;
	
	ActionListener act = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(th==null || !th.isAlive()){
			if(!firstclick){
				 j = (Gmebut) e.getSource();
				 j.setClicked(true);
				 firstclick=true;
				 
			}else {
				 i = (Gmebut) e.getSource();
				if (i.getPath().equals(j.getPath())){
					
					i.setClicked(true);
					i.setOut(true);
					j.setOut(true);
					i.repaint();
					j.repaint();
					i.setEnabled(false);
					j.setEnabled(false);
					if(playerturn.equals(joueur1.getNom())){
						joueur1.setScore(joueur1.getScore()+2);
						joueur_1_label.setText(joueur1.toString());
					}else {
						joueur2.setScore(joueur2.getScore()+2);
						joueur_2_label.setText(joueur2.toString());
					}
					count++;
					if(count==8){
						JOptionPane jjj = new JOptionPane();
						jjj.showMessageDialog(null, joueur1.toString()+"    "+joueur2.toString());
					}
					
				}else {
					i.setClicked(true);
					i.repaint();
					Runnable d = new Runnable() {
						
						@Override
						public void run()  {
							// TODO Auto-generated method stub
							try {
								th.sleep(750);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							j.setClicked(false);
							i.setClicked(false);
							playerturn = (joueur1.getNom().equals(playerturn)? joueur2.getNom():joueur1.nom);
							tour.setText("                                                               Tour : "+playerturn);
							System.out.println("arg0");
							
							j.repaint();
							i.repaint();
						}
					};
					th = new Thread(d);
				    th.start();
					//i.setClicked(true);
					//i.repaint();
					/*try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}*/
					
				}
				firstclick = false;
			}
		}
			else {}}};

	public Lancer() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		this.setTitle("My game ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
	    count=0;
		this.setVisible(true);
		JPanel jf = new JPanel();
		jf.setLayout(new BorderLayout());
	     button = new JButton("Start");
	     this.setBackground(Color.blue);
		Font police = new Font("Arial", Font.BOLD, 14);
		j1.setFont(police);
		j2.setFont(police);
		j1.setPreferredSize(new Dimension(150, 30));
		j2.setPreferredSize(new Dimension(150,30));
		jf.add(j1,BorderLayout.WEST);
		jf.add(j2,BorderLayout.EAST);
		jf.add(button,BorderLayout.SOUTH);
		Color color= new Color(97, 171, 236);
		jf.setBackground(color);
		
		
		//cnt = new JPanel();
		cnt= new Contnr();
		this.setLayout(new BorderLayout());
		
		this.setContentPane(cnt);
		this.getContentPane().add(jf,BorderLayout.SOUTH);
		//this.getContentPane().add(button,BorderLayout.SOUTH);
		ArrayList<String> rndm = new ArrayList<String>(); 
		rndm.add("1.png");
		rndm.add("2.png");
		rndm.add("3.png");
		rndm.add("4.png");
		rndm.add("5.png");
		rndm.add("6.png");
		rndm.add("7.png");
		rndm.add("8.png");
		//rndm.add("9.png");
		rndm.add("1.png");
		rndm.add("2.png");
		rndm.add("3.png");
		rndm.add("4.png");
		rndm.add("5.png");
		rndm.add("6.png");
		rndm.add("7.png");
		rndm.add("8.png");
		Collections.shuffle(rndm);
		
		gb1 = new Gmebut(rndm.get(0));
		gb2 = new Gmebut(rndm.get(1));
		gb3 = new Gmebut(rndm.get(2));
		gb4 = new Gmebut(rndm.get(3));
		gb5 = new Gmebut(rndm.get(4));
		gb6 = new Gmebut(rndm.get(5));
		gb7 = new Gmebut(rndm.get(6));
		gb8 = new Gmebut(rndm.get(7));
		gb9 = new Gmebut(rndm.get(8));
		gb10 = new Gmebut(rndm.get(9));
		gb11 = new Gmebut(rndm.get(10));
		gb12 = new Gmebut(rndm.get(11));
		gb13 = new Gmebut(rndm.get(12));
		gb14 = new Gmebut(rndm.get(13));
		gb15 = new Gmebut(rndm.get(14));
		gb16 = new Gmebut(rndm.get(15));
		backgroun=new JPanel();
		backgroun.setLayout(new GridLayout(4,4));
		backgroun.add(gb1);
		backgroun.add(gb2);
		backgroun.add(gb3);
		backgroun.add(gb4);
		backgroun.add(gb5);
		backgroun.add(gb6);
		backgroun.add(gb7);
		backgroun.add(gb8);
		backgroun.add(gb9);
		backgroun.add(gb10);
		backgroun.add(gb11);
		backgroun.add(gb12);
		backgroun.add(gb13);
		backgroun.add(gb14);
		backgroun.add(gb15);
		backgroun.add(gb16);
	    
		gb1.addActionListener(act);
		gb2.addActionListener(act);
		gb3.addActionListener(act);
		gb4.addActionListener(act);
		gb5.addActionListener(act);
		gb6.addActionListener(act);
		gb7.addActionListener(act);
		gb8.addActionListener(act);
		gb9.addActionListener(act);
		gb10.addActionListener(act);
		gb11.addActionListener(act);
		gb12.addActionListener(act);
		gb13.addActionListener(act);
		gb14.addActionListener(act);
		gb15.addActionListener(act);
		gb16.addActionListener(act);
	   
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (j1.getText()==""||j2.getText()==""){
					oppane = new JOptionPane();
					oppane.showMessageDialog(null,"zzz", "Attention", JOptionPane.WARNING_MESSAGE);
					
				}else{
				scorecnt = new JPanel();
				joueur1 = new Joueur(j1.getText());
				joueur2 = new Joueur(j2.getText());
				playerturn = j1.getText();
				tour = new JLabel();
				tour.setText("                                                               Tour : "+playerturn);
				
				scorecnt.setLayout(new BorderLayout());
				joueur_1_label = new JLabel(joueur1.toString());
				joueur_2_label = new JLabel(joueur2.toString());
				scorecnt.add(joueur_1_label,BorderLayout.WEST);
				scorecnt.add(joueur_2_label,BorderLayout.EAST);
				Font police = new Font("Arial", Font.BOLD,14);
				tour.setFont(police);
				scorecnt.add(tour,BorderLayout.NORTH);
				
				contnr = new JPanel();
				
				contnr.setLayout(new BorderLayout());
				contnr.add(backgroun,BorderLayout.CENTER);
				contnr.add(scorecnt,BorderLayout.SOUTH);
				
				setContentPane(contnr);
				setVisible(true);
				
				}}
		});
	 
		
	}
	
 	class HintTextField extends JTextField implements FocusListener {

		  /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private final String hint;
		  private boolean showingHint;

		  public HintTextField(final String hint) {
		    super(hint);
		    this.hint = hint;
		    this.showingHint = true;
		    super.addFocusListener(this);
		  }

		  @Override
		  public void focusGained(FocusEvent e) {
		    if(this.getText().isEmpty()) {
		      super.setText("");
		      showingHint = false;
		    }
		  }
		  @Override
		  public void focusLost(FocusEvent e) {
		    if(this.getText().isEmpty()) {
		      super.setText(hint);
		      showingHint = true;
		    }
		  }

		  @Override
		  public String getText() {
		    return showingHint ? "" : super.getText();
		  }
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new Lancer();
	}

}
