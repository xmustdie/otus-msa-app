package ru.otus.msa.application.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/**
 * @author Andrei Durkin <a.durkin@goodt.me> at 12.05.2024
 */

@Getter
@Setter
@NoArgsConstructor
public class User extends AbstractBaseEntity {

    private String login;

    private String password;

    private String firstname;

    private String lastname;

    private Gender gender;

    private City city;

    private Set<Interest> interests;

}
