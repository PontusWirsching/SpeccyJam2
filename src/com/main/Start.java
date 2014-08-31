package com.main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import com.lss.flasher.LEngine;
import com.lss.flasher.StateHandler.StateHandler;

public class Start extends LEngine {

	/*
	 * Todo list:
	 * 
	 * DONE - Add a menu
	 * Add a sprite sheet loading system.
	 * Add a Level system with a level handler and stuff.
	 * Add an entity system that everything will extend to: player, aliens, ufo, rocks, grass etc.
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
		
		
		key.addKey(KeyEvent.VK_W);	
		key.addKey(KeyEvent.VK_A);	
		key.addKey(KeyEvent.VK_S);	
		key.addKey(KeyEvent.VK_D);	
		key.addKey(KeyEvent.VK_SPACE);	
		key.addKey(KeyEvent.VK_UP);
		key.addKey(KeyEvent.VK_LEFT);
		key.addKey(KeyEvent.VK_DOWN);
		key.addKey(KeyEvent.VK_RIGHT);
		key.addKey(KeyEvent.VK_ENTER);

		StateHandler.addState(new Game("GAME"));
		StateHandler.addState(new Menu("MENU"));

		StateHandler.setState("MENU");

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
