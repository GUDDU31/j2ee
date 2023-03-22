
package com.jspiders.hibernatemanytomany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
@Entity
@Data
public class ProductDTO {
	@Id
private int id;
private String name;
private String category;
private double price;

@ManyToMany(mappedBy="products")
List<CustomerDTO> customers;
}
