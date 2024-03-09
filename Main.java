package java_project;
import java.util.*;

class Main
{

	public static void main(String[] args)
	{
		Deck deck = new Deck();

		deck.shuffle();

		List<Card> drawnCards = new ArrayList<>();
		for (int i = 0; i < 20; i++)
		{
			drawnCards.add(deck.drawCard());
		}

		Comparator<Card> cardComparator_4 = Comparator.comparing((Card card) -> card.getSuit().getValue())
				.thenComparing(card -> card.getRank().getValue());

		Collections.sort(drawnCards, cardComparator_4);
		System.out.println("Randomly Drawn cards (sorted):");
		for (Card card : drawnCards) {
			System.out.println(card);
		}
	}
}