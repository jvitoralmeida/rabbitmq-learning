package br.com.jms.consumer.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class User implements Serializable {

  private String nome;
  private int idade;
}
