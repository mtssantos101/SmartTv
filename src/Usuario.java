public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv= new SmartTv();

        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: "+smartTv.canal);
        smartTv.mudarCanal(19);
         System.out.println("Canal atual: "+smartTv.canal);

        System.out.println("tv ligada? " +smartTv.ligada);
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("volume atual: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> tv ligada?"+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> tv ligada? "+ smartTv.ligada);
    }
}