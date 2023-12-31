/*package swingPackage;

import character.DefaultCharacter;

public class CollisionCheck {
	
	SwingClass panel;
	//CollisionCheck constructor
	public CollisionCheck(SwingClass panel) {
		this.panel = panel;
	}
	
	public void checkTile(DefaultCharacter character) {
		//define collision borders
		int charLeftWorldX = character.posX + character.solidArea.x;
		int charRightWorldX = character.posX + character.solidArea.x + character.solidArea.width;
		int charTopWorldY = character.posY + character.solidArea.y;
		int charBottomWorldY = character.posY + character.solidArea.y + character.solidArea.height;
		
		int charLeftCol = charLeftWorldX/panel.tileSize;
		int charRightCol = charRightWorldX/panel.tileSize;
		int charTopRow = charTopWorldY/panel.tileSize;
		int charBotRow = charBottomWorldY/panel.tileSize;
		
		int tileNum1, tileNum2;
		//check for specific tiles to enable collision
		//if tile collision is true, turn on collision
		switch(character.direction) {
		case "up":
			charTopRow = (charTopWorldY - character.characterSpeed)/panel.tileSize;
			tileNum1 = panel.tileM.mapTileNum[charLeftCol][charTopRow];
			tileNum2 = panel.tileM.mapTileNum[charRightCol][charTopRow];
			if(panel.tileM.tile[tileNum1].collision == true || panel.tileM.tile[tileNum2].collision == true) {
				character.colOn = true;
			}
			break;
		case "down":
			charBotRow = (charBottomWorldY + character.characterSpeed)/panel.tileSize;
			tileNum1 = panel.tileM.mapTileNum[charLeftCol][charBotRow];
			tileNum2 = panel.tileM.mapTileNum[charRightCol][charBotRow];
			if(panel.tileM.tile[tileNum1].collision == true || panel.tileM.tile[tileNum2].collision == true) {
				character.colOn = true;
			}
			break;
		case "left":
			charLeftCol = (charLeftWorldX - character.characterSpeed)/panel.tileSize;
			tileNum1 = panel.tileM.mapTileNum[charLeftCol][charTopRow];
			tileNum2 = panel.tileM.mapTileNum[charLeftCol][charBotRow];
			if(panel.tileM.tile[tileNum1].collision == true || panel.tileM.tile[tileNum2].collision == true) {
				character.colOn = true;
			}else if(character.posX == 1) {
				character.colOn = true;
			}
			break;
		case "right":
			charRightCol = (charRightWorldX + character.characterSpeed)/panel.tileSize;
			tileNum1 = panel.tileM.mapTileNum[charRightCol][charTopRow];
			tileNum2 = panel.tileM.mapTileNum[charRightCol][charBotRow];
			if(panel.tileM.tile[tileNum1].collision == true || panel.tileM.tile[tileNum2].collision == true) {
				character.colOn = true;
			}
			break;
		}
				
				
		
	}
}
*/