package org.eclipse.jakarta.FirstWebApp.Model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@ToString
@SuperBuilder

//This Should go under the entity Folder/Package
//But Does the job for now

@Entity
/* @Entity(name="roleEntity") */
@Table(name = "Users")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@Column(name = "FirstName")
	private String firstname;
	
	@Column(name = "LastName")
	private String lastname;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Phone")
	private String phone;
	
}
