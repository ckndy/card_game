import card_game_management.*;
import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {

  Player player1;
  Player player2;

  Card card1;
  Card card2;

  @Before
  public void before(){
    player1 = new Player("Chris");
    player2 = new Player("Murray");

    card1 = new Card(SuitType.HEARTS, RankType.SIX);
    card2 = new Card(SuitType.DIAMONDS, RankType.TWO);

    player1.setHand(card1, card2);
  }

  @Test
  public void PlayerHasName(){
    assertEquals("Chris", player1.getName());
  }

// No setHand has been called on Player2. AssertNull checks that Null has been returned.
 
  @Test 
  public void handStartsEmpty(){
    assertNull(player2.getHand()[0]);
  }

  @Test
  public void canSetHand(){
    assertEquals(card2, player1.getHand()[1]);
  }

  @Test
  public void canShowHand(){
    assertEquals("SIX of HEARTS, TWO of DIAMONDS", player1.showHand());
  }
}