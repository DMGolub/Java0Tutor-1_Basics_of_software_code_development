package by.training.dmgolub.linearprogram;

/*
    Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
    Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
    HHч MMмин SSс.
 */
public class Task5 {

    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;

    /**
     * Converts the given number of second into a period of hours, minutes and seconds.
     * Prints the number of hours, minutes, seconds. Format: HHч MMмин SSс.
     * @param seconds integer positive number of seconds.
     * @throws IllegalArgumentException if the number of seconds is negative.
     */
    public static void convertSecondsIntoTimePassed(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Number of seconds can not be negative!");
        }
        int hoursPassed = seconds / (SECONDS_PER_HOUR);
        int minutesPassed = (seconds % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE;
        int secondsPassed = seconds % SECONDS_PER_MINUTE;
        StringBuilder result = new StringBuilder();
        result.append(hoursPassed > 9 ? hoursPassed : "0" + hoursPassed)
                .append("ч ")
                .append(minutesPassed > 9 ? minutesPassed : "0" + minutesPassed)
                .append("мин ")
                .append(secondsPassed > 9 ? secondsPassed : "0" + secondsPassed)
                .append("с");
        System.out.print(result.toString());
    }
}