package com.amon.calculadora.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel{
	
	private final JLabel label;

	public Display() {
		setBackground(new Color(45,45,45));
		label = new JLabel("123456,7890");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courrier", Font.ITALIC, 40));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 25));
		
		add(label);
	}
}