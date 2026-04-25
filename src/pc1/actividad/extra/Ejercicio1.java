package pc1.actividad.extra;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int hor,min,seg;
        
        System.out.println("Ingrese la hora");
        hor = sc.nextInt();
        System.out.println("Ingrese los minutos");
        min = sc.nextInt();
        System.out.println("Ingrese los segundos");
        seg = sc.nextInt();
        
        System.out.printf("La hora ingresada es: %02d:%02d:%02d\n", hor,min,seg);
        
        if ((hor>=0&&hor<=23)&&(min>=0&&min<=59)&&(seg>=0&&seg<=59)){
            seg=seg+1;
            if (seg==60){
                seg=0;
                min=min+1;
                if (min==60){
                    min=0;
                    hor=hor+1;
                    if (hor == 24){
                        hor=0;
                    }
                }            
            }
            System.out.printf("La hora aumentada en 1 segundo es: %02d:%02d:%02d\n", hor,min,seg);
        } else {
            throw new IllegalArgumentException("Valores no validos");
        }
    }
}
