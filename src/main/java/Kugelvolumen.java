import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Kugelvolumen {
    public static void main(String[]args){
        System.out.println(berechneKugelvolumen(3));
    }

    public static double berechneKugelvolumen(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius darf nicht negativ sein.");
        }

        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

