public class Conexao {
    String tipoPorta;
    int idProtocolo;
    int taxaTransmissao; // em bytes por segundo (Bps)
    
    // Construtores
    public Conexao() {
        // Construtor padrão
    }
    
    public Conexao(String tipoPorta, int idProtocolo, int taxaTransmissao) {
        this.tipoPorta = tipoPorta;
        this.idProtocolo = idProtocolo;
        this.taxaTransmissao = taxaTransmissao;
    }
    
    /**
     * Retorna a taxa de transmissão em MBps (Megabytes por segundo)
     * @return double contendo taxa em MBps
     */
    public double getTaxaMBps() {
        return taxaTransmissao / 1024.0;
    }
    
    /**
     * Retorna o protocolo como String baseado no idProtocolo
     * @return String com o nome do protocolo
     */
    public String getProtocoloString() {
        switch (idProtocolo) {
            case 1:
                return "Rotoscope";
            case 2:
                return "Acustico";
            case 3:
                return "Radio";
            default:
                return "Outros";
        }
    }
    
    /**
     * Retorna a descrição formatada da conexão
     * @return String com a descrição completa
     */
    public String getDescricao() {
        double taxaMBps = getTaxaMBps();
        String protocolo = getProtocoloString();
        
        return String.format("Conexao: tipoPorta=%s, protocolo=%s, taxaTransmissao=%.1fMBps.",
                           tipoPorta, protocolo, taxaMBps);
    }
    
    // Getters e Setters
    public String getTipoPorta() {
        return tipoPorta;
    }
    
    public void setTipoPorta(String tipoPorta) {
        this.tipoPorta = tipoPorta;
    }
    
    public int getIdProtocolo() {
        return idProtocolo;
    }
    
    public void setIdProtocolo(int idProtocolo) {
        this.idProtocolo = idProtocolo;
    }
    
    public int getTaxaTransmissao() {
        return taxaTransmissao;
    }
    
    public void setTaxaTransmissao(int taxaTransmissao) {
        this.taxaTransmissao = taxaTransmissao;
    }
}
