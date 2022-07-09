
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Cursor;

import javax.swing.JFrame;


public class Display {
	private String title;
	private int width, height;
	Button bSum,bMax,bMin,bXor,bqr,bgcd;
	JFrame frame;
	TextField t1,tl,tr;
	Label qr;
	private Canvas canvas;
	
	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		frame = new JFrame();
		frame.setTitle(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		Label txt = new Label("Segment Tree Visualiser", Label.CENTER);
		txt.setForeground(Color.white);
		txt.setBackground(Color.red);
		Font myFont = new Font("Serif",Font.BOLD,20);
		txt.setFont(myFont);
		txt.setBounds(0,0,1000,50); 
		frame.add(txt);
        
		bSum = new Button("Range Sum");  
		bMax = new Button("Range Max");   
		bMin = new Button("Range Min");   
		bXor = new Button("Range Xor");
		bgcd = new Button("Range GCD");
		bqr = new Button("Range Querry");
        
		bSum.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bMax.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bMin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bXor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bgcd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		bqr.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		Label inp = new Label("Input Array :-", Label.CENTER);
		inp.setForeground(Color.ORANGE);
		inp.setFont(myFont);
		inp.setBackground(new Color(49, 49, 49));
		inp.setBounds(300,64,150,40); 

		t1=new TextField("1 3 2 8 7 10 2 2",5);
		frame.add(inp);

		t1.setBounds(450,72,200,25);
        frame.add(t1);
		
		// Label vis = new Label("Visualize :-", Label.CENTER);
		// vis.setForeground(Color.ORANGE);
		// vis.setFont(myFont);
		// vis.setBackground(new Color(49, 49, 49));
		// vis.setBounds(850,100,100,40); 
		// frame.add(vis);

		// Label Querry = new Label("Querry :-", Label.CENTER);
		// Querry.setForeground(Color.ORANGE);
		// Querry.setFont(myFont);
		// Querry.setBackground(new Color(49, 49, 49));
		// Querry.setBounds(850,350,100,40); 
		// frame.add(Querry);

		/// query l and r and label
		tl=new TextField("",4);
		tl.setBounds(825,410,55,20);
        frame.add(tl);
		Label inpl = new Label("l :-", Label.CENTER);
		inpl.setForeground(Color.ORANGE);
		inpl.setFont(myFont);
		inpl.setBackground(new Color(49, 49, 49));
		inpl.setBounds(775,400,50,40); 
		frame.add(inpl);

		tr=new TextField("",4);
		tr.setBounds(925,410,55,20);
        frame.add(tr);
		Label inpr = new Label("r :-", Label.CENTER);
		inpr.setForeground(Color.ORANGE);
		inpr.setFont(myFont);
		inpr.setBackground(new Color(49, 49, 49));
		inpr.setBounds(875,400,50,40); 
		frame.add(inpr);

		qr = new Label("", Label.CENTER);
		qr.setForeground(Color.MAGENTA);
		qr.setFont(new Font("Serif",Font.BOLD,25));
		qr.setBackground(new Color(49, 49, 49));
		qr.setBounds(780,500,250,50); 
        frame.add(qr);
  
		// set the position for the button in frame   
		bSum.setBounds(900,100,80,30);
		bMax.setBounds(900,150,80,30);
		bMin.setBounds(900,200,80,30);
		bXor.setBounds(900,250,80,30);
		bgcd.setBounds(900,300,80,30); 
		bqr.setBounds(900,450,80,30);    
	  
		// add button to the frame  
		frame.add(bSum);
		frame.add(bMax); 
		frame.add(bMin); 
		frame.add(bXor);
		frame.add(bgcd);
		frame.add(bqr);   
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
		canvas.setFocusable(false);
		
		frame.add(canvas);
		frame.pack();
	}
	
	public void  updateFPS(int fps) {
		frame.setTitle(title + " FPS: " + fps);
	}
	
	public String getTitle() {
		return title;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public JFrame getFrame() {
		return frame;
	}

	public Canvas getCanvas() {
		return canvas;
	}
	
}
