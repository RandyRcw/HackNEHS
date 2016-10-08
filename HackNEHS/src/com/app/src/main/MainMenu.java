package com.app.src.main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MainMenu extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 500);
	}
}