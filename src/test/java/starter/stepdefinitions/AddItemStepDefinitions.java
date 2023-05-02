package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;

public class AddItemStepDefinitions {
	
	@Given("{actor} is loiiking at his TODO list")
	public void rama_is_loiiking_at_his_todo_list(Actor actor) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("{actor} adds {string} to the list")
	public void he_adds_to_the_list(Actor actor, String itemName) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{actor} sees {string} as an item in the TODO list")
	public void he_sees_as_an_item_in_the_todo_list(Actor actor, String expectedItemName) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
