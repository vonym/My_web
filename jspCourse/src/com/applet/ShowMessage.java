package com.applet;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ShowMessage extends JApplet {

	 public void init(){  
		   Container cp = getContentPane();  
		   cp.setLayout(new  BorderLayout());  
		   JLabel label = new JLabel("欢迎阅读",SwingConstants.CENTER);  
		   label.setFont(new Font("隶书",Font.BOLD,20));  
		   cp.add(label,BorderLayout.NORTH);  
		   Image pic = getImage(getDocumentBase(), "pic.jpg");  
		   label = new JLabel(new ImageIcon(pic));  
		   cp.add(label,BorderLayout.CENTER);  
		  }  
}
