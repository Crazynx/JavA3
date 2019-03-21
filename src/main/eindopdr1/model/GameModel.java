package src.main.eindopdr1.model;

import java.util.List;

public class GameModel {

    private Card card;
    private List<Card> cards;

    public GameModel() {

        initCards();
    }

    private void initCards() {
        for (int x = 1; x <= 8; x++) {
            createCard("card" + x, x);
            addToCards(getCard());

            createCard("card" + (++x), x );
            addToCards(getCard());
        }


    }

    private void createCard(String name, int value) {
        card = new Card();
        card.setName(name);
        card.setValue(value);
    }

    private Card getCard() {
        return card;
    }

    private void addToCards(Card card) {
        cards.add(card);
    }

    private List<Card> getCards() {
        return cards;
    }
}
