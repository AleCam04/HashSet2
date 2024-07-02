/*
Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato
*/

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> alfabeto = hashSet();
        String lettera = "a";
        String lettera1 = "e";
        if((alfabeto.contains(lettera))){
            System.out.println("La lettera: " + "[" + lettera+ "]" + " è presente nell'alfabeto");
        } else {
            System.out.println("La lettera: " + "[" + lettera+ "]" + " non è nell'alfabeto");
        }
        if((alfabeto.contains(lettera1))){
            System.out.println("La lettera: " + "[" + lettera1+ "]" + " è presente nell'alfabeto");
        } else {
            System.out.println("La lettera: " + "[" + lettera1+ "]" + " non è nell'alfabeto");
        }
    }

    public static HashSet<String> hashSet(){
        HashSet<String> alfabeto = new HashSet<>();
        alfabeto.add("a");
        alfabeto.add("b");
        alfabeto.add("c");
        alfabeto.add("d");
        return alfabeto;
    }
}
