package com.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.lss.flasher.LEngine;

public class Start extends LEngine {

	Graphics G;
	
	// Hello
	
	public Start(int width, int height, String frameName) {
		super(width, height, frameName);
		
		
		
		skipIntro();
		start();
	}

	@Override
	public void update() {

	}

	@Override
	public void render() {
		
		BufferedImage image = new BufferedImage(256,192, BufferedImage.TYPE_INT_RGB);
		
		G = image.getGraphics();
		
		
		G.setColor(Color.red);
		G.drawRect(0, 0, 50, 50);
		
		G.drawOval(50, 50, 20, 20);
		
		g.drawImage(image, 0, 0, WIDTH, HEIGHT, null);
		
		
	}

	public static void main(String[] args) {
		new Start(1024, 720, "Speccy Jam");
	}

}
