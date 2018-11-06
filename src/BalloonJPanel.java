
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BalloonJPanel extends JPanel  {

	BalloonPlayer player;

    public BalloonJPanel(BalloonPlayer player) {
    	this.player = player;
        setPreferredSize(new Dimension(200,200));
    }
    
    public void paintComponent (Graphics g) {
    	super.paintComponent(g);
		if (player.balloon != null) {
    	int rayon = player.balloon.getRayon();
        g.drawOval(getWidth()/2-rayon, getHeight()/2-rayon, 2*rayon, 2*rayon);
		}
    }
}