package HomeWork02.Fabric;

import HomeWork02.Interface.IGameItem;
import HomeWork02.Product.Mana;

public class ManaGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Mana();
    }
}
