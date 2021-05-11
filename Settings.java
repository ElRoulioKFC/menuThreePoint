package menuThreePoint;

public class Settings {
	public static int LIGHTTHEME = 0,LIGHTTHEMEWITHTITLE = 1;
	private ColorAdapter on,off,background,colorText;
	//without title
	private int baseX,baseY,sizeX,sizeY,deroulant;
	//with title
	private int xTitle,yTitle,sizeText,decalage;
	private Boolean title;
	public Settings(int theme) {
		if (theme == Settings.LIGHTTHEME) {
			
			this.on = new ColorAdapter(0,0,0);
			this.off = new ColorAdapter(255,195,77);
			this.background = new ColorAdapter(255,255,255);
			this.colorText = new ColorAdapter(0,0,0);
			this.baseX = 100 ;
			this.baseY = 150 ;
			this.sizeX = 200 ;
			this.sizeY = 100 ;
			this.deroulant = 6;
			this.title = false;
		}
		if (theme == Settings.LIGHTTHEMEWITHTITLE) {
					
			this.on = new ColorAdapter(0,0,0);
			this.off = new ColorAdapter(255,195,77);
			this.background = new ColorAdapter(255,255,255);
			this.colorText = new ColorAdapter(0,0,0);
			this.baseX = 100 ;
			this.baseY = 150 ;
			this.sizeX = 200 ;
			this.sizeY = 100 ;
			this.deroulant = 6;
			this.xTitle = 100 ;
			this.yTitle = 10 ;
			this.sizeText = 32;
			this.decalage = 85;
			this.title = true;
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
	public int getDeroulant() {
		return deroulant;
	}

	public void setDeroulant(int deroulant) {
		this.deroulant = deroulant;
	}


	public int getDecalage() {
		return decalage;
	}


	public void setDecalage(int decalage) {
		this.decalage = decalage;
	}


	public int getSizeText() {
		return sizeText;
	}


	public void setSizeText(int sizeText) {
		this.sizeText = sizeText;
	}


	public int getxTitle() {
		return xTitle;
	}


	public void setxTitle(int xTitle) {
		this.xTitle = xTitle;
	}


	public int getyTitle() {
		return yTitle;
	}


	public void setyTitle(int yTitle) {
		this.yTitle = yTitle;
	}


	public Boolean getTitle() {
		return title;
	}


	public void setTitle(Boolean title) {
		this.title = title;
	}

	
}
