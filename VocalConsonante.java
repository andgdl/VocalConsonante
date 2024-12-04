import java.util.Scanner;

public class VocalConsonante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tipo tp = new Tipo();
       
        while(true){
        System.out.println("Introduce una letra");
        char ch = sc.next().charAt(0);
        
        if(ch=='p'){
            System.out.println("Programa finalizado");
            break;
        }
        
        tp.determinaTipo(ch);
        }
    }
}

class Tipo() {
    public static String determinaTipo(char ch){
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " es una vocal.");
        else 
            System.out.println(ch + " es una consonante."); 
    }
}
