package card_game_management;
import card_game_management.*;
import java.util.*;

public class Deck {

  private static ArrayList<Card> deck = new ArrayList<Card>();

  public void buildDeck() {
    for (RankType rank : RankType.values()) {
      for (SuitType suit : SuitType.values()) {
        deck.add(new Card(suit, rank));
      }
    }

    shuffleDeck();
  }

  public Deck() {
    buildDeck();
  }

  public void shuffleDeck() {
    Collections.shuffle(deck);
  }

  public ArrayList<Card> getDeck() {
    return this.deck;
  }
}

