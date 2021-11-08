package ru.yagodin.jooq.dto;


import lombok.Data;
import ru.yagodin.jooq.generated.tables.City;

import java.util.Date;
import java.util.List;

@Data
public class CountryDTO {

    private Long id;
    private String title;
    private Date created;

    private List<CityDTO> cities;

    public CountryDTO() {
    }

    public CountryDTO(Long id, String title, Date created, List<CityDTO> cities) {
        this.id = id;
        this.title = title;
        this.created = created;
        this.cities = cities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<CityDTO> getCities() {
        return cities;
    }

    public void setCities(List<CityDTO> cities) {
        this.cities = cities;
    }
}
