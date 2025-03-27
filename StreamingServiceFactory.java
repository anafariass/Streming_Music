class StreamingServiceFactory {
    public static StreamingService getService(String tipo) {
        if (tipo.equalsIgnoreCase("Spotify")) {
            return new Spotify();
        } else if (tipo.equalsIgnoreCase("YouTubeMusic")) {
            return new YouTubeMusic();
        } else if (tipo.equalsIgnoreCase("Deezer")) {
            return new Deezer();
        } else {
            throw new IllegalArgumentException("Serviço de streaming desconhecido: " + tipo);
        }
    }
}