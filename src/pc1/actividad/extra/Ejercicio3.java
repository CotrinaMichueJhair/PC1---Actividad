package pc1.actividad.extra;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double pension, prom, desc=0, descpago=0, montofin=0;
        int pagcon;
        double a=0,b=0;
        
        System.out.print("Ingrese su pension: ");
        pension = sc.nextDouble();
        System.out.print("Ingrese su promedio: ");
        prom = sc.nextDouble();
        System.out.print("¿Pagara al contado? 1.Si / 2.No: ");
        pagcon = sc.nextInt();
        
        String conf = (pagcon==1) ? "Si":"No";
        
        if (conf.equals("Si")){
            descpago=50;
        } else if (conf.equals("No")){
            descpago=0;
        }
        
        if (prom>=0&&prom<=20){
            if (prom>=18){
                desc=0.2;
            }else if (prom>=15&&prom<18){
                desc=0.1;
            }else if (prom>=13&&prom<15){
                desc=0.05;
            } else if (prom<13){
                desc=0;
            }
            montofin = pension - (pension*desc) - descpago;
            a=desc*100;
            b=pension*desc;
        } else {
            throw new IllegalArgumentException("Valor no valido");
        }
        System.out.println("---Desglose de matricula---");
        System.out.printf("Pension Base: s/ %.2f\n", pension);
        System.out.printf("Descuento por promedio %.0f%%: s/ %.2f\n", a,b);
        System.out.printf("Bono pago al contado: s/ %.2f\n", descpago);
        System.out.printf("Monto final: s/ %.2f\n", montofin);
    }
}
