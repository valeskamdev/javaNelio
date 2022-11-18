package aula.funcoes.strings;

public class Main {
    public static void main(String[] args) {

        /*
        FORMATAR: toLowerCase(), toUpperCase(), trim()
        RECORTAR: substring(inicio), substring(inicio, fim)
        SUBSTITUIR: Replace(char, char), Replace(String, String)
        BUSCAR POSICOES: IndexOf, LastIndexOf
        RECORTA STRING COM BASE DE UM SEPARADOR:str.Split(" ")
        */

        String original = "abcde FGHIJ ABC abc DEFG";

        String s01 = original.toLowerCase();  // converte caracteres em letras minúsculas
        String s02 = original.toUpperCase();  // converte caracteres em letras minúsculas
        String s03 = original.trim(); // removendo espacos iniciais e finais
        String s04 = original.substring(2);  // cortando a string a partir do segundo caractere
        String s05 = original.substring(2, 9);  // cortando a string do segundo caractere para o nono caractere
        String s06 = original.replace('a', 'x');  // substituindo todos os caracteres 'a' por caracteres 'x'
        String s07 = original.replace("abc", "xy");  // substituindo substrings "abc" por  "xy"

        int i = original.indexOf("bc"); // primeira ocorrencia da substring, e retornando posicao
        int j = original.lastIndexOf("bc");  // última ocorrência da substring especificada, e retornando posicao


        System.out.println("Original: " + "-> " + original + " <-");
        System.out.println("toLowerCase: " + "-> " + s01 + " <-");
        System.out.println("toUpperCase: " + "-> " + s02 + " <-");
        System.out.println("trim: " + "-> " + s03 + " <-");
        System.out.println("substring(2): " + "-> " + s04 + " <-");
        System.out.println("substring(2, 9): " + "-> " + s05 + " <-");
        System.out.println("replace('a', 'x'): " + "-> " + s06 + " <-");
        System.out.println("replace('abc', 'xy'): " + "-> " + s07 + " <-");
        System.out.println("indexOf: " + i);
        System.out.println("lastIndexOf: " + j);

        System.out.println("-------------------------------------------------");

        // funcao split()

        String s = "potato apple lemon orange";
        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);


    }

}
