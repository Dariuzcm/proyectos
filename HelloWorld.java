package main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class HelloWorld extends JFrame implements ActionListener
{		
	private JLabel etiqueta1;
	private JButton boton1;
	private JLabel imagen;
	
	public HelloWorld()
	{
		super("hello world");
		setLayout(new FlowLayout());
		
		Image in=Toolkit.getDefaultToolkit().getImage("1495056086_fish-bone.png");
		setIconImage(in);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		etiqueta1=new JLabel("Hello World");
		boton1=new JButton("acepta");
		imagen=new JLabel(new ImageIcon("1495056086_fish-bone.png"));
		add(etiqueta1);
		boton1.addActionListener(this);
		
		add(boton1);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		HelloWorld ventana=new HelloWorld();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		etiqueta1.setText("Jose Alberto Ryena");
		add(imagen);
	}


}
