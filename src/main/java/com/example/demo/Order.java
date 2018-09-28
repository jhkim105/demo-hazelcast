package com.example.demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "t_order")
@Getter
@Setter
@NoArgsConstructor
@ToString
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Order implements Serializable {

  private static final long serialVersionUID = 7385403806137238426L;

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @ManyToOne(optional = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  private User user;


}