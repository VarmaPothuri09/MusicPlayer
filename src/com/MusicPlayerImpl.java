package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MusicPlayerImpl implements MusicPlayer {
  List<Song> songs=new ArrayList<Song>();
  Song currentSong;
  List<PlayList> playLists=new ArrayList<PlayList>();
  
  
  
  
 
	@Override
	public void addSong(Song song) {
		songs.add(song);
		}

	@Override
	public void updateSong(int songId, String songName, String singerName, double songDuration) {
		for(Song s:songs) {
		if(s.getSongId()== songId) {
			
			s.setSongId(songId);
			s.setSongName(songName);
			s.setSingerName(singerName);
			s.setSongDuration(songDuration);
			System.out.println("Song Updated SuccessFully"+s.getSingerName());
		}
		}
		
	}

	@Override
	public void deleteSong(int songId) {
		Iterator<Song> s=songs.iterator();
		while(s.hasNext()) {
			Song song=s.next();
			if(song.getSongId()==songId) {
				s.remove();
				System.out.println("Song Deleted"+song.getSongId());
				break;
			}
		}
		
		
		
	}
	@Override
	public void playSong(int songId) {
		Iterator<Song> s=songs.iterator();
		while(s.hasNext()) {
			Song song=s.next();
			if(song.getSongId()==songId) {
				currentSong=song;
				System.out.println("Song is Playing"+song.getSongName());
				break;
			}
		}
		
	}
	

	@Override
	public void pauseSong() {
		
		if(currentSong!=null) {
			System.out.println("Song is Paused"+currentSong.getSongName());
		}else {
			System.out.println("No song is Playing");
		}
	}

	@Override
	public void stopSong() {
		
		if(currentSong!=null) {
			System.out.println("song is stopped"+currentSong.getSongName());
		}else {
			System.out.println("No song is Currently Playing");
		}
		
	}

	@Override
	public void displayAllSongs() {
		
		Iterator<Song> s=songs.iterator();
		while(s.hasNext()) {
			Song songs=s.next();
			System.out.println(songs);
		}
		}
	

	@Override
	public void createPlaylist(String playListName) {	
		PlayList playList=new PlayList(playListName);
		playLists.add(playList);
		System.out.println("Play List Created"+playListName);
	}

	@Override
	public void addSongToPlayList(String playListName, List<Song> songs) {
		
		for(PlayList p:playLists) {
			if(p.getPlayListName().equals(playListName)) {
				p.getSongs().addAll(songs);
				break;
			}
		}
	}

	@Override
	public void playPlayList(String playListName) {
		
		for(PlayList p:playLists) {
			if(p.getPlayListName().equals(playListName)) {
			for(Song s:p.getSongs()) {
			
				System.out.println("Now Playing"+s.getSongName());
			}
			break;
		
		
	}

		}

	}
}
