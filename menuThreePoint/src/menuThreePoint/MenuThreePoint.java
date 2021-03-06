package menuThreePoint;
import processing.core.*;

// Class who contains all processing-related functions such as function with textWidth(), text(), textSize()...
public class MenuThreePoint extends PApplet{
    public MenuThreePoint (){
    }

    public void settings() {
    		size(1500, 1500);
    	}

    	public void setup() {
    		
    	}

    	public static void main(String[] passedArgs) {
    		String[] appletArgs = new String[] { "MySketch" };
    		PApplet.main(appletArgs);
    		
        }
    	public void draw(){
    		
    		background(color(0,0,100));
            Button bouton = new Button("test flou du capitaine",(float)200,(float)200,(float)200,(float)200);
            Button bouton2 = new Button("test",(float)400,(float)400,(float)200,(float)200);

    		println("postconstructeur");
    		bouton.setTabText(splitText(bouton));
            noFill();
    		println("postnofill");
    	    textFont(this.createFont(bouton));

    		stroke(0,0,255);
    		println("avantlist");
    		float[] yList = createYList(bouton);

    		println("apreslist");
            rect(bouton.getX(), bouton.getSizeY(), bouton.getSizeX(), bouton.getSizeY());
            for (int i = 0; i < bouton.getTabText().length; i++) {
            	textAlign(LEFT,TOP);
                text(bouton.getTabText()[i], this.createXText(bouton,i), yList[i]);

    		}
    		bouton2.setTabText(splitText(bouton2));
    	    textFont(this.createFont(bouton2));
    		float[] yList2 = createYList(bouton2);
    		rect(bouton2.getX(), bouton2.getSizeY(), bouton2.getSizeX(), bouton2.getSizeY());
            for (int i = 0; i < bouton2.getTabText().length; i++) {
            	textAlign(LEFT,TOP);
                text(bouton2.getTabText()[i], this.createXText(bouton2,i), yList2[i]);

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
    		println("precurSet");

    	    cur.setFontSize(fontSize);
    		println("postcurSet");
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
    		//float topText =  (float) ((cur.getY() - textAscent()*0.8) - cur.getY());
    	    //float bottomText =(float) ((cur.getY() + cur.getSizeY()) - cur.getY()  +textDescent()*0.8) ;
    		float sizeText = textDescent() + textAscent();
    		while ( sizeText * cur.getSizeTabText() * 1.5 < cur.getSizeY()) {
    			cur.setFontSize((float) 0.9 * cur.getFontSize());
     	        textSize(cur.getFontSize());
     	        //topText =  (float) ((cur.getY() - textAscent()*0.8) - cur.getY());
     	        //bottomText =(float) ((cur.getY() + cur.getSizeY()) - cur.getY()  +textDescent()*0.8) ;
        		sizeText = textDescent() + textAscent();
    		}
    		float sizeBlank = ((cur.getSizeY() - (sizeText* cur.getSizeTabText()))/(cur.getSizeTabText()+1));
    		println("sizeText : " + sizeText + "\nsizeBlank : " + sizeBlank + "\n");
    		float[] tabY = new float[cur.getSizeTabText()];
    		for (int i = 0; i < tabY.length;i++) {
    			tabY[i] = cur.getY() +(i * sizeText + (i+1) * sizeBlank);
    			println(i);
    		}
    		println("ttttttttttttttttttttttttttttttttttttttttttt");
    		return tabY;
    	}
    	
    	
    	public String[] splitText(Button cur) {
    		String[] tabText;
    		String text = cur.getText();
    	    float fontSize = (float) 0.6 * cur.getSizeY();
    	    textSize(fontSize);
    	    float sizeText = textWidth(cur.getText());
    	    println("sizeText = " + sizeText + "\n sizeX = " + cur.getSizeX());
    	    int nbCut = (int) (sizeText / (cur.getSizeX()*2));
    	    println("nbCut : " + nbCut);
    		int lengthText = cur.getText().length();
    		if (nbCut > 1 ) {
    			tabText = new String[nbCut+1];

    		    for (int i = 1; i < nbCut +1; i++) {
    		    	println("lengthText/(nbCut * i) : " + lengthText/(nbCut * i));
    		    	println("lengthText" + lengthText);
    			      int dernierEspace = text.lastIndexOf(" ", lengthText/(nbCut)+1);
    			      println("dernierEspace" + dernierEspace);
    			      if ( dernierEspace > -1 ) { 
    			    	  println("i : " +  i);
    			    	  println("length : " + tabText.length);
    			    	  println("text : " + cur.getText());
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
        		println(tabText[i]);

			}
    	    return tabText;
    	}
    public void clamer() {
        System.out.println("YOUPIIIIIIIIIE !");
    }

    

}
