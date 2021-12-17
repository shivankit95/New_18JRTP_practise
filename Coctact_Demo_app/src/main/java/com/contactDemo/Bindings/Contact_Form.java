package com.contactDemo.Bindings;

import java.time.LocalDate;

import lombok.Data;
@Data
public class Contact_Form {
	private Integer contactid;
	private String Contactname;
	private  String contactemail;
	private  long contactnumber;
	private  String switch_sw;
	private  LocalDate createdate;
	private LocalDate updateddate;

}
