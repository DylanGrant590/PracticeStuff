
public class Recording {
String title;
String artist;
double playingtime;

public Recording(String title, String artist, double playingtime) {
	this.title = title;
	this.artist = artist;
	this.playingtime = playingtime;
	
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getArtist() {
	return artist;
}

public void setArtist(String artist) {
	this.artist = artist;
}

public double getPlayingtime() {
	return playingtime;
}

public void setPlayingtime(double playingtime) {
	this.playingtime = playingtime;
}
}
