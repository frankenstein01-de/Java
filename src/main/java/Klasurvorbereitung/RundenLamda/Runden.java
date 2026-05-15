package Klasurvorbereitung.RundenLamda;

import java.util.function.Function;

public interface Runden extends Function<Double, Integer> {
    Runden r =(d)->(int) Math.round(d);
}