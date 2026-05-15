package Klasurvorbereitung.Schreibgeschäft;

import java.util.function.Function;

public interface Rabattaktion extends Function<Warenkorb,Integer> {
    public Integer apply(Warenkorb wk);
}
