package Basicos;

import java.util.List;
//Funcion que cambia de minusculas a mayusculas
public class UpperCaseWord {

    public List<String> changeToUpper(List<String> list){
        list.replaceAll(s->s.toUpperCase());
        return list;
    }
}
