package ge.edu.btu.tsotne_mazmishvili.corona.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Covid {
    String country;
    Integer confirmed;
    Integer deaths;
    Integer recovered;

    public Covid() {
    }

    public Covid(String country, Integer confirmed, Integer deaths, Integer recovered) {
        this.country = country;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "country" + country +
                ", confirmed='" + confirmed + '\'' +
                ", deaths=" + deaths + '\'' +
                ", recovered=" + recovered +
                '}';
    }
}
