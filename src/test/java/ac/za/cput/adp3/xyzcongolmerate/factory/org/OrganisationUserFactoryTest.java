package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildOrganisationUser() {

        User cmp = UserFactory.buildUser("216155231@mycput.ac.za", "Clayton", "Petersen");
        Organisation otbc = OrganisationFactory.buildOrganisation("OTBC");
        OrganisationUser staff = OrganisationUserFactory.buildOrganisationUser(otbc.getOrgCode(), cmp.getUserEmail());

        Assert.assertNotNull(staff);

    }
}