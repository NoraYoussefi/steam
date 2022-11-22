package fr.ubo.steam.DAO;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ImageRevolverDao implements ImageRevolverDaoImpl{
    @Override
    public Map<String, byte[]> loadImagesMain() throws IOException {
        Map< String,byte[]> map = new HashMap<>();

        for (int i = 0; i <= 3; i++) {
            map.put("main" +i, ("src/img/main/main" + i + ".png").getBytes());
        }
        return map;
    }

    @Override
    public Map<String, byte[]> loadImagesPromo() {
        return null;
    }
}
