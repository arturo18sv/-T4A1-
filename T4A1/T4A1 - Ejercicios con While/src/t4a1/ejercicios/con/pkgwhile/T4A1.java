package t4a1.ejercicios.con.pkgwhile;
import java.awt.BorderLayout;
import java.util.Scanner;
public class T4A1 {

    public static void main(String[] args) {
        
         // ejercicio1();
        // ejercicio2();
        // rcicio3();
        // rcicio4();
        
    }
    public static void ejercicio1(){
       
        Scanner scanner = new Scanner(System.in);
        
        int N = 0;
        
        System.out.println("Ingresar el limite: ");
        int L = scanner.nextInt();
        
        while(N < L){
            N++;
            System.out.println(N);
        }
      
    }
    
    
    public static void ejercicio2(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("N.Piezas: ");
        int npiezas = scanner.nextInt();
        int n = 0, tallaS = 0, tallaM = 0, tallaL = 0, tallaXL = 0;
        
        
        while (n < npiezas){
            n++;
            System.out.print("\nTalla");
            String talla = scanner.next();
            
            if (talla.equals("S") || talla.equals("s")){
                tallaS++;
            }else if(talla.equals("M") || talla.equals("m")){
                tallaM++;
            }else if(talla.equals("L") || talla.equals("l")){
                tallaL++;
            }else if(talla.equals("XL") || talla.equals("xl")){
                tallaXL++;
            }else{
            }
            
            System.out.print("Cantidades en Talla: \n"
                    + "Chica (S)\t\t" + tallaS + "\n"
                    + "Mediana (M)\t\t" + tallaM + "\n"
                    + "Grande (G)\t\t" + tallaL + "\n"
                    + "Extragrande (XL)\t\t" + tallaXL + "\n");
        }
    }
    
    public static void ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        
        
        
        
    }
    /*
    
    */
    public static void ejercicio4(){
        Scanner scanner = new Scanner(System.in);
        
    }
    
}


