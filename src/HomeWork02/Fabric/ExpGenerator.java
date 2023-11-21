package HomeWork02.Fabric;

import HomeWork02.Interface.IGameItem;
import HomeWork02.Product.Exp;

public class ExpGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Exp();
    }
}
