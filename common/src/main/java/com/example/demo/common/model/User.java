package com.example.demo.common.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

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

  @Transient
  private Date retrieveDate;
//  @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST}, orphanRemoval = true)
//  private Set<Order> orders = new HashSet<>();

}