package com;

public class Song {
private int songId;
private String songName;
private String singerName;
private double songDuration;

Song(){
	
}
public Song(int songId, String songName, String singerName, Double songDuration) {
	super();
	this.songId = songId;
	this.songName = songName;
	this.singerName = singerName;
	this.songDuration = songDuration;
}
public int getSongId() {
	return songId;
}
public void setSongId(int songId) {
	this.songId = songId;
}
public String getSongName() {
	return songName;
}
public void setSongName(String songName) {
	this.songName = songName;
}
public String getSingerName() {
	return singerName;
}
public void setSingerName(String singerName) {
	this.singerName = singerName;
}
public double getSongDuration() {
	return songDuration;
}
public void setSongDuration(double songDuration) {
	this.songDuration = songDuration;
	
}
@Override
public String toString() {
	return "Song [songId=" + songId + ", songName=" + songName + ", singerName=" + singerName + ", songDuration="
			+ songDuration + "]";
}



}
