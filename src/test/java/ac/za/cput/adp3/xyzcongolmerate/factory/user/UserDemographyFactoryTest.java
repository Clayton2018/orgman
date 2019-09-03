package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {

        User cmp = UserFactory.buildUser("216155231@mycput.ac.za", "Clayton", "Petersen");

        Gender male = GenderFactory.buildGender("Male");

        Race coloured = RaceFactory.buildRace("Coloured");

        UserDemography udemo = UserDemographyFactory.buildUserDemography(cmp.getUserEmail(), "Mr" , male.getGenderId(), coloured.getRaceId(), new Date("29/06/1996"));

        Assert.assertNotNull(udemo);

    }
}