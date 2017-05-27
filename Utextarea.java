package main;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Utextarea extends JFrame implements ActionListener
{
	
	private JLabel lbl_producto=new JLabel("Nombre del Producto"),
				   lbl_descripcion=new JLabel("Descripcion del producto:"),
				   lbl_mensaje=new JLabel();
	
	private JTextField tf_producto=new JTextField(20);
	private JTextArea ta_descripcion=new JTextArea(20,20);
	private JButton btn_aceptar=new JButton("Aceptar");
	private JScrollPane scrol=new JScrollPane(ta_descripcion);
	
	
	public Utextarea() 
	{
		super("Titulo");
		setSize(300,500);
		setLayout(new FlowLayout());
		setVisible(true);
		this.getContentPane().setBackground(Color.WHITE);
		Image in=Toolkit.getDefaultToolkit().getImage("1495056086_fish-bone.png");
		setIconImage(in);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn_aceptar.addActionListener(this);
		
		
		
		add(lbl_producto);
		add(tf_producto);
		add(lbl_descripcion);
		add(scrol);
		add(btn_aceptar);
		add(lbl_mensaje);
		
		
	}

	public static void main(String[] args)
	{
		Utextarea ventanita=new Utextarea();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==btn_aceptar)
		//	lbl_mensaje.setText(ta_descripcion.getSelectedText());
		//	ta_descripcion.insert(tf_producto.getText()+"\n", 0);
			ta_descripcion.replaceRange(tf_producto.getText(), 3, 7);
	}

}
