package feature.exercise;

import com.mec.exercise.one.Matrix;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Exercise1 {
	Matrix matrix;
	int max;

	@Given("^the following matrix with (\\d) columns for the given type (.*)$")
	public void the_following_matrix_with(final int numColumns,
										  final Character givenType,
										  final List<Character> characters) throws Throwable {
		matrix = new Matrix(characters, givenType, numColumns);
	}

	@When("^finding the largest connected block")
	public void finding_the_largest_connected_block() throws Throwable {
		max = matrix.execute();
	}

	@Then("^the result should be (.*)$")
	public void the_result_should_be(final int output) throws Throwable {
		assertEquals(output, max);
	}
}
