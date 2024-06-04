public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada ?" + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> Tv ligada ?" + smartTV.ligada);

        smartTV.aumentarVolume();

        smartTV.mudarCanal(22);
        
    }
}
