package Stratedgy;

public class PurchaseService {

    public String pay(PayMethod payMethod) {
        String result = payMethod.pay();
        
       /*  String result = "";

        switch (payMethod) {
            case "card":
                PayCard card = new PayCard();
                result = card.pay();
                break;
            case "money":
                PayMoney money = new PayMoney();
                result = money.pay();
                break;
            case "applepay":
                PayApple apple = new PayApple();
                result = apple.pay();
            default:
                break;
        } */

        return result;
    }
}
