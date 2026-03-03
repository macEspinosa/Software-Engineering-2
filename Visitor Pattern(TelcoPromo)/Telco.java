public class Telco implements TelcoSubscription {
    private int dataAllowance;
    private int promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, int promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public int getPromoPrice() {
        return promoPrice;
    }

    @Override
    public int getDataAllowance() {
        return dataAllowance;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }
}