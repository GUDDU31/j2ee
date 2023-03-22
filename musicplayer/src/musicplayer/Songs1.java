package musicplayer;

public class Songs1 {
	private int id;
	private String songName;
	private String singerName;
	private String movieName;
	private double songDuration;

	// Parameterize constructor
	Songs1(int id, String songName, String singerName, String movieName, double songDuration) {
		this.id = id;
		this.songName = songName;
		this.singerName = singerName;
		this.movieName = movieName;
		this.songDuration = songDuration;
	}

	public void Songs(int i, String songName2, String singerName2, String movieName2, double songDuration2) {
		// TODO Auto-generated constructor stub
	}

	// getter helper method
	public int getter() {
		return this.id;
	}

	// setter helper method
	public void setter(String newSongName, String newSingerName, String newMovieName, double NewSongDuration) {
		songName = newSongName;
		singerName = newSingerName;
		movieName = newMovieName;
		songDuration = NewSongDuration;
	}

	@Override
	public String toString() {
		return "Song Name: " + this.songName + "\nSong Duration: " + this.songDuration + "\nSinger Name: "
				+ this.singerName + "\nMovie Name: " + this.movieName;
	}


}
