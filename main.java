package pkgcounter;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.python.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.*;




@SuppressWarnings("serial")
public class main extends JFrame {

	JRadioButton BrowseButton;
	JButton ManualButton;
	JButton Exit;
	JButton Enter;
	JTextField filename;
	
	main() {
		setTitle("SCPX");
		{
			
			JFrame Frame = new JFrame();
			//Panels
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			panel.add(Box.createRigidArea(new Dimension(10, 10)));
		    setLocationRelativeTo(null);
		    
			JPanel labpanel = new JPanel();
			labpanel.setLayout(new BoxLayout(labpanel, BoxLayout.LINE_AXIS));
		    labpanel.add(Box.createRigidArea(new Dimension(10, 10)));
		    panel.add(labpanel);
		    
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
			
			//setBackground(Color.pink);
			
		//Welcome message
			    JLabel lblwelcome = new JLabel("Sentence Counter PRO X ");
			    labpanel.add(lblwelcome);
			    //panel.add(new JLabel("Welcome to Sentence Counter PRO X"));
		        lblwelcome.setPreferredSize(new Dimension(25, 10));
		
		        //JTextField txtfn = new JTextField();
				//txtfn.setPreferredSize( new Dimension( 0, 0 ) );
				//panel.add(txtfn);
		        
	 //text area   
   /*JTextArea textArea = new JTextArea();
   	JScrollPane scrollPane = new JScrollPane(textArea);
   	scrollPane.setSize(getSize());
   	panel.add(scrollPane);
   	*/
   	
		        //text area   
			    JTextArea textArea = new JTextArea();
			    	JScrollPane scrollPane = new JScrollPane(textArea);
			    	scrollPane.setSize(getSize());
			    	panel.add(scrollPane);
			    	scrollPane.setPreferredSize(new Dimension(10, 30));
			    	textArea.setEditable(false);

	  
	

		//Button group
		   
		//ButtonGroup aGroup= new ButtonGroup();
		//BrowseButton = new JRadioButton("Buy");
		   
		  
		    
		    
		    //aGroup.add(BrowseButton);
		    
		    
		    //panel.add(BrowseButton);
		    
		//open file
	   	 JFileChooser fileopen = new JFileChooser();
		    FileFilter filter = new FileNameExtensionFilter(".txt", "txt");
		    fileopen.addChoosableFileFilter(filter);
		    
			   
			    //Browse Button
			   JButton BrowseButton = new JButton("Browse");			    
			    BrowseButton.addActionListener(new ActionListener()
			    		{
			    		public void	actionPerformed(ActionEvent e)
			    		{int ret = fileopen.showDialog(null, "Open file");
			    		
    				    if (ret == JFileChooser.APPROVE_OPTION) {
    				      File file = fileopen.getSelectedFile();
    				      System.out.println(file);
    				    }}});
    				    btnpanel.add(BrowseButton);
    				    //btnpanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    				    
			   //Manual Button
			   JButton ManualButton = new JButton("Manual");
			    ManualButton.addActionListener(new ActionListener()
	    		{
	    		public void	actionPerformed(ActionEvent e)
	    		{
	    			textArea.setEditable(true);
	    			
	    			//JOptionPane.showMessageDialog(null,"One moment please.....");
	    			//setVisible(false);
	    			//new manual ();
	    			
	    			//System.exit(0);
	    		}});
			  btnpanel.add(ManualButton);
			   
			    
			    
			   
			    

			    
			    
		 //Submit Button
	    
			    JButton EnterButton = new JButton("Calculate");
			    EnterButton.setMnemonic(KeyEvent.VK_ENTER);
			    btnpanel.add(EnterButton);
	   
	    
	    EnterButton.addActionListener(new ActionListener()
	    		{
	    		@SuppressWarnings("resource")
				public void	actionPerformed(ActionEvent e)
	    		{
	    			JOptionPane.showMessageDialog(null,"One moment please.....");
	    			//System.exit(0);
	    			
	    			//Input calculation here
	    			 org.python.util.PythonInterpreter python = new org.python.util.PythonInterpreter();
	    			  python.execfile("E:/SCPX/workspace/prjcounter/src/pkgcounter/EssayScanner");
	    		}});
	    		

    			  



	    		
	    		//else
	    			
	    			
		
	    			 	    
	    //Button Exit
	    JButton ExitButton = new JButton("Exit");
	    ExitButton.setMnemonic(KeyEvent.VK_X);
	    ExitButton.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){
		    	JOptionPane.showMessageDialog(null,"Thank You.");
		   System.exit(0);
		    
		    }}); 
		   btnpanel.add(ExitButton);
		   
//Placements		    
		  
		   
		   //layout.putConstraint(SpringLayout.EAST, ExitButton, 175,  SpringLayout.WEST, contentPane);
		   // layout.putConstraint(SpringLayout.NORTH, ExitButton, 157, SpringLayout.NORTH, contentPane);
		   // layout.putConstraint(SpringLayout.EAST, EnterButton, 0,  SpringLayout.EAST, contentPane);
		   // layout.putConstraint(SpringLayout.SOUTH, EnterButton, 0, SpringLayout.SOUTH, contentPane);
		   
		 
		    //layout.putConstraint(SpringLayout.WEST, lblBody, 0,  SpringLayout.WEST, Pane); //right
		    //layout.putConstraint(SpringLayout.NORTH, lblBody, 0, SpringLayout.NORTH, Pane);  //top
		    
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
		
			    			    		
	  //Run
	    public static void main (String[] args)  {
	    	
	    	main mainwindow = new main();
	        mainwindow.setVisible(true);
	    	
	        
	    }
	    }
			    		
		
		
	
	    	    		

	