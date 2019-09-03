package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {

        Race african = RaceFactory.buildRace("African");
        Race european = RaceFactory.buildRace("European");

        Assert.assertFalse(african.getRaceId().equals(european.getRaceId()));
        Assert.assertNotNull(african.getRaceId());
    }
}