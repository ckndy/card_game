import static org.junit.Assert.*;
import org.junit.*;
import card_game_management.*;

public class CardTest {

  Card card;

  @Before
  public void before(){
    card = new Card(SuitType.CLUBS, RankType.THREE);
  }

  @Test
  public void canGetSuit(){
    assertEquals(SuitType.CLUBS, card.getSuit());
  }

  @Test
  public void canGetRank(){
    assertEquals(RankType.THREE, card.getRank());
  }

  @Test
  public void canShowCard(){
    assertEquals("THREE of CLUBS", card.showCard());
  }
}