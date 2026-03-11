package com;

import java.util.ArrayList;
import java.util.List;

public class TestMusicPlayer {
public static void main(String[] args) {
	
	
	MusicPlayer player=new MusicPlayerImpl(); 
		
	
			Song song1=new Song(1,"Shape Of You","Ed Sheran", 4.24);
			Song song2=new Song(2,"Perfect","Ed Sheran",4.40);
			Song song3=new Song(3,"Believer","Imagine Dragons",3.24);
			Song song4=new Song(4,"Faded","Alan Walker",3.32);
			Song song5=new Song(5,"Blinding Lights","The Weekend",3.20);
			
			Song song6=new Song(6,"Aaya Sher","Jangi Reddy", 4.25);
			Song song7=new Song(7,"Chikiri","Mohit Chauhan",5.00);
			Song song8=new Song(8,"Oorum Blood","Sai Abyankar",3.40);
			Song song9=new Song(9,"Butta Bomma","Arman Malik",5.32);
			Song song10=new Song(10,"Premalo","Anurag Kulkarni",4.20);
			
			Song song11=new Song(11,"Chenna Meriya","Arjith Singh", 4.25);
			Song song12=new Song(12,"janab Ali","Mohit Chauhan",5.00);
			Song song13=new Song(13,"Hasi","Shreya Goshal",3.40);
			Song song14=new Song(14,"Raanjhanaa","Jashwindher Singh",5.32);
			Song song15=new Song(15,"Tera Bina","AR Rehaman",4.20);

	
	
		player.addSong(song1);
		player.addSong(song2);
		player.addSong(song3);
		player.addSong(song4);
		player.addSong(song5);
		player.addSong(song6);
		player.addSong(song7);
		player.addSong(song8);
		player.addSong(song9);
		player.addSong(song10);
		player.addSong(song11);
		player.addSong(song12);
		player.addSong(song13);
		player.addSong(song14);
		player.addSong(song15);
		
		List<Song> englishPlayList=new ArrayList<>();
		englishPlayList.add(song1);
		englishPlayList.add(song2);
		englishPlayList.add(song3);
		englishPlayList.add(song4);
		englishPlayList.add(song5);
		
		List<Song> teluguPlayList=new ArrayList<>();
		teluguPlayList.add(song6);
		teluguPlayList.add(song7);
		teluguPlayList.add(song8);
		teluguPlayList.add(song9);
		teluguPlayList.add(song10);
  
		List<Song> hindiPlayList=new ArrayList<>();
		hindiPlayList.add(song11);
		hindiPlayList.add(song12);
		hindiPlayList.add(song13);
		hindiPlayList.add(song14);
		hindiPlayList.add(song15);
		
		player.createPlaylist("EnglishSongs");
		player.createPlaylist("TeluguSongs");
		player.createPlaylist("HindiSongs");
		
		player.addSongToPlayList("EnglishSongs", englishPlayList);
		player.addSongToPlayList("TeluguSongs", teluguPlayList);
		player.addSongToPlayList("HindiSongs", hindiPlayList);
		
	
		player.playSong(1);
		player.pauseSong();
		player.stopSong();
		player.playPlayList("TeluguSongs");


}

}