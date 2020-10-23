package Cards;

/* Silver card:
 * starting turnover rate is 2%
 * - if turnover rate is > 300$ - the discount rate is 3.5%
 * */

public class Silver extends CardInformation {
    public Silver(CardHolder cardHolder){
        super(CardType.SILVER, cardHolder, 2)
    }

    @Override
    public double cardRate(){
        if (getTurnover() <= 300){
            return getInitialRate();
        } else {
            return 3.5;
        }
    }
}
