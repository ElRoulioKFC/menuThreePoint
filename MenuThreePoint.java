package menuThreePoint;
import processing.core.*;

public class MenuThreePoint extends PApplet{
    public MenuThreePoint (){

    }
    public void settings() {
    		size(500, 500);
    	}

    	public void draw(){
    		background(color(0,0,100));
    	}

    	public static void main(String[] passedArgs) {
    		String[] appletArgs = new String[] { "MySketch" };
    		PApplet.main(appletArgs);
        }

    public void clamer() {
           // rect(100, 100, 100, 100);
        System.out.println("YOUPIIIIIIIIIE !");
    }



}
