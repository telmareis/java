package televisao; // Define que a classe Televisão pertence ao pacote televisão

public class Televisao { 
    private boolean ligada; 
    private int canal;
    private int volume;

    // Atributos da Classe
    public Televisao() {
        this.ligada = false; // Inicializa a TV desligada
        this.canal = 1; // Canal padrão
        this.volume = 10; // Volume padrão
    }

    // Métodos da Classe
    
    public void ligar() {
        this.ligada = true; // Altera o estado da TV para ligada
        System.out.println("A TV está ligada."); // Mensagem informativa
    }

    public void desligar() {
        this.ligada = false; // Altera o estado da TV para desligada
        System.out.println("A TV está desligada."); // Mensagem informativa
    }

    public void mudarCanal(int canal) {
        if (ligada) { // Verifica se a TV está ligada
            this.canal = canal; // Altera o canal para o valor fornecido
            System.out.println("Canal mudado para: " + canal); // Mensagem informativa
        } else {
            System.out.println("A TV está desligada. Ligue-a para mudar de canal."); // Mensagem de erro
        }
    }

    public void aumentarVolume() {
        if (ligada) { // Verifica se a TV está ligada
            if (volume < 100) { // Verifica se o volume não atingiu o máximo
                volume++; // Aumenta o volume em 1
                System.out.println("Volume: " + volume); // Mensagem informativa
            } else {
                System.out.println("Volume máximo atingido."); // Mensagem de erro
            }
        } else {
            System.out.println("A TV está desligada. Ligue-a para aumentar o volume."); // Mensagem de erro
        }
    }

    public void diminuirVolume() {
        if (ligada) { // Verifica se a TV está ligada
            if (volume > 0) { // Verifica se o volume não atingiu o mínimo
                volume--; // Diminui o volume em 1
                System.out.println("Volume: " + volume); // Mensagem informativa
            } else {
                System.out.println("Volume mínimo atingido."); // Mensagem de erro
            }
        } else {
            System.out.println("A TV está desligada. Ligue-a para diminuir o volume."); // Mensagem de erro
        }
    }

    public boolean isLigada() {
        return ligada; // Retorna o estado da TV (ligada ou desligada)
    }

    public int getCanal() {
        return canal; // Retorna o canal atual
    }

    public int getVolume() {
        return volume; // Retorna o volume atual
    }
}