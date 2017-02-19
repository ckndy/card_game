package card_game_management;
import card_game_management.*;
import java.util.*;

public class Card {

  private RankType rank;
  private SuitType suit;

  public Card(SuitType suit, RankType rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public SuitType getSuit() {
    return this.suit;
  }

  public void setSuit(SuitType suit) {
    this.suit = suit;
  }

  public RankType getRank() {
    return this.rank;
  }

  public void setRank(RankType rank) {
    this.rank = rank;
  }

  public String showCard(){
    return this.rank.toString() + " of " + this.suit.toString();
  }
}