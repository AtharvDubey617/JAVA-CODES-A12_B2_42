class Time {
    int hours, minutes, seconds, milliseconds;

    Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    Time(int hours, int minutes, int seconds, int milliseconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.milliseconds = milliseconds;
    }

    Time add(Time a) {
        int totalMilliseconds = this.milliseconds + a.milliseconds;
        int totalSeconds = this.seconds + a.seconds;
        int totalMinutes = this.minutes + a.minutes;
        int totalHours = this.hours + a.hours;

        if (totalMilliseconds >= 1000) {
            totalSeconds += totalMilliseconds / 1000;
            totalMilliseconds %= 1000;
        }
        if (totalSeconds >= 60) {
            totalMinutes += totalSeconds / 60;
            totalSeconds %= 60;
        }
        if (totalMinutes >= 60) {
            totalHours += totalMinutes / 60;
            totalMinutes %= 60;
        }

        return new Time(totalHours, totalMinutes, totalSeconds, totalMilliseconds);
    }

    Time subtract(Time a) {
        int totalMilliseconds = this.milliseconds - a.milliseconds;
        int totalSeconds = this.seconds - a.seconds;
        int totalMinutes = this.minutes - a.minutes;
        int totalHours = this.hours - a.hours;

        if (totalMilliseconds < 0) {
            totalMilliseconds += 1000;
            totalSeconds--;
        }
        if (totalSeconds < 0) {
            totalSeconds += 60;
            totalMinutes--;
        }
        if (totalMinutes < 0) {
            totalMinutes += 60;
            totalHours--;
        }

        return new Time(totalHours, totalMinutes, totalSeconds, totalMilliseconds);
    }

    long convertToMilliseconds() {
        long total = 0;
        total += hours * 60 * 60 * 1000;
        total += minutes * 60 * 1000;
        total += seconds * 1000;
        total += milliseconds;
        return total;
    }

    Time convertFromMilliseconds(long totalMilliseconds) {
        int hours = (int)(totalMilliseconds / (60 * 60 * 1000));
        totalMilliseconds %= (60 * 60 * 1000);
        int minutes = (int)(totalMilliseconds / (60 * 1000));
        totalMilliseconds %= (60 * 1000);
        int seconds = (int)(totalMilliseconds / 1000);
        int milliseconds = (int)(totalMilliseconds % 1000);
        return new Time(hours, minutes, seconds, milliseconds);
    }

    int compare(Time a) {
        if (this.hours != a.hours)
            return this.hours > a.hours ? 1 : -1;
        if (this.minutes != a.minutes)
            return this.minutes > a.minutes ? 1 : -1;
        if (this.seconds != a.seconds)
            return this.seconds > a.seconds ? 1 : -1;
        if (this.milliseconds != a.milliseconds)
            return this.milliseconds > a.milliseconds ? 1 : -1;
        return 0;
    }

    void display() {
        System.out.print(hours + ":" + minutes + ":" + seconds + ":" + milliseconds);
    }

    public static void main(String[] args) {
        Time a1 = new Time(1, 40, 30, 500);
        Time a2 = new Time(2, 25, 40, 750);
        Time a3 = new Time(5, 10, 20, 200);
        Time a4 = new Time(2, 45, 30, 500);
        Time sum = a1.add(a2);
        System.out.print("Sum is:");
        sum.display();
        Time diff = a3.add(a4);
        System.out.print("\nDifference is: ");
        diff.display();
        long total = a1.convertToMilliseconds();
        System.out.print("\nTotal milliseconds = " + total);
        Time convertedBack = a1.convertFromMilliseconds(total);
        System.out.print("\nConverted back to time:");
        convertedBack.display();
        int result = a1.compare(a2);
        if(result == 0)
            System.out.print("\nBoth times are equal");
        else if(result > 0)
            System.out.print("\n1st is greater than 2nd");
        else
            System.out.print("\n1st is smaller than 2nd");
    }
}