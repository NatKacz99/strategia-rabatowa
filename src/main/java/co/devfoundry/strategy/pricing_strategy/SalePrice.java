package co.devfoundry.strategy.pricing_strategy;

public class SalePrice implements PricingStrategy{
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if(isSignedUpForNewsletter){
            System.out.println("Rabatowa cena: " + (0.5 * price) + "zł");
        } else {
            System.out.println("Użytkownik niezapisany do newslettera, należy wybrać inną strategię cenową!");
        }
    }
}
