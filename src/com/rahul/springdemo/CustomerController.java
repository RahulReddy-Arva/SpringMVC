package com.rahul.springdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Customer")
public class CustomerController{
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor =  new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer , BindingResult theBindingResult) {
		
		if( theBindingResult.hasErrors())
			return "customer-form";
		else {
			System.out.println("THe customer lastname is : | " + theCustomer.getLastName() + " | " + theCustomer.getFreePasses() + " | " 
							+ theCustomer.getPostalCode() + " | " + theCustomer.getCourseCode());
			
			System.out.println("\n\n Binding Result:  " +  theBindingResult + "\n\n ");
			return "customer-confirmation";
		}
	}
	 
}