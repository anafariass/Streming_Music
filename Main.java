public class Main {
    public static void main(String[] args) {
        //Escolhendo serviços de streaming
        StreamingService spotify = StreamingServiceFactory.getService("Spotify");
        StreamingService youtubeMusic = StreamingServiceFactory.getService("YouTubeMusic");
        StreamingService deezer = StreamingServiceFactory.getService("Deezer");

        //criando players de musica
        PlayMusica player1 = new PlayMusica(spotify);
        PlayMusica player2 = new PlayMusica(youtubeMusic);
        PlayMusica player3 = new PlayMusica(deezer);

        //tocando musicas em diferentes plataformas
        player1.play("Californication");
        player2.play("Espera pra ver");
        player3.play("Bohemian Rhapsody");
    }
}
