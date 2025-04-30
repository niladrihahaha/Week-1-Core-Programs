package JavaLvl2Methods;

public class RandomNumberStatistics {
    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit random numbers:");
        for (int number : randomNumbers) {
            System.out.println(number);
        }

        double[] statistics = findAverageMinMax(randomNumbers);

        System.out.println("\nStatistics:");
        System.out.println("Average: " + statistics[0]);
        System.out.println("Minimum: " + (int)statistics[1]);
        System.out.println("Maximum: " + (int)statistics[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] randomArray = new int[size];

        for (int i = 0; i < size; i++) {
            // Generate a random number between 1000 and 9999
            randomArray[i] = 1000 + (int)(Math.random() * 9000);
        }

        return randomArray;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;

        return new double[]{average, min, max};
    }
}

