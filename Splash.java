package pkgcounter;



import java.awt.*;
import javax.swing.*;



	@SuppressWarnings("serial")
	public class Splash extends JWindow {
		  private int duration;
		  public Splash(int d) {
		    duration = d;
		  }

		  
		  public void showSplash() {
		    JPanel content = (JPanel)getContentPane();
		    content.setBackground(new Color(37, 75, 124));

		    int width = 800;
		    int height = 384;
		    //int width = 1366;
		    //int height = 720;
		    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		    int x = (screen.width-width)/2;
		    int y = (screen.height-height)/2;
		    setBounds(x,y,width,height);

		  
		    JLabel label = new JLabel(new ImageIcon("E:/SCPX/blue_cubes-wallpaper1-800x384.jpg"));
		    JLabel copyrt = new JLabel
		      ("Copyright 2016, Sentence Counter PRO X, Christine Harding", JLabel.CENTER);
		    copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 11));
		    content.add(label, BorderLayout.CENTER);
		    content.add(copyrt, BorderLayout.SOUTH);
		    
		    copyrt.setForeground(Color.WHITE);
		 

		    
		    setVisible(true);

		    
		    try { Thread.sleep(duration); } catch (Exception e) {}
		    setVisible(false);
		  }

		  public void showSplashAndExit() {
			    showSplash();
			    new main().setVisible(true);
			  }
		  public static void main(String[] args) {
			  try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
		 
		    Splash splash = new Splash(5000);
		    
		    splash.showSplashAndExit();
		  }
		}