
package menuThreePoint;

import processing.core.PFont;

public class Button{
	private String[] tabText;
	private float x,y,sizeX,sizeY,fontSize;
	
	private ColorAdapter colorOn,colorOff;
	private Boolean choosed;
	private String text;
	private PFont font;
	
	public Button(String text, float x, float y, float sizeX, float sizeY, ColorAdapter colorOn,
			ColorAdapter colorOff, Boolean choosed) {
		//this.tabText = this.splitText(text);
		this.x = x;
		this.y = y;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.colorOn = colorOn;
		this.colorOff = colorOff;
		this.choosed = choosed;
	}
	
	public Button(String text, float x, float y, float sizeX, float sizeY) {
		this.x = x;
		this.y = y;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.text = text;
		}
	

	
	//getters and setters

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String[] getTabText() {
		return tabText;
	}
	public void setTabText(String[] tabText) {
		this.tabText = tabText;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getSizeX() {
		return sizeX;
	}
	public void setSizeX(float sizeX) {
		this.sizeX = sizeX;
	}
	public float getSizeY() {
		return sizeY;
	}
	public void setSizeY(float sizeY) {
		this.sizeY = sizeY;
	}
	public ColorAdapter getColorOn() {
		return colorOn;
	}
	public void setColorOn(ColorAdapter colorOn) {
		this.colorOn = colorOn;
	}
	public ColorAdapter getColorOff() {
		return colorOff;
	}
	public void setColorOff(ColorAdapter colorOff) {
		this.colorOff = colorOff;
	}
	public Boolean getChoosed() {
		return choosed;
	}
	public void setChoosed(Boolean choosed) {
		this.choosed = choosed;
	}
	public int getSizeTabText() {
		return this.tabText.length;
	}
	
	public float getFontSize() {
		return fontSize;
	}

	public void setFontSize(float fontSize) {
		this.fontSize = fontSize;
	}
}
	
