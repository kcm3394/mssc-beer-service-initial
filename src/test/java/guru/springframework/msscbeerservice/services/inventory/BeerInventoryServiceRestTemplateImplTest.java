package guru.springframework.msscbeerservice.services.inventory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled //for manual testing only
@SpringBootTest
public class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @Test
    void getOnHandInventory() {

        //todo evolve to use UPC
        //Integer qoh = beerInventoryService.getOnHandInventory(BeerLoader.BEER_1_UUID);

        //System.out.println(qoh);
    }
}
