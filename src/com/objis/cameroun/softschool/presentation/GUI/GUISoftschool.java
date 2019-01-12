package com.objis.cameroun.softschool.presentation.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.Box;
import java.awt.Color;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTable;
import javax.swing.DropMode;
import javax.swing.border.TitledBorder;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.Rectangle;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.JSplitPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUISoftschool {

	private JFrame frmSoftschool;
	private JPanel mainuserparampanel;
	private JPanel iconuserpanel;
	private JPanel userparampanel;
	private JLabel userloginlabel;
	private JTextField userlogintextField;
	private JLabel userpasswordlabel;
	private JTextField userpasswordtextField;
	private JLabel userlabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUISoftschool window = new GUISoftschool();
					window.initialize();
					window.frmSoftschool.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUISoftschool() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSoftschool = new JFrame();
		frmSoftschool.getContentPane().setEnabled(false);
		frmSoftschool.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\gentelella-master\\production\\images\\american-express.png"));
		frmSoftschool.setTitle("SoftSchool");
		frmSoftschool.setBackground(UIManager.getColor("textHighlight"));
		frmSoftschool.setAlwaysOnTop(true);
		frmSoftschool.setBounds(100, 100, 610, 338);
		frmSoftschool.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSoftschool.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel mainpanel = new JPanel();
		frmSoftschool.getContentPane().add(mainpanel);
		mainpanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		mainuserparampanel = new JPanel();
		mainuserparampanel.setBackground(UIManager.getColor("Label.background"));
		mainpanel.add(mainuserparampanel);
		
		userlabel = new JLabel("");
		userlabel.setBackground(Color.BLACK);
		userlabel.setHorizontalAlignment(SwingConstants.CENTER);
		userlabel.setIcon(new ImageIcon("D:\\gentelella-master\\production\\images\\user.png"));
		GroupLayout gl_mainuserparampanel = new GroupLayout(mainuserparampanel);
		gl_mainuserparampanel.setHorizontalGroup(
			gl_mainuserparampanel.createParallelGroup(Alignment.LEADING)
				.addComponent(userlabel, GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
		);
		gl_mainuserparampanel.setVerticalGroup(
			gl_mainuserparampanel.createParallelGroup(Alignment.LEADING)
				.addComponent(userlabel, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
		);
		mainuserparampanel.setLayout(gl_mainuserparampanel);
		
		iconuserpanel = new JPanel();
		iconuserpanel.setBackground(new Color(72, 61, 139));
		mainpanel.add(iconuserpanel);
		iconuserpanel.setLayout(null);
		
		userparampanel = new JPanel();
		userparampanel.setBounds(0, 112, 297, 74);
		userparampanel.setBackground(new Color(72, 61, 139));
		iconuserpanel.add(userparampanel);
		
		userloginlabel = new JLabel("User Login");
		userloginlabel.setBounds(10, 0, 84, 28);
		userloginlabel.setForeground(new Color(255, 255, 255));
		userloginlabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		
		userlogintextField = new JTextField();
		userlogintextField.setBounds(128, 2, 159, 27);
		userlogintextField.setColumns(10);
		
		userpasswordlabel = new JLabel("User Password");
		userpasswordlabel.setBounds(10, 51, 114, 17);
		userpasswordlabel.setForeground(new Color(255, 255, 255));
		userpasswordlabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		
		userpasswordtextField = new JTextField();
		userpasswordtextField.setBounds(128, 47, 159, 27);
		userpasswordtextField.setColumns(10);
		userparampanel.setLayout(null);
		userparampanel.add(userpasswordlabel);
		userparampanel.add(userloginlabel);
		userparampanel.add(userlogintextField);
		userparampanel.add(userpasswordtextField);
		
		JButton btnNewButton = new JButton("ANNULER");
		btnNewButton.setBounds(50, 223, 89, 23);
		iconuserpanel.add(btnNewButton); 
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//userlogintextField.getText()
			}
		});
		btnOk.setBounds(166, 223, 89, 23);
		iconuserpanel.add(btnOk);
		
	}
}
