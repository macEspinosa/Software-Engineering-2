import java.util.*;

public class TelcoAllowance implements UsagePromo {
    
    private static Map<String, Integer> dataAllowanceMap = new HashMap<>();
    
    static {
        dataAllowanceMap.put("Smart", 15);
        dataAllowanceMap.put("Globe", 10);
        dataAllowanceMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        int dataAllowance = dataAllowanceMap.getOrDefault(telcoName, 0);
        
        if (dataAllowance == 0) {
            return "No data allowance offer available for " + telcoName;
        }
        
        return dataAllowance + " GB for ₱" + money + " per month";
    }
}