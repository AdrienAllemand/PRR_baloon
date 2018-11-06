
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BalloonJPanel extends JPanel  {
    private Balloon balloon;
     
    public BalloonJPanel(Balloon balloon) {
    	this.balloon = balloon;
        setPreferredSize(new Dimension(200,200));
    }
    
    public void paintComponent (Graphics g) {
    	super.paintComponent(g);
		if (balloon != null) {
    	int rayon = balloon.getRayon();
        g.drawOval(getWidth()/2-rayon, getHeight()/2-rayon, 2*rayon, 2*rayon);
		}
    }

	public void resetBalloon() {
    	balloon = null;
    	repaint();
	}
}