import javax.swing.*;

public class Main {

    public static void mostrarNotas(Cuenta obj, String cadena) {
        String datos = "[";
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                datos += obj.getVector(i) + "]";
            } else {
                datos += obj.getVector(i) + ", ";
            }
        }
        System.out.println(datos);
    }


    public static void main(String[] args) {
        Cuenta obj = new Cuenta();
        obj.crearVector();
        int nota;

        for (int i = 0; i < obj.getTamanio(); i++) {
            nota = Integer.parseInt((JOptionPane.showInputDialog("Ingrese la nota en la posicion " + (i + 1))));
            if (nota > 0 && nota <= 10) {
                obj.setVector(i, nota);
            }
        }
        mostrarNotas(obj, "Notas ingresadas: ");

        System.out.println("La nota maxima es: " + obj.notaMaxima());
        System.out.println("La nota minima es: " + obj.notaMinima());
        System.out.println("El promedio de notas es: " + obj.promedioNotas());
    }
}