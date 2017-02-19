package card_game_management;
import card_game_management.*;
import java.util.*;

public class Game {

  private ArrayList<Player> players = new ArrayList<Player>();
  private static ArrayList<Card> deck = new ArrayList<Card>();

  public void buildDeck(){
    for (RankType rank : RankType.values()) {
      for (SuitType suit : SuitType.values()) {
        deck.add(new Card(suit, rank));
      }
    }
    shuffleDeck();
  }

  public Game(){
    buildDeck();
  }

  public void shuffleDeck() {
    Collections.shuffle(deck);
  }

  public ArrayList<Card> getDeck() {
    return this.deck;
  }


  public void addPlayer(Player player) {
    players.add(player);
  }

  public int playerCount() {
    return players.size();
  }

  public void deal(){
    for (Player player : this.players) {

      player.setHand(deck.get(0), deck.get(1));

      deck.remove(0);
      deck.remove(0);
    }
  }
}