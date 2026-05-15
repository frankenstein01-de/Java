package Le20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VokabelTrainer {
    private Map<String, List<String>> multiMap = new HashMap<>();
    public void put(String englisch, String deutsch) {
        multiMap.computeIfAbsent(englisch, k -> new ArrayList<>())
                .add(deutsch);
    }

    /**
     * Gibt alle deutschen Bedeutungen zurück.
     * Falls das Wort nicht existiert, wird eine leere Liste geliefert (Null-Safe).
     */
    public List<String> get(String englisch) {
        return multiMap.getOrDefault(englisch, new ArrayList<>());
    }

    public static void main(String[] args) {
        VokabelTrainer trainer = new VokabelTrainer();

        trainer.put("to clean", "reinigen");
        trainer.put("to clean", "säubern");
        trainer.put("to clean", "putzen");

        trainer.put("to expand", "vergrößern");
        trainer.put("to expand", "wachsen");

        System.out.println("to clean -> " + trainer.get("to clean"));
        System.out.println("to expand -> " + trainer.get("to expand"));
    }
}