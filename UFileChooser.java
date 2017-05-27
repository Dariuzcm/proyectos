package main;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UFileChooser extends JFrame implements ActionListener
{
	private JLabel lbl_archivo,lbl_foto;
	private JTextField tf_archivo;
	private JButton btn_aceptar;
	private Icon icono;
	private JFileChooser fc_archivo;
	
	public UFileChooser() 
	{
			super("Usando el seleccionador de archivos");
			setSize(600,350);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			
			lbl_foto=new JLabel();
			lbl_foto.setBounds(20,0,300,300);
			
			lbl_archivo=new JLabel("Favor de seleccionar archivo:");
			lbl_archivo.setBounds(330,20,200,25);
			
			tf_archivo=new JTextField();
			tf_archivo.setBounds(330, 50, 180, 25);
			
			btn_aceptar=new JButton("Abrir");
			btn_aceptar.setBounds(370, 95, 100, 25);
			btn_aceptar.addActionListener(this);
			
			
			fc_archivo=new JFileChooser(); 
			FileNameExtensionFilter file=new FileNameExtensionFilter("JPG & GIF", "jpg","gif");
			fc_archivo.setFileFilter(file);
			
			add(lbl_foto);
			add(lbl_archivo);
			add(tf_archivo);
			add(btn_aceptar);
	}
	
	public static void main(String[] args) 
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() 
			{
				UFileChooser vent=new UFileChooser();

			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int respuesta=0;
		if(e.getSource()==btn_aceptar)
		{
			respuesta=fc_archivo.showOpenDialog(this);
			
		}
		if(respuesta==JFileChooser.APPROVE_OPTION)
		{
			tf_archivo.setText(fc_archivo.getSelectedFile().getAbsolutePath());
			ImageIcon imagen=new ImageIcon(fc_archivo.getSelectedFile().getAbsolutePath());
			icono= new ImageIcon(imagen.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT));		
			lbl_foto.setIcon(icono);
		}
			
		
	}

}
