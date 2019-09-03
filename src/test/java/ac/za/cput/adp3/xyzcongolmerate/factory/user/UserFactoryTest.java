package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void buildUser() {

        User cmp = UserFactory.buildUser("216155231@mycput.ac.za", "Clayton", "Petersen");

        Assert.assertNotNull(cmp);
        Assert.assertEquals("Clayton", cmp.getFirstName());

    }
}