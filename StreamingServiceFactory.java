class StreamingServiceFactory {
    public static StreamingService getService(String type) {
        if (type.equalsIgnoreCase("Spotify")) {
            return new Spotify();
        } else if (type.equalsIgnoreCase("YouTubeMusic")) {
            return new YouTubeMusic();
        } else if (type.equalsIgnoreCase("Deezer")) {
            return new Deezer();
        } else {
            throw new IllegalArgumentException("Serviço de streaming desconhecido: " + type);
        }
    }
}