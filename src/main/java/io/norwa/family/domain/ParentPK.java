package io.norwa.family.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class ParentPK implements Serializable {
    private String firstName;
    private String lastName;
}
