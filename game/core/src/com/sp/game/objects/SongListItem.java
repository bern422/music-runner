package com.sp.game.objects;

public class SongListItem {
	private int x;
	private int y;
	private boolean isLoaded;
	private String title;
	
	public SongListItem(int x, int y, String title, boolean isLoaded) {
		this.x = x;
		this.y = y;
		this.title = title;
		this.isLoaded = isLoaded;
	}
	
	public SongListItem(String title) {
		x = 0;
		y = 0;
		this.title = title;
		isLoaded = false;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setIsLoaded(boolean isLoaded) {
		this.isLoaded = isLoaded;
	}
	public boolean getIsLoaded() {
		return isLoaded;
	}
}
