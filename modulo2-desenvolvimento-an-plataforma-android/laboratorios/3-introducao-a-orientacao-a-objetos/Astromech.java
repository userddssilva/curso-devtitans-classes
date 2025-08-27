class Astromech {
    String modelo;
    Mestre mestre;
    Sensor sensor;
    Conexao conexao;

    public Astromech(){}
    
    public Astromech(String modelo, Mestre mestre, Sensor sensor, Conexao conexao){
        this.modelo = modelo;
        this.mestre = mestre;
        this.sensor = sensor;
        this.conexao = conexao;
    }

    public String getDescricao() {
        StringBuilder descricao = new StringBuilder();

        descricao.append("Astromech modelo ").append(modelo).append(". ");
        descricao.append(mestre.getDescricao()).append(" ");
        descricao.append(sensor.getDescricao()).append(" ");
        descricao.append(conexao.getDescricao());

        return descricao.toString();
    }
}
