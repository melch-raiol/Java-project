public class Usuaruo {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(13);

        System.out.println("Novo Status, TV ligada? " + smartTv.ligada);
        System.out.println("Novo Status, Canal Atual: " + smartTv.canal);
        System.out.println("Novo Status, Volume Atual: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo Status, TV ligada? " + smartTv.ligada);
    }
}
