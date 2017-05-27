package main;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.JobAttributes;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

public class Radio_checkbox extends JFrame implements ItemListener,ActionListener
{
	private JLabel lbl_titulo=new JLabel("Ingresa un Numero 1:"),lbl_2titulo=new JLabel("Ingresa el Numero 2:"),
				   lbl_desc=new JLabel("Seleccione la accion a realizar");
	
	private JTextField tf_numero=new JTextField(10),tf_numero2=new JTextField(10),tf_resultado=new JTextField(10);
	private JRadioButton /*def=new JRadioButton("Ninguno",true),*/radio1=new JRadioButton("Suma",false),radio2=new JRadioButton("Resta",false)
			,radio3=new JRadioButton("Multiplicacion",false),radio4=new JRadioButton("Division",false),
			radio5=new JRadioButton("Potencia"),radio6=new JRadioButton("Raiz Cuadrada",false);	
	
	private JCheckBox seleccion=new JCheckBox("Verificacion de Continuidad",false);
	private JButton btn_aceptar=new JButton("Aceptar");
	private ButtonGroup bt_grupo=new ButtonGroup();
	private double res=0,n1=0,n2=0;
	private DecimalFormat frm=new DecimalFormat("0.00");
	private int itm=0;
	
	public Radio_checkbox()
	{
		super("Practica Radiobutton-CheckBox");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(200,400);
		Image in=Toolkit.getDefaultToolkit().getImage("1495056086_fish-bone.png");
		setIconImage(in);
		setVisible(true);
				
		tf_resultado.setText("Numeros no ingresados");
		tf_resultado.setEditable(false);
		btn_aceptar.addActionListener(this);
		
		tf_numero.setText("0");
		tf_numero2.setText("0");
		
		radio1.addItemListener(this);
		radio2.addItemListener(this);
		radio3.addItemListener(this);
		radio4.addItemListener(this);
		radio5.addItemListener(this);
		radio6.addItemListener(this);
		seleccion.addItemListener(this);
		
		//bt_grupo.add(def);
		bt_grupo.add(radio1);
		bt_grupo.add(radio2);
		bt_grupo.add(radio3);
		bt_grupo.add(radio4);
		bt_grupo.add(radio5);
		bt_grupo.add(radio6);
		
		add(lbl_desc);
		add(seleccion);
		//add(def);

		add(lbl_titulo);
		add(tf_numero);
		add(lbl_2titulo);
		add(tf_numero2);
		add(radio1);
		add(radio2);
		add(radio3);
		add(radio4);
		add(radio5);
		add(radio6);
		add(seleccion);
		add(btn_aceptar);
		add(tf_resultado);
	}
	
	public static void main(String[] args) 
	{
		Radio_checkbox  ventanita=new Radio_checkbox();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		try{		
		/*Suma, Resta Multiplicacion, Division , potencia, raiz Cuadrada*/
			
		lbl_titulo.setText("Ingresa el Numero 1: ");
		lbl_2titulo.setText("Ingrese el Numero 2: ");
		
		
		if(seleccion.isSelected()==true)
		{
			itm=1;
		}
		else itm=0;
		
			if(e.getSource()==radio1)
				{

					tf_numero2.setEditable(true);
					res=n1+n2;
					n1=Double.parseDouble(tf_numero.getText());
					n2=Double.parseDouble(tf_numero2.getText());
					
				
				}
			else if(e.getSource()==radio2)
				{

					tf_numero2.setEditable(true);
					res=n1-n2;
					n1=Double.parseDouble(tf_numero.getText());
					n2=Double.parseDouble(tf_numero2.getText());
				
				}
			else if(e.getSource()==radio3)
				{

					tf_numero2.setEditable(true);
					res=n1*n2;
					n1=Double.parseDouble(tf_numero.getText());
					n2=Double.parseDouble(tf_numero2.getText());
				
				}
			else if(e.getSource()==radio4)
				{ 
					n1=Double.parseDouble(tf_numero.getText());
					n2=Double.parseDouble(tf_numero2.getText());

					tf_numero2.setEditable(true);
					lbl_titulo.setText("Ingresa el Numerador");
					lbl_2titulo.setText("Ingrese el Denominador");
					res=n1/n2;
				}
			else if(e.getSource()==radio5)
				{	
					n1=Double.parseDouble(tf_numero.getText());
					n2=Double.parseDouble(tf_numero2.getText());
					
					tf_numero2.setEditable(true);
					lbl_titulo.setText("Ingresa el Numero Base");
					lbl_2titulo.setText("Ingrese la Potencia");
					res=Math.pow(n1,n2);
				}
			else if(e.getSource()==radio6)
				{	
					lbl_titulo.setText("Ingrese el Numero: ");
					tf_numero2.setEditable(false);
						
					n1=Double.parseDouble(tf_numero.getText());
					res=Math.sqrt(n1);				
				}
		
		}
		catch(NumberFormatException a)
		{
			JOptionPane.showMessageDialog(null, "Se esperaba Un numero", "Ups Un error!!!", JOptionPane.ERROR_MESSAGE);
		}
			
	}

	@Override
	public void actionPerformed(ActionEvent a) 
	{
		
		if(a.getSource()==btn_aceptar && itm==1)
			tf_resultado.setText(String.valueOf(frm.format(res)));
		else
			JOptionPane.showMessageDialog(null, "Debes activar la Verificacion", "Atencion", JOptionPane.INFORMATION_MESSAGE);
	}



}
