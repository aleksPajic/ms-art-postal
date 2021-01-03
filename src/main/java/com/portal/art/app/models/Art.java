package com.portal.art.app.models;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

public class Art {

    private String id;

    private String name;

    private String artist_username;

    private String description;

    private List<String> techniques;

    private String inspiration;

    private String image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist_username() {
        return artist_username;
    }

    public void setArtist_username(String artist_username) {
        this.artist_username = artist_username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTechniques() {
        return techniques;
    }

    public void setTechniques(List<String> techniques) {
        this.techniques = techniques;
    }

    public String getInspiration() {
        return inspiration;
    }

    public void setInspiration(String inspiration) {
        this.inspiration = inspiration;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
