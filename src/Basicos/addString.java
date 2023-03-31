package Basicos;

import java.util.List;
import java.util.stream.Collectors;

public class addString {

    public String addWords(List<String> lista){
        StringBuffer sb= new StringBuffer();
        lista.stream().skip(3).limit(3).forEach(s->sb.append(s + "-"));
        return sb.toString();
    }
}
