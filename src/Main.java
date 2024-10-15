import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        Cuenta obj = new Cuenta();
        obj.crearVector();
        int nota;

        for (int i = 0; i < obj.getTamanio(); i++) {
            do {
                nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota en la posicion" + (i + 1)));
                obj.setVector(i, nota);
            } while (nota < 0 || nota > 10);
        }
    }
}