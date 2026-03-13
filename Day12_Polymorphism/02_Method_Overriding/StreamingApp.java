class Video
{
	void playVideo()
	{
		System.out.println("Playing a Basic Video");
	}
}

class Movie4k extends Video
{
	void playVideo()
	{
		System.out.println("Playing Movie in Ultra HD 4k (High Data Usage)");
	}
}

class OfflineVideo extends Video
{
	void playVideo()
	{
		System.out.println("Playing Download Video (No Internet)");
	}
}

class Trailer extends Video
{
	void playVideo()
	{
		System.out.println("Playing Trailer with Auto-Mute enabled");
	}
}


class StreamingApp
{
	public static void main(String[] args) {
		
		Video video;

		System.out.println("\n----- User Clicked on 4k Movie -----");
		video = new Movie4k();
		video.playVideo();

		System.out.println("\n----- User Clicked on Trailer -----");
		video  = new Trailer();
		video.playVideo();

		System.out.println("\n----- User Playing Offline -----");
		video = new OfflineVideo();
		video.playVideo();

	}
}