package e.g.dev;
import java.util.ArrayList;
import java.util.List;

public class Multiplication {
    public static List<String> generarTablaMultiplicar(int n) {
        List<String> tabla = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            tabla.add(n + " x " + i + " = " + resultado);
        }
        return tabla;
    }

}
