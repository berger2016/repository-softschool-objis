package com.objis.cameroun.softschool.presentation.GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.objis.cameroun.softschool.domaine.Apprenant;
import com.objis.cameroun.softschool.domaine.Enseignant;
import com.objis.cameroun.softschool.domaine.Expert;
import com.objis.cameroun.softschool.domaine.FournisseurContenu;
import com.objis.cameroun.softschool.services.IServices;
import com.objis.cameroun.softschool.services.ServiceImpl;

public class GUIEnregistrerApprenant extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUserName;
	private JTextField textFieldUserLastName;
	private JTextField textFieldUserPhone;
	private JTextField textFieldUserEmail;
	private JTextField textFieldUserLogin;
	private JPasswordField passwordField;
	private JTextField textFieldSpecialite;
	private JTextField textFieldExperience;
	private JFileChooser textFieldDiplome;
	private String login;
	private String experience;
	private String passwd;
	private String nomContenu;
	private String typeContenu;
	private String url;
	private String description;
	private String auteur;
	private String nom;
	private String prenom;
	private String code;
	private String telephone;
	private String email;
	private String niveau;
	private String langue;
	private String grade;
	private String specialite;
	private String role;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIEnregistrerApprenant frame = new GUIEnregistrerApprenant();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIEnregistrerApprenant() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 737);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelForm = new JPanel();
		panelForm.setBorder(new LineBorder(new Color(51, 153, 255)));
		panelForm.setBounds(10, 3, 494, 214);
		contentPane.add(panelForm);
		panelForm.setLayout(null);
		
		JLabel lblUserName = new JLabel("User First Name");
		lblUserName.setBounds(10, 11, 94, 20);
		panelForm.add(lblUserName);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setBackground(SystemColor.info);
		textFieldUserName.setBounds(114, 11, 370, 20);
		panelForm.add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		JLabel lblUserLastName = new JLabel("User Last Name");
		lblUserLastName.setBounds(10, 42, 94, 20);
		panelForm.add(lblUserLastName);
		
		textFieldUserLastName = new JTextField();
		textFieldUserLastName.setBackground(SystemColor.info);
		textFieldUserLastName.setColumns(10);
		textFieldUserLastName.setBounds(114, 42, 370, 20);
		panelForm.add(textFieldUserLastName);
		
		JLabel lblUserPhone = new JLabel("User Phone");
		lblUserPhone.setBounds(10, 73, 94, 20);
		panelForm.add(lblUserPhone);
		
		textFieldUserPhone = new JTextField();
		textFieldUserPhone.setBackground(SystemColor.info);
		textFieldUserPhone.setColumns(10);
		textFieldUserPhone.setBounds(114, 73, 125, 20);
		panelForm.add(textFieldUserPhone);
		
		JLabel lblUserEmail = new JLabel("User Email");
		lblUserEmail.setBounds(260, 73, 56, 20);
		panelForm.add(lblUserEmail);
		
		textFieldUserEmail = new JTextField();
		textFieldUserEmail.setBackground(SystemColor.info);
		textFieldUserEmail.setColumns(10);
		textFieldUserEmail.setBounds(326, 73, 158, 20);
		panelForm.add(textFieldUserEmail);
		
		JLabel lblUserRole = new JLabel("Role");
		lblUserRole.setBounds(10, 113, 94, 20);
		panelForm.add(lblUserRole);
		
		JLabel lblUserLogin = new JLabel("User Login");
		lblUserLogin.setBounds(10, 189, 74, 14);
		panelForm.add(lblUserLogin);
		
		textFieldUserLogin = new JTextField();
		textFieldUserLogin.setColumns(10);
		textFieldUserLogin.setBackground(SystemColor.info);
		textFieldUserLogin.setBounds(114, 186, 143, 20);
		panelForm.add(textFieldUserLogin);
		
		JLabel label = new JLabel("User PassWord");
		label.setBounds(263, 189, 74, 14);
		panelForm.add(label);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(SystemColor.info);
		passwordField.setBounds(347, 186, 137, 20);
		panelForm.add(passwordField);
		
		JScrollPane scrollPaneRole = new JScrollPane();
		scrollPaneRole.setBounds(114, 104, 370, 71);
		panelForm.add(scrollPaneRole);
		
		JList listUserRole = new JList();
		scrollPaneRole.setViewportView(listUserRole);
		listUserRole.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				switch(listUserRole.getSelectedIndex()){
					 
					case 0: System.out.println(listUserRole.getSelectedIndex());
							break;
						
					case 1: System.out.println(listUserRole.getSelectedIndex());
							break;
					
				}
			}
		});
		listUserRole.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		listUserRole.setBorder(UIManager.getBorder("TextField.border"));
		listUserRole.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listUserRole.setVisibleRowCount(3);
		listUserRole.setModel(new AbstractListModel() {
			String[] values = new String[] {"ENS", "EXP", "APPR", "FCONTENU"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JPanel panel = new JPanel();
		panel.setAutoscrolls(true);
		panel.setBorder(new LineBorder(new Color(51, 153, 255)));
		panel.setBounds(10, 217, 494, 441);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblClasse = new JLabel("Choisir La Classe");
		lblClasse.setBounds(10, 11, 94, 14);
		panel.add(lblClasse);
		
		JLabel lblLangue = new JLabel("Choisir La Langue");
		lblLangue.setBounds(10, 68, 94, 14);
		panel.add(lblLangue);
		
		JLabel lblGrade = new JLabel("Choisir Le Grade");
		lblGrade.setBounds(10, 119, 94, 14);
		panel.add(lblGrade);
		
		JLabel lblSpecialite = new JLabel("User Specialite");
		lblSpecialite.setBounds(10, 167, 94, 20);
		panel.add(lblSpecialite);
		
		textFieldSpecialite = new JTextField();
		textFieldSpecialite.setColumns(10);
		textFieldSpecialite.setBackground(SystemColor.info);
		textFieldSpecialite.setBounds(114, 167, 370, 20);
		panel.add(textFieldSpecialite);
		
		JLabel lblExperience = new JLabel("User Experience");
		lblExperience.setBounds(10, 198, 94, 20);
		panel.add(lblExperience);
		
		textFieldExperience = new JTextField();
		textFieldExperience.setColumns(10);
		textFieldExperience.setBackground(SystemColor.info);
		textFieldExperience.setBounds(114, 198, 370, 20);
		panel.add(textFieldExperience);
		
		JScrollPane scrollPaneClasse = new JScrollPane();
		scrollPaneClasse.setBounds(114, 11, 370, 53);
		panel.add(scrollPaneClasse);
		
		JList listUserClasse = new JList();
		scrollPaneClasse.setViewportView(listUserClasse);
		listUserClasse.setModel(new AbstractListModel() {
			String[] values = new String[] {"6ieme", "5ieme", "4ieme Espagnol", "4ieme Allemande", "3ieme Espagnol", "3ieme Allemande", "2nde C", "2nde Espagnol", "2nde Allemande", "1ere C", "1ere D", "Tle C", "Tle D"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listUserClasse.setSelectedIndex(0);
		listUserClasse.setVisibleRowCount(3);
		listUserClasse.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listUserClasse.setBorder(UIManager.getBorder("TextField.border"));
		
		JScrollPane scrollPaneLangue = new JScrollPane();
		scrollPaneLangue.setBounds(114, 68, 370, 42);
		panel.add(scrollPaneLangue);
		
		JList listUserLangue = new JList();
		scrollPaneLangue.setViewportView(listUserLangue);
		listUserLangue.setModel(new AbstractListModel() {
			String[] values = new String[] {"FRANCAIS", "ANGLAIS", "CHINOIS", "ALLEMAND"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listUserLangue.setSelectedIndex(0);
		listUserLangue.setVisibleRowCount(3);
		listUserLangue.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listUserLangue.setBorder(UIManager.getBorder("TextField.border"));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(114, 119, 370, 37);
		panel.add(scrollPane);
		
		JList listUserGrade = new JList();
		listUserGrade.setModel(new AbstractListModel() {
			String[] values = new String[] {"PLEG", "CC (Charge De Cours)", "MC (Maitre De Conference)", "Autres"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listUserGrade.setSelectedIndex(0);
		scrollPane.setViewportView(listUserGrade);
		listUserGrade.setVisibleRowCount(3);
		listUserGrade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listUserGrade.setBorder(UIManager.getBorder("TextField.border"));
		
		JLabel lblDiplome = new JLabel("Diplomes");
		lblDiplome.setBounds(10, 244, 94, 20);
		panel.add(lblDiplome);
		
		textFieldDiplome = new JFileChooser();
		textFieldDiplome.setControlButtonsAreShown(false);
		FileNameExtensionFilter filtre = new FileNameExtensionFilter("pdf", "jpg");
		textFieldDiplome.setFileFilter(filtre);
		textFieldDiplome.setBackground(SystemColor.info);
		textFieldDiplome.setBounds(104, 235, 390, 206);
		panel.add(textFieldDiplome);
		
		JPanel panel_1 = new JPanel();
		panel_1.setAutoscrolls(true);
		panel_1.setBackground(new Color(220, 220, 220));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 255)));
		panel_1.setBounds(10, 659, 494, 42);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setAutoscrolls(true);
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.setBounds(146, 11, 112, 23);
		panel_1.add(btnCancel);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				nom = textFieldUserName.getText();
				prenom = textFieldUserLastName.getText();
				telephone = textFieldUserPhone.getText();
				email = textFieldUserEmail.getText();
				login = textFieldUserLogin.getText();
				code = "ZABRA";
				passwd = passwordField.getText();
				role = listUserRole.getSelectedValue().toString();
				niveau = listUserClasse.getSelectedValue().toString();		
				langue = listUserLangue.getSelectedValue().toString();
				grade  = listUserGrade.getSelectedValue().toString();
				specialite = textFieldSpecialite.getText();
				experience = textFieldExperience.getText();
				
				IServices gestiondoc = new ServiceImpl();
				
				switch(listUserRole.getSelectedIndex()){
				 						
					case 0: Enseignant enseignant = new Enseignant(nom, prenom, code, telephone, email,login,passwd,role, grade, specialite, langue);
							gestiondoc.enregistrerEnseignant(enseignant, 2, 5);
							break;
							
					case 1: Expert expert = new Expert(nom, prenom, code, telephone, email,login,passwd,role, specialite,"NULL",experience,grade);	
							gestiondoc.enregistrerExpert(expert, 2);
							break;
							
					case 2: Apprenant apprenant = new Apprenant(nom, prenom, code, telephone, email,login,passwd,role, niveau, langue);		
							gestiondoc.enregistrerApprenant(apprenant,5);
							break;
							
					case 3: FournisseurContenu fcontenu = new FournisseurContenu(nom, prenom, code, telephone, email,login,passwd,role, specialite, experience);				
							gestiondoc.enregistrerFournisseurContenue(fcontenu);
							break;
				
				}
								
				textFieldUserName.setText("");
				textFieldUserLastName.setText("");
				textFieldUserPhone.setText("");
				textFieldUserEmail.setText("");
				textFieldUserLogin.setText("");
				passwordField.setText("");
				textFieldSpecialite.setText("");
				textFieldExperience.setText("");
				textFieldDiplome.setFileSelectionMode(0);
				
				
 //textFieldSpecialite;
//textFieldExperience;
//textFieldDiplome;

				
			}
		});
		btnOk.setAutoscrolls(true);
		btnOk.setBackground(new Color(0, 0, 255));
		btnOk.setBounds(268, 11, 112, 23);
		panel_1.add(btnOk);
	}
}
