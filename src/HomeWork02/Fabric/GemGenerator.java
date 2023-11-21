package HomeWork02.Fabric;

import HomeWork02.Interface.IGameItem;
import HomeWork02.Product.Gem;

public class GemGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
