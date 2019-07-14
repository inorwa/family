package io.norwa.family.domain;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@Entity
public class Parent {

    @EmbeddedId
    private ParentPK parentPK;

    private String description;

}
