package pkgcounter;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;

@SuppressWarnings("serial")
public class manual extends JFrame {
	
	JButton BackButton;
	JButton Exit;
manual () {
 setTitle("SPCX");
{
	JFrame Frame = new JFrame();
	//Panel
	JPanel panel = new JPanel();
	panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
	setLocationRelativeTo(null);
	Container contentPane = new Container();
    SpringLayout layout = new SpringLayout();
    contentPane.setLayout(layout);
    JPanel btnpanel = new JPanel();
    btnpanel.setLayout(new BoxLayout(btnpanel, BoxLayout.LINE_AXIS));
    btnpanel.add(Box.createRigidArea(new Dimension(10, 10)));
	panel.add(btnpanel);
    
	ImageIcon img = new ImageIcon("C:/Users/Christine/blue_cubes-wallpaper-96x96.jpg");
	setIconImage(img.getImage());
	
	 Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - Frame.getWidth()) / 8);
	    int y = (int) ((dimension.getHeight() - Frame.getHeight()) / 8);
	    Frame.setLocation(x, y);
	
	
	//BufferedImage Image = ImageIO.read(new File("E:/SCPX/blue_cubes-wallpaper1-96x96.jpg"));
	    //ImageIcon image1 = new ImageIcon("C:/Users/Christine/blue_cubes-wallpaper-1366x768.jpg");
	 	//JLabel lblBody = new JLabel(image1);
	 	//lblBody.setPreferredSize(new Dimension(450, 320));
	 	//panel.add(lblBody);
    
	 	 //text area   
	    JTextArea textArea = new JTextArea();
	    	JScrollPane scrollPane = new JScrollPane(textArea);
	    	scrollPane.setSize(getSize());
	    	panel.add(scrollPane);
	    	scrollPane.setPreferredSize(new Dimension(350, 800));
	    	//scrollPane.setAlignmentX(RIGHT_ALIGNMENT);
	    	
	    	 JButton EnterButton = new JButton("Submit");
			    EnterButton.setMnemonic(KeyEvent.VK_ENTER);
			    btnpanel.add(EnterButton);
			    
	    
	    EnterButton.addActionListener(new ActionListener()
	    		{
	    		public void	actionPerformed(ActionEvent e)
	    		{
	    			JOptionPane.showMessageDialog(null,"One moment please.....");
	    			System.exit(0);
	    		}});
	    	
	    	 JButton BackButton = new JButton("Go Back");
	 	    BackButton.setMnemonic(KeyEvent.VK_ENTER);
	 	    btnpanel.add(BackButton);
	 	   //panel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
	 	  //panel.add(Box.createHorizontalGlue());
	 	  
	 	 
	 	    BackButton.addActionListener(new ActionListener()
	 	    		{
	 	    		public void	actionPerformed(ActionEvent e)
	 	    		{
	     			    	
	         			     setVisible(false);
	         				 new main();
	     			    }
	 	    			
	 	    			
	 	    			     	 
	 	    		}); 

	 	    //Button Exit
	 	    JButton ExitButton = new JButton("Exit");
	 	    ExitButton.setMnemonic(KeyEvent.VK_X);
	 	    ExitButton.addActionListener(new ActionListener(){
	 		    public void actionPerformed(ActionEvent e){
	 		    	JOptionPane.showMessageDialog(null,"Thank You.");
	 		   System.exit(0);
	 		    
	 		    }}); 
	 		    btnpanel.add(ExitButton,panel);
	 		    
	 		    
	 		// Add-ons on Frame
	 		    //aWindow.
	 		    add(panel);
	 		    //aWindow.
	 		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		    //aWindow.
	 		    setSize(450, 320);
	 		    //aWindow.
	 		    setVisible(true);
	 			}}
	 	    

	 		   public static void main(String[] args)  {
	 				
	 				manual manualwindow = new manual();
	 			    manualwindow.setVisible(true);
	 				
	 			    
	 			}

	 			}
