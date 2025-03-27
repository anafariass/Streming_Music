// Classe principal que toca músicas
class PlayMusica {
    private StreamingService servico;
    private Logger logger;

    public PlayMusica(StreamingService servico) {
        this.servico = servico;
        this.logger = new Logger();
    }

    public void play(String som) {
        servico.playSong(som);
        logger.log("Música tocada: " + som + " no " + servico.getClass().getSimpleName());
    }
}