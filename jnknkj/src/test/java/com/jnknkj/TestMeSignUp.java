package com.jnknkj;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMeSignUp {

	@Given("User is on testme signup page")
	public void user_is_on_testme_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter all required mandatory fields")
	public void user_enter_all_required_mandatory_fields(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<String> field= dataTable.asList();
	    System.out.println(field.size());
	    
	    for(String data : field ) {
	    	System.out.println(data);
	    	
	    }
	    	
	}

	@Then("User is signed up successfully")
	public void user_is_signed_up_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
