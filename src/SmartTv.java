public class SmartTv {
    boolean ligada= false;
    int volume=25;
    int canal=1;

    public void ligar (){
        ligada= true;
        System.out.println("tv ligada");
    }
    public void desligar(){
        ligada=false;
        System.out.println("tv desligada");
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando volume para: "+volume);
    }
    public void abaixarVolume(){
        volume--;
        System.out.println("abaixando volume para: "+ volume);
    }
    public void aumentarCanal(){
        canal++;
    }
     public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal= novoCanal;   
    }
}
