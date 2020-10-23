package Cards;

public abstract class CardInformation {
    private CardHolder cardHolder;
    private CardType cardType;
    private double initialRate;
    private double turnover;

    CardInformation(CardHolder cardHolder, CardType cardType, double initialRate){
        this.cardHolder = cardHolder;
        this.cardType = cardType;
        this.initialRate = initialRate;
    }

    public abstract double cardRate();

    double getInitialRate(){
        return initialRate;
    }

    double getTurnover(){
        return turnover;
    }

    public void setTurnover(double turnover){
        this.turnover = turnover;
    }

    CardHolder getCardHolder(){
        return cardHolder;
    }

    public CardType getCardType(){
        return cardType;
    }
}
