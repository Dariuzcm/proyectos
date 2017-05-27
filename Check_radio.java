package main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Check_radio extends JFrame implements ItemListener
{
	private JRadioButton def=new JRadioButton("Ninguno",true), boton1=new JRadioButton("Gato",false),boton2=new JRadioButton("Perro",false);
	private ButtonGroup grupo=new ButtonGroup();
	private JTextArea tf_resultado=new JTextArea(4,20);
	
	public Check_radio()
	{
		super("Prueba ");
		setVisible(true);
		setSize(300,200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tf_resultado.setText("Selecciona una Opcion");
		add(def);
		
		add(boton1);
		add(boton2);
		
		def.addItemListener(this);
		boton1.addItemListener(this);
		boton2.addItemListener(this);
		
		
		grupo.add(def);
		grupo.add(boton1);
		grupo.add(boton2);
		add(tf_resultado);

	}
	
	public static void main(String[] args) 
	{
		Check_radio ventanita=new Check_radio();
		
	}

	@Override
	public void itemStateChanged(ItemEvent ie) 
	{
		
		if(ie.getSource()==boton1)
			tf_resultado.setText("El Gato hace miaw");
		else if(ie.getSource()==boton2)
				tf_resultado.setText("El Perro Hace Guau");
		else
			tf_resultado.setText("Selecciona una Opcion");
	}
}


