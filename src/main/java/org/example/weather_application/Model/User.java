package org.example.weather_application.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;


@Getter
@Setter
@Entity(name="ecomm_user")
public class User {
  @Id
  @GeneratedValue(strategy = IDENTITY)
    private int id;
    private String name;
    @Column(name="email_address" , unique = true)
    private String email;
}
