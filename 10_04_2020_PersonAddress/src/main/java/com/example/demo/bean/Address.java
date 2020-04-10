package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Address {
	private int streetNumber=51;
	private String streetName="Rdr-kash";
	private String city="rudrapur";
	private String country="INDIA";

}
