package Practica2_2;

public class Ejercicio2 {

    private static int DIMENSION = 30;
    private int[][] estadoActual; //matriz que representa el
    // estado actual.
    private int[][] estadoSiguiente
            = new int[DIMENSION][DIMENSION];
    public void leerEstadoActual(){

        estadoActual = new int[DIMENSION][DIMENSION];
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (Math.random() < 0.5) {
                    estadoActual[i][j] = 1;
                } else {
                    estadoActual[i][j] = 0;
                }
            }
        }

    }

    public void generarEstadoActualPorMontecarlo(){
        /*La secuencia de ceros y unos generada es guardada en ‘estadoActual‘ y, utilizando las reglas del juego de la vida, se insertan los ceros y unos correspondientes en ‘estadoSiguiente‘.
*/

        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                int vecinos = contarVecinos(i, j);
                if (vecinos < 2) {
                    estadoSiguiente[i][j] = 0;
                } else if (vecinos == 2) {
                    estadoSiguiente[i][j] = estadoActual[i][j];
                } else if (vecinos == 3) {
                    estadoSiguiente[i][j] = 1;
                } else if (vecinos > 3) {
                    estadoSiguiente[i][j] = 0;
                }
            }
        }
        estadoActual = estadoSiguiente;
        estadoSiguiente = new int[DIMENSION][DIMENSION];
    }



}
