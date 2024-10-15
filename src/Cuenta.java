public class Cuenta {
    private int vector[];
    private int tamanio;

    public Cuenta() {
        vector = null;
        tamanio = 10;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public int getVector(int pos) {
        return vector[pos];
    }

    public void setVector(int pos, int val) {
        vector[pos] = val;
    }

    public void crearVector() {
        vector = new int[tamanio];
    }

    public double notaMaxima() {
        double max = vector[0];
        for (int i = 1; i < tamanio; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        return max;
    }

    public double notaMinima() {
        double min = vector[0];
        for (int i = 1; i < tamanio; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
        }
        return min;
    }

    public double promedioNotas() {
        double suma = 0;
        for (int i = 0; i < tamanio; i++) {
            suma += vector[i];
        }

        return suma / tamanio;
    }
}