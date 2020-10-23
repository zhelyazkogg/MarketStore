package Cards;
/* Bronze card:
 * - no discount rate if turnover for previous month < 100$
 * - if turnover rate is between 100$ and 300$ - the discount rate is 1%
 * - if turnover rate is > 300$ - the discount rate is 2.5%
 * */
public class Bronze extends CardInformation {
    public Bronze(CardHolder cardHolder){
        super(CardType.BRONZE, cardHolder, 0)
    }

    @Override
    public double cardRate(){
        if (getTurnover() < 100){
            return initialRate;
        }
        if (getTurnover() >=100 || getTurnover() <= 300){
            return 1;
        }
        if (getTurnover() > 300){
            return 2.5;
        }
    }
}
