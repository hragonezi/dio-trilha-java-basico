public class OperadoresAritmeticos {
    
    public static void main(String[] args){

        int numero = 5;
        
        /*Incremento/Decremento*/
        numero++;
        System.out.println(numero);

        /* Negação (Inverte o valor da variável) */
        boolean variavel = false;
        System.out.println(!variavel);

        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        /* Sintaxe correta, porém mais verbosa */
        if(a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

        System.out.println(resultado);

        /* Uso de operador ternário
         * A expressão sempre deve ser booleana
         * O "?" caso a expressão seja true
         * O ":" caso a expressão seja false
        */
        String resultado2 = a!=b ? "Verdadeiro" : "Falso";

        System.out.println(resultado2);

    }


}
