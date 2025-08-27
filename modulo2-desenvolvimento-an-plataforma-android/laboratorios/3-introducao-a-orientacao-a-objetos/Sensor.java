public class Sensor {
    String cor;
    double resolucao; // em Megapixels
    int framesPorSegundo;

		public Sensor(){}
    
    // Construtor
    public Sensor(String cor, double resolucao, int framesPorSegundo) {
        this.cor = cor;
        this.resolucao = resolucao;
        this.framesPorSegundo = framesPorSegundo;
    }
    
    /**
     * Retorna a multiplicação da resolução pela quantidade de frames por segundo
     * @return double contendo MPixels por segundo
     */
    public double getMPixelsPorSegundo() {
        return resolucao * framesPorSegundo;
    }
    
    /**
     * Retorna a descrição formatada do sensor
     * @return String com a descrição completa
     */
    public String getDescricao() {
        double mPixelsPorSegundo = getMPixelsPorSegundo();
        return String.format("Sensor: cor=%s, resolucao=%.1fMp, framesPorSegundo=%dfps, mPixelsPorSegundo=%.1fMpps.",
                           cor, resolucao, framesPorSegundo, mPixelsPorSegundo);
    }
    
    // Getters e Setters (opcionais, mas úteis)
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public double getResolucao() {
        return resolucao;
    }
    
    public void setResolucao(double resolucao) {
        this.resolucao = resolucao;
    }
    
    public int getFramesPorSegundo() {
        return framesPorSegundo;
    }
    
    public void setFramesPorSegundo(int framesPorSegundo) {
        this.framesPorSegundo = framesPorSegundo;
    }
}
