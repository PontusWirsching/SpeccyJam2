package com.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.lss.flasher.LEngine;
import com.lss.flasher.StateHandler.StateHandler;

public class Start extends LEngine {

	Graphics G;
	
	
	public Start(int width, int height, String frameName) {
		super(width, height, frameName);
		
		StateHandler.addState(new Game("GAME"));
		StateHandler.setState("GAME");
		
		skipIntro();
		start();
	}

	@Override
	public void update() {
		StateHandler.update();
	}

	@Override
	public void render() {
		BufferedImage image = new BufferedImage(256,192, BufferedImage.TYPE_INT_RGB);
		G = image.getGraphics();
		StateHandler.render(G);
		g.drawImage(image, 0, 0, WIDTH, HEIGHT, null);
	}

	public static void main(String[] args) {
		new Start(1024, 720, "Speccy Jam");
	}

}
