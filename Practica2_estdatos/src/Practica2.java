import java.util.*;

public class Practica2 {
    public static boolean equivalentes(List<String> l1, List<String> l2) {
        if (l1.size() != l2.size()) {
            return false;
        }
        List<String> copia = new ArrayList<>(l2);

        for (String s : l1) {
            if (!copia.remove(s)) {
                return false;
            }
        }
        return copia.isEmpty();
    }

    public static void invierte(ListIterator<String> iter) {
        while(iter.hasNext()){
            iter.next();
        }
        List<String> listaInvertida= new ArrayList<>();

        while(iter.hasPrevious()){
            listaInvertida.add(iter.previous());
        }

        for (String elemento : listaInvertida){
            iter.next();
            iter.set(elemento);
        }
    }

    public static  List<Integer> ordenar(List<Integer> l) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer num : l) {
            int i = 0;
            while (i < resultado.size() && resultado.get(i) <= num) {
                i++;
            }
            resultado.add(i, num);
        }
        return resultado;
    }

    public static<T> List<T> detectarAlternancia (ListIterator<T> iter) {
        List<T> detectados = new ArrayList<>();
        while (iter.hasPrevious()){
            iter.previous();
        }
        if (!iter.hasNext()){
            return detectados;
        }
        T a = iter.next();
        if (!iter.hasNext()){
            return detectados;
        }
        T b = iter.next();
        while(iter.hasNext()){
            T c = iter.next();
            if (!a.equals(b) && a.equals(c)){
                detectados.add(a);
            }
            a=b;
            b=c;
        }
        return detectados;
    }

}
