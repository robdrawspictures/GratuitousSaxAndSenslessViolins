import org.junit.Before;
import org.junit.Test;
import stock_management.instruments.Guitar;
import stock_management.instruments.GuitarType;
import stock_management.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar acoustic;
    private Guitar electric;
    private Guitar semiAcoustic;
    private Guitar bass;

    @Before
    public void before() {
        electric = new Guitar("Ibanez", InstrumentType.STRING, 400, 7, true, GuitarType.ELECTRIC);
        acoustic = new Guitar("Gibson", InstrumentType.STRING, 500, 6, false, GuitarType.ACOUSTIC);
        semiAcoustic = new Guitar("Les Paul", InstrumentType.STRING, 350, 6, false, GuitarType.SEMIACOUSTIC);
        bass = new Guitar("Fender", InstrumentType.STRING, 550, 4, true, GuitarType.BASS);
    }

    @Test
    public void canPlay(){
        assertEquals("Anyway, here's 'Wonderwall'.", electric.play());
    }

    @Test
    public void canReturnLeftHanded(){
        assertEquals(true, electric.isLeftHanded());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(50, acoustic.markUp());
    }

    @Test
    public void canGetRRP(){
        assertEquals(440, electric.getRRP());
    }
}
