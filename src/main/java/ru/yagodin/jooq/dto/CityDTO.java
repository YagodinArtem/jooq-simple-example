package ru.yagodin.jooq.dto;

import lombok.Builder;

import java.util.Date;


@Builder
public class CityDTO {

    private Long id;
    private String title;
    private Long country;
    private Date created;

    public CityDTO() {
    }

    public CityDTO(Long id, String title, Long country, Date created) {
        this.id = id;
        this.title = title;
        this.country = country;
        this.created = created;
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

    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "CityDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", country=" + country +
                ", created=" + created +
                '}';
    }
}
