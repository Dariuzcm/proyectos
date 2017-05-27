package main;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JLabel_Dinner extends JFrame
{
	private Container contents;
	private JLabel labelText;
	private JLabel labelImage;
	
	public JLabel_Dinner()
	{
		super("What's for dinner?");
		contents=getContentPane();
		setLayout(new FlowLayout());
		
		labelText= new JLabel("Suhi tonigth?");
		labelText.setForeground( java.awt.Color.WHITE );
		labelText.setBackground( java.awt.Color.BLUE );
		labelText.setOpaque( true );
		// use the JLabel constructor with an Imagelcon argument
		labelImage = new JLabel( new ImageIcon("sushi.jpeg" ));
		labelImage.setToolTipText( "photo of sushi" );
		// add the two labels to the content pane
		contents.add(labelText);
		contents.add(labelImage);
		setSize( 500, 300);
		setVisible( true );
	}
	public static void main( String [ ] args )
		{
			JLabel_Dinner dinner = new JLabel_Dinner( );
			dinner.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		}
		

		
}
	

