package fr.ubo.steam.Service;
import fr.ubo.steam.DAO.ImageRevolverDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
public class ImageRevolverController {
    ImageRevolverDaoImpl imageRevolverDaoImpl;

    @GetMapping("/imgs")
    public Map<String, byte[]> getloadImagesMain() throws IOException {
        return imageRevolverDaoImpl.loadImagesMain();

    }
    @GetMapping("/test")
    public String test() throws IOException {
        return "test successful";

    }
}
