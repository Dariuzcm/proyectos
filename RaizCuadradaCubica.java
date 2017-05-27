package main;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RaizCuadradaCubica extends JFrame implements ActionListener
{	
		private JLabel lbl_numero, lbl_resultado;
		private JTextField tf_numero;
		private JButton btn_cuadro,btn_cubo;
		
		
	public RaizCuadradaCubica()
	{
		super("Raiz cuadrada y cubica");
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		lbl_numero=new JLabel("Ingresa un numero:");
		lbl_numero.setBounds(20,10,150,25);
		//	setBounds(espacipo vertical, horizontal, tamaño de etiqueta horizontal,vertical)
		
		tf_numero=new JTextField();
		tf_numero.setBounds(150,10,100,25);
		
		btn_cuadro=new JButton("Cuadrado");
		btn_cuadro.setBounds(20,50,100,30);
		
		btn_cubo=new JButton("Cubo");
		btn_cubo.setBounds(130,50,100,30);
		btn_cubo.addActionListener(this);
		btn_cuadro.addActionListener(this);
		
		lbl_resultado=new JLabel();
		lbl_resultado.setBounds(50,90,100,30);
		lbl_resultado.setText("Resultado");
		
		
		add(lbl_numero);
		add(tf_numero);
		add(btn_cuadro);
		add(btn_cubo);
		add(lbl_resultado);
	}	
		
	public static void main(String[] args) 
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
			
			@Override
			public void run() 
			{

				RaizCuadradaCubica vent=new RaizCuadradaCubica();
				
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		DecimalFormat d=new DecimalFormat("#,##0.00");
		double numero=Double.valueOf(tf_numero.getText()),res=0;
		
		if(e.getSource()==btn_cuadro)
			res=Math.pow(numero,2);
		else if(e.getSource()==btn_cubo)
			res=Math.pow(numero, 3);
		
			lbl_resultado.setText("Resultado"+String.valueOf(d.format(res) ) 	);
		
	}

}
