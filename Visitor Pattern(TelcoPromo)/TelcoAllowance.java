public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, int promoPrice) {
        String allowance = "";
        
        if (telcoName.equals("Smart")) {
            allowance = "15 GB";
        } else if (telcoName.equals("Globe")) {
            allowance = "10 GB";
        } else if (telcoName.equals("Ditto")) {
            allowance = "8 GB";
        }
        
        return allowance + " for ₱" + promoPrice + " per month";
    }
}