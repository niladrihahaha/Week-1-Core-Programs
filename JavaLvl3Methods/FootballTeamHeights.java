package JavaLvl3Methods;

import java.util.Random;

public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11, 150, 250);
        System.out.println("Player heights: " + arrayToString(heights));
        System.out.println("Shortest height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest height: " + findTallestHeight(heights) + " cm");
        System.out.println("Mean height: " + calculateMeanHeight(heights) + " cm");
    }

    public static int[] generateRandomHeights(int count, int min, int max) {
        Random random = new Random();
        int[] heights = new int[count];
        for (int i = 0; i < count; i++) {
            heights[i] = random.nextInt(max - min + 1) + min;
        }
        return heights;
    }

    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static double calculateMeanHeight(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return (double) sum / heights.length;
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

