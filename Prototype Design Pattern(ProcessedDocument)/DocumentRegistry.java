import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {
    private Map<String, Document> prototypes = new HashMap<>();

    public void registerPrototype(String key, Document document) {
        prototypes.put(key, document);
    }

    public Document getPrototype(String key) {
        Document prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }
}