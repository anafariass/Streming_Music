// Classe Main para testar nosso código
public class Main {
    public static void main(String[] args) {
        // Escolhendo o serviço de streaming via Factory Method
        StreamingService spotify = StreamingServiceFactory.getService("Spotify");
        StreamingService youtubeMusic = StreamingServiceFactory.getService("YouTubeMusic");
        StreamingService deezer = StreamingServiceFactory.getService("Deezer");

        // Criando players para cada serviço
        PlayMusica player1 = new PlayMusica(spotify);
        PlayMusica player2 = new PlayMusica(youtubeMusic);
        PlayMusica player3 = new PlayMusica(deezer);

        // Tocando músicas em diferentes plataformas
        player1.play("Shape of You");
        player2.play("Blinding Lights");
        player3.play("Bohemian Rhapsody");
    }
}
