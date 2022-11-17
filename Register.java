package com.cg.asiacup.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import org.springframework.format.number.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="players")
public class Register 
{
    @Id
	@GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="registerId")
	private long registerId;
    
    @Column(name="name")
	private String name;
    
    @Column(name="age")
	private Integer age;
    
    @Column(name="height")
	private float height;
    
    @Column(name="runRate")
	private float runRate;
    
    @Column(name="email")
	private char email;
    
    @Column(name="username")
	private char username;
    
    @Column(name="password")
	private char password;
	
}
