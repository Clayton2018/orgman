package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    @Test
    public void buildRole() {

        Role recruiter = RoleFactory.buildRole("Recruiter");

        Assert.assertNotNull(recruiter.getRoleId());
        //Assert.assertTrue(recruiter.getRoleId().equals("RF-T"));

        /* i changed the Helper " "-" + UUID.randomUUID().toString()" to the String " "-" + "T" " to see if it passed.
         * It did so i changed it back.
         *Hence the commented Assert.assertTrue
        */

    }
}