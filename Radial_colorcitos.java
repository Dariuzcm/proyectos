package main;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Radial_colorcitos extends JFrame implements ItemListener
{
	private ButtonGroup grupo=new ButtonGroup();
	private JRadioButton negro=new JRadioButton("Color default",true),rojo=new JRadioButton("Color rojo",false),
				 verde=new JRadioButton("Color verde",false),azul=new JRadioButton("Color azul",false);
	private JTextField tento=new JTextField(20);
	private JLabel top=new JLabel("Selecciona un color: ");
	
	public Radial_colorcitos()
	{
		super("Cambio de Color");
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		Image in=Toolkit.getDefaultToolkit().getImage("1495056086_fish-bone.png");
		setIconImage(in);
		
		tento.setText("Cambia mi color");
		tento.setEditable(false);
		this.getContentPane().setForeground(Color.yellow);
		this.getContentPane().setBackground(Color.black);
		top.setForeground(Color.YELLOW);
		negro.setForeground(Color.YELLOW);
		negro.setBackground(Color.black);
		azul.setForeground(Color.YELLOW);
		azul.setBackground(Color.black);
		rojo.setForeground(Color.YELLOW);
		rojo.setBackground(Color.black);
		verde.setForeground(Color.YELLOW);
		verde.setBackground(Color.black);
		
		grupo.add(negro);
		grupo.add(rojo);
		grupo.add(azul);
		grupo.add(verde);
		
		
		negro.addItemListener(this);
		rojo.addItemListener(this);
		azul.addItemListener(this);
		verde.addItemListener(this);
		
		add(top);
		add(tento);
		add(negro);
		add(rojo);
		add(azul);
		add(verde);
		
		
	}

	public static void main(String[] args) 
	{
		Radial_colorcitos vetn=new Radial_colorcitos();
	}

	@Override
	public void itemStateChanged(ItemEvent a) 
	{
			if(a.getSource()==rojo)
			{	
				tento.setForeground(Color.RED);
			}
			else if(a.getSource()==azul)
			{	
				tento.setForeground(Color.BLUE);
			}	
			else if(a.getSource()==verde)
			{	
				tento.setForeground(Color.GREEN);
			}
			else if(a.getSource()==negro)
			{	
				tento.setForeground(Color.black);
			}
	}

}
