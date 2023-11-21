package HomeWork01.ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PolygonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(
            int id,
            List<PolygonalModel> models,
            List<Flash> flashes,
            List<Camera> cameras
    ) throws Exception {
        this.id = id;

        if (models.size() > 0) {
            this.models = models;
        } else {
            throw new Exception("Need more than one model");
        }

        this.flashes = flashes;

        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Need more than one camera");
        }
    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }
}
