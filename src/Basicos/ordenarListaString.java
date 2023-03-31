package Basicos;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ordenarListaString {

    public List<String> ordenarListaString(List<String> list){

        List<String> lista = list.stream().sorted().collect(Collectors.toList());
        return  lista;
    }
}
