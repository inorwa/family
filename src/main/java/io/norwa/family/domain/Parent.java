package io.norwa.family.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parent {

    @EmbeddedId
    private ParentPK parentPK;

    private String description;

    @OneToMany
    private List<Child> childs;

}
