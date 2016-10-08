package com.app.src.main;

import javax.swing.JFrame;

public class MainComponent
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("CLOTHING APP");

		MainMenu menu = new MainMenu();
		frame.add(menu);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
}
