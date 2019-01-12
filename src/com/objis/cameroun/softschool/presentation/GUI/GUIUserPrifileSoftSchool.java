package com.objis.cameroun.softschool.presentation.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;

public class GUIUserPrifileSoftSchool extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIUserPrifileSoftSchool frame = new GUIUserPrifileSoftSchool();
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
	public GUIUserPrifileSoftSchool() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 419);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
		);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(143, 134, 141, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Enregistrer Un Apprenant", "Afficher La Liste Apprenant", "Modifier Apprenant"}));
		comboBox.setSelectedIndex(2);
		
		JComboBox gestionapprenant = new JComboBox();
		gestionapprenant.setSelectedIndex(2);
		gestionapprenant.setForeground(Color.BLACK);
		gestionapprenant.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		gestionapprenant.setEditable(true);
		gestionapprenant.setBackground(Color.BLACK);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setSelectedIndex(2);
		comboBox_2.setForeground(Color.BLACK);
		comboBox_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		comboBox_2.setEditable(true);
		comboBox_2.setBackground(Color.BLACK);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setSelectedIndex(2);
		comboBox_3.setForeground(Color.BLACK);
		comboBox_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		comboBox_3.setEditable(true);
		comboBox_3.setBackground(Color.BLACK);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, 0, 183, Short.MAX_VALUE)
						.addComponent(gestionapprenant, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(gestionapprenant, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(168, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, panel_1}));
	}
}
