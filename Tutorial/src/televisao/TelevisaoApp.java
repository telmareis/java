package televisao; // Pacote que contém a classe App

public class TelevisaoApp {
    public static void main(String[] args) {
        // Criação de uma nova instância da classe Televisao
        Televisao tv = new Televisao();

        // Liga a televisão
        tv.ligar();
        
        // Muda o canal para o canal 5
        tv.mudarCanal(5);
        
        // Aumenta o volume uma vez
        tv.aumentarVolume();
        
        // Aumenta o volume mais uma vez
        tv.aumentarVolume();
        
        // Diminui o volume uma vez
        tv.diminuirVolume();
        
        // Desliga a televisão
        tv.desligar();
        
        // Tentativa de mudar de canal para o canal 3 com a TV desligada
        tv.mudarCanal(3);
    }
}