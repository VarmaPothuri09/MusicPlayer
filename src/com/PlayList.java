package com;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
  private String playListName;
 private List<Song>songs=new ArrayList<>();
 
 
  public String getPlayListName() {
	return playListName;
}
  public PlayList(String playListName) {
		super();
		this.playListName = playListName;
		
}
  public void setPlayListName(String playListName) {
	this.playListName = playListName;
  }
  
  public List<Song> getSongs() {
	return songs;
  }
  

  public void setSongs(List<Song> songs) {
	this.songs = songs;
  }
  
  
}
