package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {


    @Test
    public void buildGender() {

        Gender male = GenderFactory.buildGender("Male");
        Gender female = GenderFactory.buildGender("Female");

        Assert.assertFalse(male.getGenderId().equals(female.getGenderId()));
        Assert.assertNotNull(male.getGenderId());

    }
}