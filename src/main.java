import Basicos.*;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String args[]) {
        //Funcion a Mayuscula
        UpperCaseWord upperCaseWord = new UpperCaseWord();

        List<String> listaToMayuscula = Arrays.asList("la", "vida", "es", "bella");
        List<String> resultado = upperCaseWord.changeToUpper(listaToMayuscula);
        System.out.println(resultado);

        //Funcion para remover palabra menores a 10 carateres

        removeWord removeword = new removeWord();
        List<String> listado = Arrays.asList(
                "A la una", "De eso tan bueno no dan tanto", "Hoy no fío mañana sí", "A las dos", "Más vale pájaro en mano que cien volando", "Entre menos sepa mejor vivo", "La vejez al que no lo mata lo desfigura", "y", "A las tres", "La plata se va y el burro queda");
        List<String> resultado1 = removeword.removeChart(listado);
        System.out.println(resultado1);


        //Concatenar string de una lista
        List<String> listado2 = Arrays.asList("Aprende", "a", "usar", "lambdas", "y Streams", "de", "Java 8");
        addString addStrings = new addString();
        String s = addStrings.addWords(listado2);
        System.out.println(s);


        //COnvertir una lista de String a enteros
        List<String> listado3 = Arrays.asList("10", "100", "20", "01", "22", "11", "5");
        ordenamientoList listaEnteros = new ordenamientoList();
        List<Integer> list1 = listaEnteros.ordenarList(listado3);
        System.out.println(list1);

        //Ordenar una lista por tamaño de letr
        List<String> listado4 = Arrays.asList("Érase", "una", "vez", "unos", "desarrolladores", "que", "querían", "aprender", "lambdas", "y", "la", "API", "Stream");
        ordenarListaString ordenarString = new ordenarListaString();
        List<String> lista2 = ordenarString.ordenarListaString(listado4);
        System.out.println(lista2);

    }
}

