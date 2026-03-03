public interface TelcoSubscription {
    String accept(UsagePromo promo, double price);
    String accept(UnliCallTextOffer unliPackage, boolean unliCallText);
}