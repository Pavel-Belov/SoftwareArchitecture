package HomeWork02.Fabric;

import HomeWork02.Interface.IGameItem;
import HomeWork02.Product.Speed;

public class SpeedGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Speed();
    }
}
