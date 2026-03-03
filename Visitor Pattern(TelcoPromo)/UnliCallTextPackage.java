public class UnliCallTextPackage {
    
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText) {
            if (telcoName.equals("Globe")) {
                return "Unlimited calls and texts to Globe subscribers within the country. Calls and texts to other networks are charged extra.";
            } else if (telcoName.equals("Ditto")) {
                return "Unlimited calls and texts to all networks within the country.";
            } else {
                return telcoName + " does not offer unlimited calls and texts.";
            }
        } else {
            if (telcoName.equals("Smart")) {
                return "No unlimited calls and texts offer. Calls and texts are charged per use.";
            } else {
                return telcoName + " does not offer unlimited calls and texts.";
            }
        }
    }
}