public class getAverage {
    public static double getAverage(double[] numbers) {
        if (numbers.length < 3) {
            return 0.0;
        }
        else {
            double sum = numbers[0] + numbers[numbers.length / 2] + numbers[numbers.length - 1];
            double average = sum / 3;
            average = average * 10;
            // I'm going to try to do my calculations one step at a time to make things easier to read and understand
            // when I look back at it. Hopefully it's okay to do.
            average = average + 0.5;
            average = (int) average;
            average = average /  10;
            // This feels inefficient...
            return average;
        }
    }
}
