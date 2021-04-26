package menuThreePoint;

import java.util.ArrayList;

public class Menu {
	private Settings settings;
	private ArrayList<Button> listButton;
	private int cursor ;
	
	public Menu(Settings settings) {
		this.settings = settings;
		cursor = 0;
		listButton = new ArrayList<Button>();

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
	
	public void upCursor() {
		this.listButton.get(cursor).setChoosed(false);
		if (cursor < listButton.size()-1) {
			cursor++;
		}
		else {
			cursor = 0;
		}
		this.listButton.get(cursor).setChoosed(true);

	}
	public void downCursor() {
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
		this.listButton.get(cursor).click();
	}
	
	public void addButton(String text,ButtonListener listener) {
		int sizeList = this.listButton.size();
		Button cur = new Button(text,settings.getBaseX(),settings.getBaseY() * sizeList + 1 ,settings.getSizeX() ,settings.getSizeY(),settings.getOn(),settings.getOff(),false);
		cur.setListener(listener);
		this.listButton.add(cur);
	}

}
