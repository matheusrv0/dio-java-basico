public class OperadorTernario {
    public static void main(String[] args) {
        int a;int b;

        a= 6;
        b=5;

        //Representando um IF/ELSE de maneira resumida 
        String resultado = a == b ? "verdadeiro" : "falso";
        //a==b é a condição
        // "?" se a condição for verdadeira (if)
        // ":" se a condição for oposta (else)
        System.out.println(resultado);


        // Representando com o tipo "int"
        int resultado1 = a==b ? 1 : 2;
        //Se caso for verdadeiro aparece 1
        //Se for falso aparece 2
        System.out.println(resultado1);

    }
}
