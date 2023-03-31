package Basicos;

import java.util.List;
import java.util.stream.Collectors;

public class removeWord {
    public List<String> removeChart(List<String> list){
        List<String> lista=list.stream().filter(s->s.length()>10).collect(Collectors.toList());
        return lista;
    }
}
