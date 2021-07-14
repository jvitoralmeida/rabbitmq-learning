package br.com.jms.producer.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

	private String nome;
	private int idade;
}
