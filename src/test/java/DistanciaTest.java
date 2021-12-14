
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DistanciaTest {

    @Test
    void deveRetornarKM() {
        Velocimetro velocimetro = new Velocimetro();
        velocimetro.setDistancia(30);

        assertEquals(30, velocimetro.getKM());
    }

    @Test
    void deveRetornarMilhas() {
        Velocimetro velocimetro = new Velocimetro();
        velocimetro.setDistancia(30);
        assertEquals(77.69947814941406, velocimetro.getMilhas());

    }
}