import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Cuenta Cuenta1 = new Cuenta(1012, "Magdalena Sanchez", 1234,0);
        Cuenta1.setSaldo(1000);
        Cuenta Cuenta2 = new Cuenta(1013, "Joselito Pérez", 9876, 500000);
        int x = lectura.nextInt();
        boolean consignacion = Cuenta1.consignar(x);
        if(consignacion == true){
            System.out.println("Consignación exitosa");
        }else System.out.println("No se pudo realizar la consignacion");
        System.out.println(Cuenta1.getSaldo());
    }
      
}
