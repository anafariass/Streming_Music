// Classe principal que toca músicas
class PlayMusica {
    private StreamingService service;
    private Logger logger;

    public PlayMusica(StreamingService service) {
        this.service = service;
        this.logger = new Logger(); // SRP: MusicPlayer não cuida dos logs, usa a classe Logger.
    }

    public void play(String song) {
        service.playSong(song);
        logger.log("Música tocada: " + song + " no " + service.getClass().getSimpleName());
    }
}