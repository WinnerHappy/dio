public class AnatomiaClasses3 {
    public static void main(String[] args) {
        /*
        ESTRUTURA :
        Tipo NomeBemDefinido = Atribuição (Opcional em alguns casos)
         */

        /* EXEMPLO :
        String meuNome = "Winner";
        int idade = 23;
        double altura = 1.92;
        boolean verdadeira = true;
        Dog spike; // Observe que aqui a variavel spike nao tem valor.
        idade = 24; // <- aqui a variavel sofre alteração
         */

        String primeiroNome = "Winner";
        String segundoNome = "Happy";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
