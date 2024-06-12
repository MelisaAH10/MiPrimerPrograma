package CLASE24;

import java.time.LocalDate;

public class JavaTimeI {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
    }
/*
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1990, 1, 1); // Replace with your birthday
        System.out.println("My birthday: " + birthday);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println("The date you entered is: " + date);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (dd-MM-yyyy): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input, formatter);
        System.out.println("The date you entered is: " + date);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (dd-MM-yyyy): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input, formatter);
        date = date.plusDays(15).plusMonths(2).plusYears(3);
        System.out.println("The new date is: " + date);
        System.out.println("The day of the week is: " + date.getDayOfWeek());
    }
    //EJERCICIO06
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (dd-MM-yyyy): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input, formatter);
        date = date.minusDays(13).minusMonths(10).minusYears(1);
        System.out.println("The new date is: " + date);
        System.out.println("The day of the week is: " + date.getDayOfWeek());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (dd-MM-yyyy): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input, formatter);
        if (date.isLeapYear()) {
            System.out.println("The year " + date.getYear() + " is a leap year.");
        } else {
            System.out.println("The year " + date.getYear() + " is not a leap year.");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        LocalDate targetDate = LocalDate.of(1900 + random.nextInt(200), 1 + random.nextInt(12), 1 + random.nextInt(28));
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate guessDate = null;
        do {
            System.out.print("Guess the date (dd-MM-yyyy): ");
            String input = scanner.nextLine();
            guessDate = LocalDate.parse(input, formatter);
            if (guessDate.isBefore(targetDate)) {
                System.out.println("The target date is after " + input);
            } else if (guessDate.isAfter(targetDate)) {
                System.out.println("The target date is before " + input);
            }
        } while (!guessDate.equals(targetDate));
        System.out.println("Congratulations! You guessed the date.");
    }

    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        int secondsPassed = currentTime.toSecondOfDay();
        System.out.println("Seconds passed since the start of the day: " + secondsPassed);
    }

    public static void main(String[] args) {
        LocalTime specificTime = LocalTime.of(20, 0); // 8 PM
        LocalTime midnight = LocalTime.MIDNIGHT;
        long hoursLeft = ChronoUnit.HOURS.between(specificTime, midnight);
        long minutesLeft = ChronoUnit.MINUTES.between(specificTime.plusHours(hoursLeft), midnight);
        long secondsLeft = ChronoUnit.SECONDS.between(specificTime.plusHours(hoursLeft).plusMinutes(minutesLeft), midnight);
        System.out.println("Time left until midnight: " + hoursLeft + " hours, " + minutesLeft + " minutes, " + secondsLeft + " seconds");
    }

    //EJERCICIO11
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time (HH:mm:ss): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse(input, formatter);
        LocalTime nextTime = time.plusSeconds(1);
        System.out.println("The next exact time is: " + nextTime);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        int seconds = scanner.nextInt();
        LocalTime time = LocalTime.ofSecondOfDay(seconds);
        System.out.println("The time is: " + time);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first time (HH:mm:ss): ");
        String input1 = scanner.nextLine();
        System.out.print("Enter second time (HH:mm:ss): ");
        String input2 = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time1 = LocalTime.parse(input1, formatter);
        LocalTime time2 = LocalTime.parse(input2, formatter);
        long difference = ChronoUnit.SECONDS.between(time1, time2);
        System.out.println("The difference in seconds is: " + Math.abs(difference));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time (HH:mm:ss): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse(input, formatter);
        LocalTime midnight = LocalTime.MIDNIGHT;
        long secondsToMidnight = ChronoUnit.SECONDS.between(time, midnight);
        LocalTime halfTime = time.plusSeconds(secondsToMidnight / 2);
        System.out.println("The half time is: " + halfTime);
    }

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime tokyoTime = convertToTokyoTime(localDateTime);
        System.out.println("Tokyo time: " + tokyoTime);
    }

    public static ZonedDateTime convertToTokyoTime(LocalDateTime localDateTime) {
        return localDateTime.atZone(ZoneId.of("Asia/Tokyo"));
    }

    //EJERCICIO16
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date and time (dd-MM-yyyy HH:mm:ss): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(input, formatter);
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of(zoneId));
            System.out.println(zoneId + ": " + zonedDateTime);
        }
    }

    //EJERCICIO17
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth (dd-MM-yyyy): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(input, formatter);
        int age = calculateAge(birthDate);
        System.out.println("Your age is: " + age + " years");
    }

    public static int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    //EJERCICIO18
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first date (dd-MM-yyyy): ");
        String input1 = scanner.nextLine();
        System.out.print("Enter second date (dd-MM-yyyy): ");
        String input2 = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(input1, formatter);
        LocalDate date2 = LocalDate.parse(input2, formatter);
        long years = ChronoUnit.YEARS.between(date1, date2);
        long months = ChronoUnit.MONTHS.between(date1.plusYears(years), date2);
        long days = ChronoUnit.DAYS.between(date1.plusYears(years).plusMonths(months), date2);
        System.out.println("The difference is: " + Math.abs(years) + " years, " + Math.abs(months) + " months, " + Math.abs(days) + " days");
    }
 */
}
