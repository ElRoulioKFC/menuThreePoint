package menuThreePoint;

public class Settings {
	public static int LIGHTTHEME = 0;
	private ColorAdapter on,off,background,colorText;
	private int baseX,baseY,sizeX,sizeY;
	
	public Settings(int theme) {
		if (theme == Settings.LIGHTTHEME) {
			
			this.off = new ColorAdapter(0,0,0);
			this.off = new ColorAdapter(255,195,77);
			this.background = new ColorAdapter(255,255,255);
			this.colorText = new ColorAdapter(0,0,0);
			this.baseX = 100 ;
			this.baseY = 200 ;
			this.sizeX = 200 ;
			this.sizeY = 100 ;
		}
	}

	public Settings(ColorAdapter on, ColorAdapter off,ColorAdapter background) {
		this.on = on;
		this.off = off;
		this.background = background;
	}
	
	public ColorAdapter getColorText() {
		return colorText;
	}

	public void setColorText(ColorAdapter colorText) {
		this.colorText = colorText;
	}

	public int getBaseX() {
		return baseX;
	}

	public void setBaseX(int baseX) {
		this.baseX = baseX;
	}

	public int getBaseY() {
		return baseY;
	}

	public void setBaseY(int baseY) {
		this.baseY = baseY;
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}


	public ColorAdapter getOn() {
		return on;
	}

	public void setOn(ColorAdapter on) {
		this.on = on;
	}

	public ColorAdapter getOff() {
		return off;
	}

	public void setOff(ColorAdapter off) {
		this.off = off;
	}

	public ColorAdapter getBackground() {
		return background;
	}

	public void setBackground(ColorAdapter background) {
		this.background = background;
	}
}
