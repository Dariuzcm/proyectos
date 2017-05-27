package main;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;


public class Border01 extends JFrame
	{
		private JButton boton1,boton2,boton3,boton4,boton5;
		
		public Border01()
		{
			super("Ventana que utiliza Border Layout");
			
			setLayout(new BorderLayout()); 
			setSize(300,200);  //setSize(ancho,alto);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			boton1=new JButton("Boton 1");
			boton2=new JButton("Boton 2");
			boton3=new JButton("Boton 3");
			boton4=new JButton("Boton 4");
			boton5=new JButton("Boton 5");
			
			add(boton1, BorderLayout.NORTH);
			add(boton2, BorderLayout.CENTER);
			add(boton3,BorderLayout.SOUTH);
			add(boton4,BorderLayout.WEST);
			add(boton5,BorderLayout.EAST);
			
			setVisible(true);
		}
	
	public static void main(String[] args) 
	{
		Border01 ventana=new Border01();
		
		
	}

}
