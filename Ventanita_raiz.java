package main;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventanita_raiz extends JFrame implements ActionListener
{
	private JLabel etiq_num=new JLabel("Ingresa el Numero: "), lbl_resultado=new JLabel("Resultados\n");
	private JButton boton_raiz=new JButton("Raiz"), boton_cuadrado=new JButton("x^2");
	private JTextField entrada=new JTextField(10);
	private JTextField salida=new JTextField(10);
	
	
	public Ventanita_raiz()
	{
		setLayout(new FlowLayout());
		setSize(170,200);
		this.getContentPane().setBackground(Color.black);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(450,200);
		setVisible(true);
		Image in=Toolkit.getDefaultToolkit().getImage("1495056086_fish-bone.png");
		setIconImage(in);
		
		
		
		etiq_num.setForeground(Color.ORANGE);
		lbl_resultado.setForeground(Color.ORANGE);
		
		salida.setVisible(true);
		salida.setEditable(false);
		entrada.setText("");

		
		boton_raiz.addActionListener(this);
		boton_cuadrado.addActionListener(this);
		add(etiq_num);
		add(entrada);
		add(boton_raiz);
		add(boton_cuadrado);
		add(new JLabel("\t"));
		add(lbl_resultado);
		add(new JLabel("\n\n\n"));
		add(salida);
		
		
	}
	

	public static void main(String[] args) 
	{
		Ventanita_raiz vent=new Ventanita_raiz();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{

		DecimalFormat form=new DecimalFormat("0.00");
		double operacion=0;
		salida.setText("");
		
		try{
		if(e.getSource()==boton_raiz)
		{
			operacion=Math.sqrt(Double.parseDouble(entrada.getText()));
			salida.setText(String.valueOf(form.format(operacion)));
		}
		else if(e.getSource()==boton_cuadrado)
			{
				operacion=Double.parseDouble(entrada.getText());
				salida.setText(String.valueOf((operacion*operacion)));
			}
		}
		catch(NumberFormatException a)
		{
			JOptionPane.showMessageDialog(null, "Debes ingresar Un numero", "Error de formato", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
