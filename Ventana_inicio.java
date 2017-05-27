package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Ventana_inicio extends JFrame implements ActionListener
{

	private JLabel lbl_usuario, lbl_contraseña,lbl_mensaje;
	private JTextField tf_usuario;
	private JPasswordField pf_contra;
	private JButton btn_aceptar;
	private ImageIcon palomita=new ImageIcon("imagenes/Palomita.png"),tacha=new ImageIcon("imagenes/tacha.png"),
					  def=new ImageIcon("imagenes/interrogacion.png");
	
	
	public Ventana_inicio(int ancho, int alto)
	{
		super("Ingresa tus datos");
		setLayout(new FlowLayout());
		setSize(ancho,alto);
		setLocation(450,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		
		lbl_usuario=new JLabel("Usuario\n");
		lbl_contraseña=new JLabel("Contraseña\n");
		tf_usuario=new JTextField(20);
		pf_contra=new JPasswordField(20);
		lbl_usuario.setForeground(Color.RED);
		lbl_contraseña.setForeground(Color.RED);
		
		
		lbl_mensaje=new JLabel();
		lbl_mensaje.setIcon(def);
		
		btn_aceptar=new JButton("Aceptar");
		btn_aceptar.addActionListener(this);			//encadenar a ActionListener
		
		btn_aceptar.setBackground(Color.BLACK);
		btn_aceptar.setForeground(Color.WHITE);
		
		add(lbl_usuario);
		add(tf_usuario);
		add(lbl_contraseña);
		add(pf_contra);
		add(btn_aceptar);
		add(lbl_mensaje);
		
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) 
	{
		Ventana_inicio ventana=new Ventana_inicio(250,300);	
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btn_aceptar)
		{
			String u=tf_usuario.getText();
			String p=String.copyValueOf(pf_contra.getPassword());
			
			if(u.equalsIgnoreCase("abrete")&&p.equalsIgnoreCase("sesamo"))
				{
					lbl_mensaje.setIcon(palomita);
					JOptionPane.showMessageDialog(null, "Bienvenido", "Datos Correctos", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{	
					lbl_mensaje.setIcon(tacha);
					JOptionPane.showMessageDialog(null, "Datos Incorrectos", "UPS!! Un error ", JOptionPane.ERROR_MESSAGE);
					lbl_mensaje.setIcon(def);
						
				}
			tf_usuario.setText("");
			pf_contra.setText("");
		}	
	}
}
