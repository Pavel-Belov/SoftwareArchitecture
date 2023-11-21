package HomeWork02;

import HomeWork02.Fabric.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    private static final int rewardsNumber = 10;
    private static final int maxChance = 10;

    public static void main(String[] args) throws Exception {
        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(new GoldGenerator());
        generators.add(new GemGenerator());
        generators.add(new SilverGenerator());
        generators.add(new BronzeGenerator());
        generators.add(new ExpGenerator());
        generators.add(new ManaGenerator());
        generators.add(new SpeedGenerator());

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < rewardsNumber; i++) {
            int chance = random.nextInt(1, maxChance + 1);
            if (chance == 1) {
                generators.get(1).openReward();
            } else if (chance == 3) {
                generators.get(0).openReward();
            } else {
                int index = random.nextInt(2, generators.size());
                generators.get(index).openReward();
            }
        }
    }
}
