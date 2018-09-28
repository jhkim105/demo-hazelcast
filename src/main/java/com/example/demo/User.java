package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_user")
@ToString(exclude = {"orders"})
@Getter
@Setter
public class User implements Serializable {

  private static final long serialVersionUID = -7755733012666420055L;

  @Id
  @GeneratedValue
  private Long id;

  private String name;

//  @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST}, orphanRemoval = true)
//  private Set<Order> orders = new HashSet<>();

}