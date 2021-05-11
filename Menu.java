package menuThreePoint;

import java.util.ArrayList;

public class Menu {
	private Settings settings;
	private ArrayList<Button> listButton;
	private int cursor ;
	private String title;
	
	public Menu(Settings settings) {
		this.settings = settings;
		cursor = 0;
		listButton = new ArrayList<Button>();
		if (this.settings.getTitle()){
			this.title = "title";
		}
	}
	
	public String getTitle() {
		return title;
	}

	public Settings getSettings() {
		return settings;
	}
	public void setSettings(Settings settings) {
		this.settings = settings;
	}
	public ArrayList<Button> getListButton() {
		return listButton;
	}
	public void setListButton(ArrayList<Button> listButton) {
		this.listButton = listButton;
	}
	
	public int getCursor() {
		return cursor;
	}

	public void setCursor(int cursor) {
		this.cursor = cursor;
	}

	public void downCursor() {
		this.listButton.get(cursor).setChoosed(false);
		if (cursor < listButton.size()-1) {
			cursor++;
		}
		else {
			cursor = 0;
		}
		this.listButton.get(cursor).setChoosed(true);

	}
	public void upCursor() {
		this.listButton.get(cursor).setChoosed(false);
		if (cursor > 0) {
			cursor--;
		}
		else {
			cursor = listButton.size()-1;
		}
		this.listButton.get(cursor).setChoosed(true);
	}
	
	public void click() {
		this.listButton.get(this.cursor).click();
	}
	
	public void addButton(String text,ButtonListener listener) {
		if (this.settings.getTitle()){
			int sizeList = this.listButton.size();
			Button cur = new Button(text,settings.getBaseX(),settings.getBaseY() * sizeList + 1 + this.getSettings().getDecalage(),settings.getSizeX() ,settings.getSizeY(),settings.getOn(),settings.getOff(),false);
			cur.setListener(listener);
			this.listButton.add(cur);
		}
		else {
		
			int sizeList = this.listButton.size();
			Button cur = new Button(text,settings.getBaseX(),settings.getBaseY() * sizeList + 1 ,settings.getSizeX() ,settings.getSizeY(),settings.getOn(),settings.getOff(),false);
			cur.setListener(listener);
			this.listButton.add(cur);
	}
	}
	
	public void addTitle(String text) {
		if (this.settings.getTitle()){
			this.title = text;
		}
		else {
			System.out.println("miss titleMode");
		}
		}

	
	public void downAllButton() {
		for (int i = 0; i < listButton.size();i++ ) {
			listButton.get(i).setY(listButton.get(i).getY() - settings.getBaseY());
		}
	}
	
	public void upAllButton() {
		for (int i = 0; i < listButton.size();i++ ) {
			listButton.get(i).setY(listButton.get(i).getY() + settings.getBaseY());
		}
		}
	
	
}
