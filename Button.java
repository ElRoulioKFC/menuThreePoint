package menuThreePoint;

public class Button {
	private String[] tabText;
	private float x,y,sizeX,sizeY,sizeText;
	private ColorAdapter colorOn,colorOff;
	private Boolean choosed;
	
	
	public Button(String[] tabText, float x, float y, float sizeX, float sizeY, float sizeText, ColorAdapter colorOn,
			ColorAdapter colorOff, Boolean choosed) {
		super();
		this.tabText = tabText;
		this.x = x;
		this.y = y;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.sizeText = sizeText;
		this.colorOn = colorOn;
		this.colorOff = colorOff;
		this.choosed = choosed;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//getters and setters
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
	public float getSizeText() {
		return sizeText;
	}
	public void setSizeText(float sizeText) {
		this.sizeText = sizeText;
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
	
	
	
}
	
