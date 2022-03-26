import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;
import stock_management.equipment.Book;
import stock_management.equipment.BookType;
import stock_management.equipment.Equipment;
import stock_management.equipment.Strings;
import stock_management.instruments.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Guitar acoustic;
    private Guitar electric;
    private Guitar semiAcoustic;
    private Guitar bass;
    private Book sheet;
    private Book theory;
    private Strings strings;
    private Equipment drumsticks;
    private Piano upright;
    private Drumkit drums;
    private Shop shop;

    @Before
    public void before(){
        electric = new Guitar("Ibanez", InstrumentType.STRING, 400, 7, true, GuitarType.ELECTRIC);
        acoustic = new Guitar("Gibson", InstrumentType.STRING, 500, 6, false, GuitarType.ACOUSTIC);
        semiAcoustic = new Guitar("Les Paul", InstrumentType.STRING, 350, 6, false, GuitarType.SEMIACOUSTIC);
        bass = new Guitar("Fender", InstrumentType.STRING, 550, 4, true, GuitarType.BASS);
        sheet = new Book("Titanic Motion Picture Score", 20, 120, BookType.SHEET);
        theory = new Book("Every Guitar Chord Ever", 10, 69, BookType.THEORY);
        strings = new Strings("Guitar Strings", 10, "Steel", "Ernie Ball");
        drumsticks = new Equipment("Drum sticks", 15);
        upright = new Piano("Bechstein", InstrumentType.STRING, 1000, 88, PianoType.UPRIGHT);
        drums = new Drumkit("Pearl", InstrumentType.PERCUSSION, 700, 5, false);
        shop = new Shop(2000);

    }

    @Test
    public void canAddToStock(){
        shop.addToStock(electric);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addToStock(electric);
        shop.addToStock(acoustic);
        shop.addToStock(semiAcoustic);
        assertEquals(3, shop.stockCount());
        shop.removeFromStock(electric);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canGetTotalProjectedProfit(){
        shop.addToStock(electric);
        shop.addToStock(acoustic);
        shop.addToStock(semiAcoustic);
        shop.addToStock(sheet);
        shop.addToStock(strings);
        assertEquals(128, shop.getTotalProfit());
    }

    @Test
    public void canFindOnlyLeftHandedGuitars(){
        shop.addToStock(electric);
        shop.addToStock(acoustic);
        shop.addToStock(semiAcoustic);
        shop.addToStock(bass);
        ArrayList<ISell> leftHandedGuitars = shop.getLeftHandedGuitars();
        assertEquals(2, leftHandedGuitars.size());

    }
}
