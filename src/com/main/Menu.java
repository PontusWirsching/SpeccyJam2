package com.main;

import java.awt.Graphics;
import java.awt.Image;

import com.lss.flasher.LEngine;
import com.lss.flasher.StateHandler.State;
import com.lss.flasher.StateHandler.StateHandler;
import com.lss.flasher.tools.Loader;

@SuppressWarnings("serial")
public class Menu extends State {

	public Image image = Loader.loadImage("/background.png");

	public Image start = Loader.loadImage("/start.png");
	public Image start_selected = Loader.loadImage("/startselect.png");
	public Image credits = Loader.loadImage("/credits.png");
	public Image credits_selected = Loader.loadImage("/creditsselect.png");
	public Image quit = Loader.loadImage("/quit.png");
	public Image quit_selected = Loader.loadImage("/quitselect.png");

	public int selected = 0;

	public Menu(String name) {
		super(name);
	}

	private boolean pressed = false;
	private boolean pressed2 = false;

	@Override
	public void update() {

		if (LEngine.key.getKey(4) || LEngine.key.getKey(9)) {
			if (selected == 0) {
				StateHandler.setState("GAME");
			}
			if (selected == 1) {
				
			}
			if (selected == 2) {
				LEngine.onExit();
			}
		}
		
		if (LEngine.key.getKey(0) && !pressed) {
			pressed = true;
			if (selected > 0) {
				selected--;
			}
		} else if (!LEngine.key.getKey(0) && pressed) {
			pressed = false;
		}
		if (LEngine.key.getKey(2) && !pressed2) {
			pressed2 = true;
			if (selected < 2) {
				selected++;
			}
		} else if (!LEngine.key.getKey(2) && pressed2) {
			pressed2 = false;
		}

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(image, 0, 0, 256, 192, null);

		if (selected == 0) {
			g.drawImage(start_selected, 87, 89, 95, 15, null);
		} else {
			g.drawImage(start, 87, 89, 95, 15, null);
		}
		if (selected == 1) {
			g.drawImage(credits_selected, 85, 106, 95, 15, null);
		} else {
			g.drawImage(credits, 85, 106, 95, 15, null);
		}
		if (selected == 2) {
			g.drawImage(quit_selected, 87, 122, 95, 15, null);
		} else {
			g.drawImage(quit, 87, 122, 95, 15, null);
		}

	}

	@Override
	public void selected() {

	}

	@Override
	public void unSelected() {

	}

}
