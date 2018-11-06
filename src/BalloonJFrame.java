

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BalloonJFrame extends JFrame {
	private JButton little, large, lance;
	private BalloonJPanel balloonJPanel;
	private Balloon balloon;

	public static void main (String args[]) {
		new BalloonJFrame();
	}

	public BalloonJFrame() {
        setTitle("Balloon");
        balloon = new Balloon(20);
		Container contentPane = getContentPane();		
		balloonJPanel = new BalloonJPanel(balloon);
		contentPane.add(balloonJPanel,BorderLayout.CENTER);
		
		JPanel boutons = new JPanel();
		boutons.setLayout(new GridLayout(1,2));
		contentPane.add(boutons,BorderLayout.NORTH);
		
		little = new JButton("Little");
		boutons.add(little);
		little.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (balloon != null) balloon.changeSize(-5);
				balloonJPanel.repaint();
			}
		});		
		
		lance = new JButton("Lance");
		boutons.add(lance);
		lance.addActionListener(new ActionListener(){	
			@Override
			public void actionPerformed(ActionEvent e) {
				balloonJPanel.resetBalloon();
			}
		});
		
		large = new JButton("Large");
		boutons.add(large);
		large.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (balloon != null) balloon.changeSize(+5);
				balloonJPanel.repaint();
			}			
		});
        pack();
        setVisible(true);
		
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
	}

}
