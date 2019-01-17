import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jeopardy {
	JButton physics=new JButton();
	JButton chemistry=new JButton();
	JButton astronomy=new JButton();
	JButton lotr=new JButton();
	JButton history=new JButton();
	boolean ph=true;
	boolean ch=true;
	boolean at=true;
	boolean lo=true;
	boolean hi=true;
	int score=0;
	public static void main(String[] args) {
Jeopardy j=new Jeopardy();
j.everyting();
}
public void everyting() {
	JFrame frame=new JFrame();
	frame.setVisible(true);
	JPanel panel=new JPanel();
	JLabel p=new JLabel();
	p.setText("physics");
	JLabel c=new JLabel();
	c.setText("chemistry");
	JLabel a=new JLabel();
	a.setText("astrology");
	JLabel l=new JLabel();
	l.setText("Lord of the Rings");
	JLabel h=new JLabel();
	h.setText("history");
	panel.add(physics);
	panel.add(chemistry);
	panel.add(lotr);
	
}
	
}
