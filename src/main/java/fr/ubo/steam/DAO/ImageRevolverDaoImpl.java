package fr.ubo.steam.DAO;

import java.io.IOException;
import java.util.Map;

public interface ImageRevolverDaoImpl{
    public Map<String,byte[]> loadImagesMain() throws IOException;
    public Map<String,byte[]> loadImagesPromo();

}
