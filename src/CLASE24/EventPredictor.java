package CLASE24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventPredictor {

    public static LocalDate[] predictNextEvents(LocalDate lastEventDate, int cycleYears, int occurrences) {
        List<LocalDate> nextEvents = new ArrayList<>();
        for (int i = 1; i <= occurrences; i++) {
            nextEvents.add(lastEventDate.plusYears(cycleYears * i));
        }
        return nextEvents.toArray(new LocalDate[0]);
    }

    public static LocalDate[] predictCicadas() {
        LocalDate lastEventDate = LocalDate.of(2021, 6, 1); // Brote de cigarras en 2021
        int cycleYears = 17;
        int occurrences = 5; // Calculamos los próximos 5 brotes
        return predictNextEvents(lastEventDate, cycleYears, occurrences);
    }

    public static LocalDate[] predictHalleyComet() {
        LocalDate lastEventDate = LocalDate.of(1986, 1, 1); // Último avistamiento del Cometa Halley en 1986
        int cycleYears = 76;
        int occurrences = 5; // Calculamos los próximos 5 avistamientos
        return predictNextEvents(lastEventDate, cycleYears, occurrences);
    }

    public static LocalDate[] predictVenusTransit() {
        LocalDate[] venusTransitDates = new LocalDate[10];
        LocalDate lastTransitDate = LocalDate.of(2012, 6, 5); // Último tránsito de Venus en 2012
        int[] cycles = { 105, 8, 121, 8, 105, 8, 121 }; // Patrones de los tránsitos de Venus

        venusTransitDates[0] = lastTransitDate.plusYears(105);
        venusTransitDates[1] = venusTransitDates[0].plusYears(8);
        venusTransitDates[2] = venusTransitDates[1].plusYears(121);
        venusTransitDates[3] = venusTransitDates[2].plusYears(8);
        venusTransitDates[4] = venusTransitDates[3].plusYears(105);
        venusTransitDates[5] = venusTransitDates[4].plusYears(8);
        venusTransitDates[6] = venusTransitDates[5].plusYears(121);
        venusTransitDates[7] = venusTransitDates[6].plusYears(8);
        venusTransitDates[8] = venusTransitDates[7].plusYears(105);
        venusTransitDates[9] = venusTransitDates[8].plusYears(8);

        return venusTransitDates;
    }

    public static void main(String[] args) {
        // Predicción de cigarras
        LocalDate[] cicadaEvents = predictCicadas();
        System.out.println("Próximos eventos de Invasión de Cigarras:");
        for (LocalDate date : cicadaEvents) {
            System.out.println(date);
        }

        // Predicción del Cometa Halley
        LocalDate[] halleyEvents = predictHalleyComet();
        System.out.println("\nPróximos avistamientos del Cometa Halley:");
        for (LocalDate date : halleyEvents) {
            System.out.println(date);
        }

        // Predicción del Tránsito de Venus
        LocalDate[] venusTransits = predictVenusTransit();
        System.out.println("\nPróximos tránsitos de Venus:");
        for (LocalDate date : venusTransits) {
            System.out.println(date);
        }
    }
}

