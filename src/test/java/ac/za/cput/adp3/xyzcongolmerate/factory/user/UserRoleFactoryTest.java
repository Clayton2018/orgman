package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {

        Organisation otbc = OrganisationFactory.buildOrganisation("OTBC");

        Role dev = RoleFactory.buildRole("Dev");

        User cmp = UserFactory.buildUser("216155231@mycput.ac.za", "Clayton", "Petersen");

        UserRole ur = UserRoleFactory.buildUserRole(otbc.getOrgCode(), cmp.getUserEmail(), dev.getRoleId());

        Assert.assertEquals("Dev", dev.getRoleName());
        Assert.assertNotNull(ur);


    }
}