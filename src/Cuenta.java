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

}