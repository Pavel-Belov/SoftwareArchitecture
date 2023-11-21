package HomeWork02.Fabric;

import HomeWork02.Interface.IGameItem;

public abstract class ItemGenerator {
    public abstract IGameItem createItem();
    public void openReward() {
        createItem().open();
    }
}
