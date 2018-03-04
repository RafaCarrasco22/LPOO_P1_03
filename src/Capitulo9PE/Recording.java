/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo9PE;

/**
 *
 * @author Rafael
 */
public class Recording {
    private String title;
	private String artist;
	private Integer playingTime;
	public Recording(String title, String artist, Integer playingTime) {
		this.title = title;
		this.artist = artist;
		this.playingTime = playingTime;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setplayingTime(Integer playingTime) {
		this.playingTime = playingTime;
	}
	public String getTitle() {
		return title;
		
	}
	public String getArtist() {
		return artist;
	}
	public Integer getPlayingTime() {
		return playingTime;
	}
}
