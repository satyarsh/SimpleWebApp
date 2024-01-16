package org.eclipse.jakarta.FirstWebApp.Model;

import java.io.Serializable;

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

public class DatabaseModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String User;
	private String Password;

}
