package UI;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import hashtables.Student;

import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	 Hashtable <String, String> subjects =new <String,String> Hashtable ();
	Hashtable <Integer,Student> students=new <Integer,Student> Hashtable();
	int sCounter=1;
	
	
	
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void initializeSubjects(Hashtable<String, String> subjects) {
		subjects.put("A270", "Geografia");
		subjects.put("A271", "Historia");
		subjects.put("A272", "Lengua");
		subjects.put("A273", "Filosofia");
		subjects.put("A274", "Informatica");
		subjects.put("A275", "Programacion");
		subjects.put("A276", "Estructuras de datos");
		subjects.put("A277", "Bases de datos");
		subjects.put("A278", "Infraestructura de redes");
		subjects.put("A279", "Logica computacional");
		subjects.put("A280", "Historia del cine");
		
		System.out.println(subjects);
	}
	
	public GUI() {
		initialize();
	}
	
	private void initialize() {
		initializeSubjects(subjects);
		Enumeration<String> subs=subjects.elements();
		int subCounter=25;
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 190, 216);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Materias Disponibles");
		lblNewLabel.setBounds(10, 11, 181, 14);
		panel.add(lblNewLabel);
		
		JRadioButton []radioButtons	  = new JRadioButton[9];
		
		
	
		
		for(int i=0;i<9;i++) {
			radioButtons[i]=new JRadioButton();
			radioButtons[i].setText(subs.nextElement());
			radioButtons[i].setBounds(10, subCounter, 181, 14);
			
			panel.add(radioButtons[i]);	
			subCounter=subCounter+15;
		}
			
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(210, 11, 214, 161);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Registrar Nuevo Estudiante");
		lblNewLabel_1.setBounds(10, 11, 194, 14);
		panel_1.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setToolTipText("Nombre");
		txtNombre.setBounds(10, 48, 150, 20);
		panel_1.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(10, 36, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setToolTipText("Apellido Padre");
		textField.setBounds(10, 79, 150, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido Padre");
		lblNewLabel_3.setBounds(10, 66, 115, 14);
		panel_1.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Apellido Madre");
		textField_1.setBounds(10, 110, 150, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Madre");
		lblNewLabel_4.setBounds(10, 97, 86, 14);
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Ingresar Estudiante");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=txtNombre.getText();
				String last=textField.getText();
				String last1=textField_1.getText();
				ArrayList subs=new ArrayList();
				
				
					for(int i=0;i<radioButtons.length;i++) {
						if(radioButtons[i].isSelected()  && radioButtons[i].getText().equalsIgnoreCase("logica computacional")) {
							subs.add(subjects.get("A279"));
						}
						if(radioButtons[i].isSelected()  && radioButtons[i].getText().equalsIgnoreCase("historia del cine")) {
							subs.add(subjects.get("A280"));
						}
						if(radioButtons[i].isSelected()  && radioButtons[i].getText().equalsIgnoreCase("infraestructura de redes")) {
							subs.add(subjects.get("A278"));
						}
						if(radioButtons[i].isSelected()  && radioButtons[i].getText().equalsIgnoreCase("Bases de datos")) {
							subs.add(subjects.get("A277"));
						}
						if(radioButtons[i].isSelected()  && radioButtons[i].getText().equalsIgnoreCase("estructuras de datos")) {
							subs.add(subjects.get("A276"));
						}
						if(radioButtons[i].isSelected()  && radioButtons[i].getText().equalsIgnoreCase("programacion")) {
							subs.add(subjects.get("A275"));
						}
						if(radioButtons[i].isSelected()  && radioButtons[i].getText().equalsIgnoreCase("informatica")) {
							subs.add(subjects.get("A274"));
						}
						if(radioButtons[i].isSelected()  && radioButtons[i].getText().equalsIgnoreCase("filosofia")) {
							subs.add(subjects.get("A273"));
						}
						if(radioButtons[i].isSelected()  && radioButtons[i].getText().equalsIgnoreCase("lengua")) {
							subs.add(subjects.get("A272"));
						}
						if(radioButtons[i].isSelected()  && radioButtons[i].getText().equalsIgnoreCase("Historia")) {
							subs.add(subjects.get("A271"));
						}
						if(radioButtons[i].isSelected()  && radioButtons[i].getText().equalsIgnoreCase("geografia")) {
							subs.add(subjects.get("A270"));
						}
						
					}
				
				
				Student s=new Student(name,last,last1,sCounter,subs);
				
				students.put(sCounter,s);
				
				System.out.println(students.get(sCounter).toString());
				sCounter++;
				
				
				
			}
		});
		btnNewButton.setBounds(10, 134, 150, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 238, 190, 179);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Buscar estudiante");
		lblNewLabel_5.setBounds(10, 11, 142, 14);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ID");
		lblNewLabel_6.setBounds(10, 36, 46, 14);
		panel_2.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Ingrese el ID");
		textField_2.setBounds(10, 61, 170, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(210, 183, 214, 234);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 194, 212);
		panel_3.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(students.get(Integer.parseInt(textField_2.getText()))!=null) {
					textArea.setText(students.get(Integer.parseInt(textField_2.getText())).toString());
				}else {
					textArea.setText("El id ingresado no existe en el sistema");
				}
				
			}
		});
		btnNewButton_1.setBounds(51, 92, 89, 23);
		panel_2.add(btnNewButton_1);
		
	}
}

