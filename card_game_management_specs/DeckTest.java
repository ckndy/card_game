import card_game_management.*;
import static org.junit.Assert.*;
import org.junit.*;

public class DeckTest{

  Deck deck;

  @Before
  public void before() {
    deck = new Deck();
  } 

  @Test
  public void hasDeckof52() {
    assertEquals(52, this.deck.getDeck().size());
  }
}