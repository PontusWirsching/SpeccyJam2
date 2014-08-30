package com.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.lss.flasher.LEngine;
import com.lss.flasher.StateHandler.StateHandler;

public class Start extends LEngine {

	
	/*
	 * Todo list:
	 * 
	 * Add a menu
	 * Add a sprite sheet loading system.
	 * Add a Level system with a level handler and stuff.
	 * Add a entity system that everything will extend to: player, aliens, ufo, rocks, grass etc.
	 * Make the player movement
	 * Make ufo and alien AI
	 * Add level loading, level editor for the game??
	 * Score system?
	 * Multiplayer / local co-op?
	 * Add grass and rocks.
	 * Add sprint and health bars.
	 * Add powerups.
	 * 
	 * 
	 */
	
	
	Graphics gs;
	
	public static final int WIDTHIMAGE = 256;
	public static final int HEIGHTIMAGE = 192;
	
	
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
		BufferedImage image = new BufferedImage(WIDTHIMAGE, HEIGHTIMAGE, BufferedImage.TYPE_INT_RGB);
		gs = image.getGraphics();
		StateHandler.render(gs);
		// Render Under
		
		
		// Before
		g.drawImage(image, 0, 0, WIDTH, HEIGHT, null);
	}

	public static void main(String[] args) {
		new Start(1024, 720, "Speccy Jam");
	}

}
