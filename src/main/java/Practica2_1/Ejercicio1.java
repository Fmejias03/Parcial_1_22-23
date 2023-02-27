package Practica2_1;

public class Ejercicio1 {
    /*Input: puntosTotales: cantidad de puntos a generar
Output: Número real que es una aproximación al número pi
aciertos 0;
areaCuadrado 4;
for i 1 to puntosTotales do
Obtener un número aleatorio x entre -1 y 1;
Obtener un número aleatorio y entre -1 y 1;
if d((x, y), (0, 0)) ≤ 1 then aciertos ← aciertos + 1;
end
 return areaCuadrado · (aciertos/puntosTotales) ;
 El cuadrado en que está inscrito el círculo tiene como vértices los puntos
( 1, 1),( 1, 1),(1, 1),(1, 1). El círculo tiene como centro el punto (0, 0).
Además, tal y como explica el vídeo al que se ha hecho referencia anteriormente, se asume que la proporción de puntos que caen dentro del círculo con
respecto al total de puntos generados es aproximadamente la misma que la
proporción entre el área del círculo y la del cuadrado en que está inscrito.
El pseudocódigo está escrito para que el estudiante pueda relacionarlo
con el método explicado en el vídeo. No obstante, se pueden realizar simplificaciones para que el programa final ocupe menos líneas de código sin
cambiar su comportamiento
 */

    public static double aproximacionPi (long puntosTotales) {
        int aciertos = 0;
        double areaCuadrado = 4;
        for (int i = 0; i < puntosTotales; i++) {
            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;
            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                aciertos++;
            }
        }
        return areaCuadrado * (aciertos / puntosTotales);

    }
}
