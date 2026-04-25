package pc1.actividad.extra;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double monto, montofin;
        int tcambio;
        String moneda="Ninguna";
        String menu="""
                    Seleccione moneda de destino
                    1. Dolares Americanos USD
                    2. Euros EUR
                    3. Libras Esterlinas GBP
                    4. Pesos Mexicanos MXN
                    """;
        System.out.println("Ingrese el monto en soles");
        monto = sc.nextDouble();
        System.out.println(menu);
        tcambio = sc.nextInt();
        
        if (monto>0){
            switch(tcambio){
                case 1:{
                    montofin=monto*0.27;
                    moneda="USD";
                };
                break;
                case 2:{
                    montofin=monto*0.25;
                    moneda="EUR";
                };
                break;
                case 3:{
                    montofin=monto*0.21;
                    moneda="GBP";
                };
                break;
                case 4:{
                    montofin=monto*4.5;
                    moneda="MXN";
                };
                break;
                default:{
                    throw new IllegalArgumentException("No valido");
                }
            }
            System.out.printf("Opcion elegida: %d\n", tcambio);
            System.out.printf("Resultado: %.2f soles equivalen a %.2f %s\n", monto, montofin,moneda);
        }else {
            System.out.println("No valido");
        }
    }
}
