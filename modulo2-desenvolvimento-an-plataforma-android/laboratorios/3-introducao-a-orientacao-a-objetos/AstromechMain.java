public class AstromechMain {
    public static void main(String[] args) {
        // Criando mestres
        Mestre luke = new Mestre("Luke Skywalker", 19, "Alianca para Restauracao da Republica", "Jedi");
        Mestre obiWan = new Mestre("Obi-Wan Kenobi", -57, "Ordem Jedi", "Mestre Jedi");
        Mestre leia = new Mestre("Leia Organa", 19, "Alianca Rebelde", "General");

        // Criando sensores
        Sensor sensorAzul = new Sensor("Azul", 512.0, 240);
        Sensor sensorVermelho = new Sensor("Vermelho", 256.0, 120);
        Sensor sensorVerde = new Sensor("Verde", 1024.0, 480);

        // Criando conexões
        Conexao conexao1 = new Conexao("SCOMP Link", 1, 4096000); // 4000 MBps
        Conexao conexao2 = new Conexao("Hyper Link", 2, 2048000); // 2000 MBps
        Conexao conexao3 = new Conexao("Quantum Link", 3, 8192000); // 8000 MBps

        // Criando droids Astromech
        Astromech r2d2 = new Astromech("R2-D2", luke, sensorAzul, conexao1);
        Astromech r4p17 = new Astromech("R4-P17", obiWan, sensorVermelho, conexao2);
        Astromech bb8 = new Astromech("BB-8", leia, sensorVerde, conexao3);

        System.out.println("=== DROIDS ASTROMECH ===");
        System.out.println("==============================================");

        // Imprimindo descrições dos droids
        System.out.println(r2d2.getDescricao());
        System.out.println("==============================================");

        System.out.println(r4p17.getDescricao());
        System.out.println("==============================================");

        System.out.println(bb8.getDescricao());
        System.out.println("==============================================");

        // Testando métodos individuais
        System.out.println("\n=== TESTES INDIVIDUAIS ===");
        System.out.println("Idade de Obi-Wan em 0 ABY: " + obiWan.getIdade(0) + " anos");
        System.out.println("MPixels por segundo do sensor verde: " + sensorVerde.getMPixelsPorSegundo() + "Mpps");
        System.out.println("Taxa de transmissão da conexão quantum: " + conexao3.getTaxaMBps() + "MBps");
        System.out.println("Protocolo da conexão 2: " + conexao2.getProtocoloString());
    }
}
