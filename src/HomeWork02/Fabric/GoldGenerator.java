package HomeWork02.Fabric;

import HomeWork02.Interface.IGameItem;
import HomeWork02.Product.Gold;

public class GoldGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
