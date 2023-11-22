package character;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class DefaultCharacter {
	// Default variables for ALL types of characters (player and enemies and even NPCs)
	public int posX, posY;
	public int characterSpeed;
	public BufferedImage up, down, left, right, up1, up2, down1, down2, left1, left2, right1, right2;
	public String direction = "down";
	public Rectangle solidArea;
	public boolean colOn = false;
	public int spriteCounter = 0;
	public int spriteNum = 0;
	
	/*
	 * Idk if we're doing character animations/player animations but it would be done in here and in Player.
	 * Here's a vid of how it would be done:
	 * https://www.youtube.com/watch?v=wT9uNGzMEM4&list=PL_QPQmz5C6WUF-pOQDsbsKbaBZqXj4qSq&index=3
	 */
}
