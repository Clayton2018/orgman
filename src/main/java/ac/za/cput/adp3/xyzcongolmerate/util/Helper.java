package ac.za.cput.adp3.xyzcongolmerate.util;

import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;

import java.util.UUID;

public class Helper extends GenderFactory {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {

        String className = getClassName(aClass);
        String result = "";

        for(int i = 0; i < className.length(); i++){

            if(Character.isUpperCase(className.charAt(i))){

                char name = className.charAt(i);
                result +=  name;

            }

        }

        return result;

    }

}
