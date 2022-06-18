package org.pinal.tutoring.propertiesinjection;

import java.util.Properties;

public class CountriesAndLanguages {

    private Properties countryAndLanguage;

    public Properties getCountryAndLanguage() {
        return countryAndLanguage;
    }

    public void setCountryAndLanguage(Properties countryAndLanguage) {
        this.countryAndLanguage = countryAndLanguage;
    }

    @Override
    public String toString() {
        return "CountriesAndLanguages{" +
                "countryAndLanguage=" + countryAndLanguage +
                '}';
    }
}
