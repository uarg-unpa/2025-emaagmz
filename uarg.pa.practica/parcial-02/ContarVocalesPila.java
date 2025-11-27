public class ContarVocalesPila {
    public static void main(String[] args) {
        
        Cola[char] p = new Cola();
        p.push('a');
        p.push('b');
        p.push('E');
        p.push('i');
        p.push('o');
        p.push('u');
        p.push('x');

        int contadorVocales = 0;
        Cola[char] aux = new Cola();

        while (!p.isEmpty()) {
            char c = p.pop();
            
            if ("aeiouAEIOU".indexOf(c) != -1) {
                contadorVocales++;
            }
            aux.push(c);
        }

        while (!aux.isEmpty()) {
            p.push(aux.pop());
        }

        System.out.println("Cantidad de vocales: " + contadorVocales);
    }
}
