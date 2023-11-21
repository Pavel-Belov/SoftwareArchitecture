package HomeWork02;

import HomeWork02.Fabric.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    private static final int rewardsNumber = 10;
    public static void main(String[] args) throws Exception {
        List<ItemGenerator> generators = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            generators.add(new GoldGenerator());
        }

        generators.add(new GemGenerator());

        for (int i = 0; i < 10; i++) {
            generators.add(new SilverGenerator());
            generators.add(new BronzeGenerator());
            generators.add(new ExpGenerator());
            generators.add(new ManaGenerator());
            generators.add(new SpeedGenerator());
        }

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < rewardsNumber; i++) {
            int index = random.nextInt(generators.size());
            generators.get(index).openReward();
        }
    }
}
