

import fr.ubo.steam.DAO.ImageRevolverDao;
import fr.ubo.steam.DAO.ImageRevolverDaoImpl;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class testImageRevolver {
   static ImageRevolverDaoImpl imageRevolverDao;

   @BeforeClass
   public static void setTest() {
       imageRevolverDao = new ImageRevolverDao();
   }

    @Test
    public void testAssertMap() throws IOException {
       Map<String, byte[]> map = imageRevolverDao.loadImagesMain();


        Map< String,byte[]> map2 = new HashMap<>();

        for (int i = 1; i <= 3; i++) {
            map2.put("main" +i, ("test/img/revolver/main/main" + i + ".png").getBytes());
        }



       assertEquals(map2,map2);

    }


}
