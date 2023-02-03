package com.uamcc.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "Egresado")
public class EgresadoEntity {

	 @Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "egresado_id_seq")
	 @SequenceGenerator(name = "egresado_id_seq", sequenceName = "egresado_id_seq")
	 private Integer id;
	 
	 @Column(name="nombre")
	 private String name;
	 
	 @Column(name="edad")
	 private Short age;
	 
	 @Column(name="matricula")
	 private String matricula;
	 
}

