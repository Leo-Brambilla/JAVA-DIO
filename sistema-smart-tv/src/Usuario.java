public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada: "+smartTv.ligada);
        System.out.println("Canal Atual: "+smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv Ligada: "+smartTv.ligada);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual: "+smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal Atual: "+smartTv.canal);

        smartTv.aumetarVolume();
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: "+smartTv.canal);

    }
}
