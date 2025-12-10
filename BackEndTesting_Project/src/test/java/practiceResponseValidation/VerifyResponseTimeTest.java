package practiceResponseValidation;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class VerifyResponseTimeTest {

	@Test
	public void verifyResponseTime() {
		Response res=given().get("http://49.249.28.218:8091/projects");
		
		res.then().log().all();
		
		long timetaken=res.time();
		long timeinsec=res.timeIn(TimeUnit.SECONDS);
		System.out.println(timetaken);
		System.out.println(timeinsec);
		
		res.then().assertThat().time(Matchers.lessThan(900L));
		res.then().assertThat().time(Matchers.greaterThan(300L));
		
		res.then().assertThat().time(Matchers.both((Matchers.lessThan(900L)))
				.and((Matchers.greaterThan(300L))));
		
		
	}
}
