import card_game_management.*;
import static org.junit.Assert.*;
import org.junit.*;

public class GameTest {

  Game game;
  Deck deck;
  Player player1;
  Player player2;

  @Before
  public void before() {
    game = new Game();
    deck = new Deck();
    player1 = new Player("Chris");
    player2 = new Player("Murray");
  }

  @Test 
  public void canAddPlayer() {
    game.addPlayer(player1);
    assertEquals(1, game.playerCount());
  }

  @Test
  public void dealsCards() {
    game.addPlayer(player1);
    game.addPlayer(player2);
    game.deal();
    assertNotNull(player1.getHand()[0]);
    assertNotNull(player2.getHand()[1]);
  }
}