package menuThreePoint;
import java.util.ArrayList;

import processing.core.*;

// Class who contains all processing-related functions such as function with textWidth(), text(), textSize()...
public class MenuThreePoint extends PApplet{
	private Menu menuCurrent;
	private int[] size;
    public MenuThreePoint (int[] size){
    	this.size = size;
    	
    	
    	Settings settings = new Settings(Settings.LIGHTTHEME);
    	this.menuCurrent = new Menu(settings);
    	menuCurrent.addButton("salut" , null);
    	menuCurrent.addButton("Menu", null);
    }

    public void settings() {
    		size(size[0], size[1]);
    	}

    	public void setup() {
    		
    	}

    	public static void main(String[] passedArgs) {
    		String[] appletArgs = new String[] { "MySketch" };
    		PApplet.main(appletArgs);
    		
        }
    	public void draw(){
    		background(color(menuCurrent.getSettings().getBackground().getR(),menuCurrent.getSettings().getBackground().getG(),menuCurrent.getSettings().getBackground().getB()));
    		drawMenuCurrent();
    
    	}

    	
    	public Menu getMenuCurrent() {
			return menuCurrent;
		}

		public void setMenuCurrent(Menu menuCurrent) {
			if ((menuCurrent.getListButton().size() > 0) || (menuCurrent.getSettings().getTitle())) {
			this.menuCurrent = menuCurrent;
			if (this.getMenuCurrent().getCursor() > this.getMenuCurrent().getListButton().size()) {
				this.getMenuCurrent().setCursor(0);
			}
			}
			else {
				println("essaye de rentrer dans un menu vide");
			}
		}


		public void drawMenuCurrent() {
			if (this.getMenuCurrent().getSettings().getTitle()) {
				fill(menuCurrent.getSettings().getColorText().getR(),menuCurrent.getSettings().getColorText().getG(),menuCurrent.getSettings().getColorText().getB());
        		textAlign(LEFT,TOP);
        		textSize(this.getMenuCurrent().getSettings().getSizeText());
            	text(this.menuCurrent.getTitle(), this.menuCurrent.getSettings().getxTitle(), this.menuCurrent.getSettings().getyTitle());
			}
			if (this.menuCurrent.getListButton().size() < menuCurrent.getSettings().getDeroulant()) {
	    		for(int i = 0; i < this.menuCurrent.getListButton().size();i++ ) {
	    			drawButton(menuCurrent.getListButton().get(i));
	    		}
			}
			else {
				int start;
				if (menuCurrent.getSettings().getDeroulant()%2 == 0) {
					start = menuCurrent.getSettings().getDeroulant()/2;
				}
				else {
					start = menuCurrent.getSettings().getDeroulant()/2;
				}
				start = menuCurrent.getCursor()- start;
				if (start < 0) {
					start = 0;
				}
				if (!(start + menuCurrent.getSettings().getDeroulant() < menuCurrent.getListButton().size())) {
					for (int i = 0; i < start; i++) {
						menuCurrent.downAllButton();
					}
					for (int i = start; i < menuCurrent.getListButton().size(); i++) {
						drawButton(menuCurrent.getListButton().get(i));
						}
					for (int i = 0; i < start; i++) {
						menuCurrent.upAllButton();
					}
				}else {
					for (int i = 0; i < start; i++) {
						menuCurrent.downAllButton();

					}
					for (int i = start; i < start + menuCurrent.getSettings().getDeroulant(); i++) {
						if (this.getMenuCurrent().getListButton().size() > i) {	
							drawButton(menuCurrent.getListButton().get(i));
						}
					}
							
					
					for (int i = 0; i < start; i++) {
						menuCurrent.upAllButton();

					}
				
					}
				
			}
			if (this.getMenuCurrent().getListButton().size() > 0) {
			if ((this.getMenuCurrent().getListButton().get(0).getY() < 0) || (this.getMenuCurrent().getListButton().get(0).getY() > this.getMenuCurrent().getSettings().getBaseY()+5) ) {
				Menu menuCur = new Menu(this.getMenuCurrent().getSettings());
				menuCur.setListButton(new ArrayList<Button>());
				for (int i = 0;i< this.getMenuCurrent().getListButton().size();i++) {
					menuCur.addButton(this.getMenuCurrent().getListButton().get(i).getText(), this.getMenuCurrent().getListButton().get(i).getListener());
				}
				this.getMenuCurrent().setListButton(menuCur.getListButton());
				}
			}
			}
				

    	//draw calling to draw a button
    	private void drawButton(Button cur) {
    		cur.setTabText(splitText(cur));
            noFill();
    	    textFont(this.createFont(cur));

    		float[] yList = createYList(cur);
    		if (cur.getChoosed()) {
        		stroke(cur.getColorOn().getR(),cur.getColorOn().getG(),cur.getColorOn().getB());
        	}
        	else {
        		stroke(cur.getColorOff().getR(),cur.getColorOff().getG(),cur.getColorOff().getB());
        	}
            rect(cur.getX(), cur.getY(), cur.getSizeX(), cur.getSizeY());
            for (int i = 0; i < cur.getTabText().length; i++) {
            	
        		fill(menuCurrent.getSettings().getColorText().getR(),menuCurrent.getSettings().getColorText().getG(),menuCurrent.getSettings().getColorText().getB());

            	
            	textAlign(LEFT,TOP);
                text(cur.getTabText()[i], this.createXText(cur,i), yList[i]);

    		}
    	}
    	
    	
    	//textModifier functions
    	private String longestText(Button cur) {
    		int rowSizeMax = 0;
    		for (int i = 1; i < cur.getTabText().length; i++) {
    			if (textWidth(cur.getTabText()[rowSizeMax]) <  textWidth(cur.getTabText()[i])){
    				rowSizeMax = i;
    			}
    		}
    		return cur.getTabText()[rowSizeMax];
    	}
    	
    	private PFont createFont(Button cur) {//create the font for the text
    		PFont f;

    		float fontSize = (float) (0.9 * cur.getSizeY());
    	    textSize(fontSize);
    	    String longestText = longestText(cur);
    	    float sizeText = textWidth(longestText);
    	    
    	    while (sizeText + cur.getSizeX()/10 > cur.getSizeX() ) {
    	        fontSize = (float) 0.9 * fontSize;
    	        textSize(fontSize);
    	        sizeText = textWidth(longestText);
    	      }
    	    f = createFont("Arial", fontSize);

    	    cur.setFontSize(fontSize);
    	    return f;
    	}
    	
    	public float createXText(Button cur,int row) {//create the value x for where the text should be written
    		return (cur.getSizeX() - textWidth(cur.getTabText()[row]))/2 + cur.getX() ;
    	}
    	    	
    	public float createYText(Button cur,int row) {//create the value y for where the text should be written
    		
    		float topText =  (float) ((cur.getY() - textAscent()*0.8) - cur.getY());
    	    float bottomText =(float) ((cur.getY() + cur.getSizeY()) - cur.getY()  +textDescent()*0.8) ;
    	    return ((cur.getY() + row * cur.getSizeY()/cur.getTabText().length) + ((row+1) * cur.getSizeY()/cur.getTabText().length)) -(topText +  bottomText)/2 ;
    		
    	}
    	// Create a list of value y for where the text should be written
    	private float[] createYList(Button cur) {

    		float sizeText = textDescent() + textAscent();
    		float currentSize = (float) (sizeText * cur.getSizeTabText() * 1.5);
    		while (  currentSize > cur.getSizeY()) {
    			cur.setFontSize((float) 0.9 * cur.getFontSize());
     	        textSize(cur.getFontSize());
        		sizeText = textDescent() + textAscent();
        		currentSize = (float) (sizeText * cur.getSizeTabText() * 1.5);
    		}

    		float sizeBlank = ((cur.getSizeY() - (sizeText* cur.getSizeTabText()))/(cur.getSizeTabText()+1));
    		float[] tabY = new float[cur.getSizeTabText()];
    		for (int i = 0; i < tabY.length;i++) {
    			tabY[i] = cur.getY() +(i * sizeText + (i+1) * sizeBlank);
    		}
    		return tabY;
    	}
    	
    	
    	public String[] splitText(Button cur) {
    		String[] tabText;
    		String text = cur.getText();
    	    float fontSize = (float) 0.6 * cur.getSizeY();
    	    textSize(fontSize);
    	    float sizeText = textWidth(cur.getText());
    	    int nbCut = (int) (sizeText / (cur.getSizeX()*2));
    		int lengthText = cur.getText().length();
    		if (nbCut > 1 ) {
    			tabText = new String[nbCut+1];

    		    for (int i = 1; i < nbCut +1; i++) {
    			      int dernierEspace = text.lastIndexOf(" ", lengthText/(nbCut)+1);
    			      if ( dernierEspace > -1 ) { 
    			    	  tabText[i-1] = text.substring(0, dernierEspace);
    			    	  text = text.substring(dernierEspace+1, text.length());
    			        } else {
    			        	tabText[i-1] = text.substring(0, lengthText/(nbCut));
				        	text = text.substring(lengthText/(nbCut), text.length());
    			        }
    		    }
    		    tabText[nbCut] = text;
    		}else {
    			return new String[]{cur.getText()};
    			}
    		for (int i = 0; i < tabText.length; i++) {

			}
    	    return tabText;
    	}


    

}
