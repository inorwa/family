package io.norwa.family.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
public class Child {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    private String firstName;

    private String lastName;

    @ManyToOne
    @JoinColumns(value = {
            @JoinColumn(name = "parent_first_name", referencedColumnName = "firstName"),
            @JoinColumn(name = "parent_last_name", referencedColumnName = "lastName")
    },foreignKey = @ForeignKey(name = "child_parent_fkey"))
    private Parent parent;

    public Child() {
    }

    public Child(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Child(String firstName, String lastName, Parent parent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.parent = parent;
    }
}
