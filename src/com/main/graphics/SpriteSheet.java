package com.main.graphics;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.HashMap;

public class SpriteSheet {

	public BufferedImage image;
	
	public HashMap<String, Image> sprites = new HashMap<>();
	
	public SpriteSheet(BufferedImage image) {
		this.image = image;
	}
	
	public Image get(String name) {
		return sprites.get(name);
	}
	
	public void loadSprite(String name, int x, int y, int width, int height) {
		int[] pixels = new int[width * height];
		this.image.getRGB(x, y, width, height, pixels, 0, width);
		BufferedImage i = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		i.setRGB(0, 0, width, height, pixels, 0, width);
		Image image = i;
		sprites.put(name, image);
	}

}
