package Basicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ordenamientoList {

    public List<Integer> ordenarList(List<String> list){
        List<Integer> enteros= new ArrayList<>();
        enteros=list.stream().sorted().map(Integer::parseInt).collect(Collectors.toList());
        return  enteros;
    }
}
