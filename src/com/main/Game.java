package com.main;

import java.awt.Graphics;

import com.lss.flasher.StateHandler.State;
import com.lss.flasher.tools.Loader;
import com.main.graphics.SpriteSheet;

@SuppressWarnings("serial")
public class Game extends State {

	
	
	public int level = 0;
	
	public SpriteSheet sheet;
	
	public Game(String name) {
		super(name);
		
		sheet = new SpriteSheet(Loader.loadBufferedImage("/sprites.png"));
		
		sheet.loadSprite("SHIP", 132, 0, 116, 90);
		
		
	}

	@Override
	public void update() {

	}

	@Override
	public void render(Graphics g) {

	
	
	
	
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Override
	public void selected() {

	}

	@Override
	public void unSelected() {

	}

}
