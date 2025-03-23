import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class MultiplicationTest {
    @Test
    public void testGenerarTablaMultiplicar() {
        int n = 5;
        List<String> expectedResult = Arrays.asList(
            "6 x 1 = 6",
            "6 x 2 = 12",
            "6 x 3 = 18",
            "6 x 4 = 24",
            "6 x 5 = 30",
            "6 x 6 = 36",
            "6 x 7 = 42",
            "6 x 8 = 48",
            "6 x 9 = 54",
            "6 x 10 = 60"
        );

        List<String> resultadoActual = TablaMultiplicar.generarTablaMultiplicar(n);

        assertThat(resultadoActual, is(notNullValue()));
        assertThat(resultadoActual, hasSize(10));      
        assertThat(resultadoActual, containsInAnyOrder(expectedResult.toArray(new String[0])));
        assertThat(resultadoActual, hasItem("6 x 3 = 18"));
    }
}


