package HomeWork02.Fabric;

import HomeWork02.Interface.IGameItem;
import HomeWork02.Product.Bronze;

public class BronzeGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}
