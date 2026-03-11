package com;

import java.util.List;

public interface MusicPlayer {
  
	void addSong(Song song);
	void updateSong(int songId,String songName,String singerName,double songDuration);
	void deleteSong(int songId);
	void playSong(int songId);
	void pauseSong();
	void stopSong();
	void displayAllSongs();
	void createPlaylist(String playListName);
	void addSongToPlayList(String playListName,List<Song> songs);
	void playPlayList(String playListName);
}
