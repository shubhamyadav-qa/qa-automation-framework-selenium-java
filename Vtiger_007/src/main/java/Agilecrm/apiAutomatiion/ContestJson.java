package Agilecrm.apiAutomatiion;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ContestJson {

	public static void main(String[] args) {
	System.out.println("hi");
	Response  resp =RestAssured.given()
	.auth().basic("yadavshubham@eva.com", "Shubham@1234").accept("application/json")
	.get("https://yadavshubham4567.agilecrm.com/dev/api/contacts");
	String respJson =resp.getBody().asPrettyString();
	System.out.println(respJson);
	
	JSONArray   jsonRoot =new JSONArray(respJson);
	JSONObject  jsobj =jsonRoot.getJSONObject(0);
	Number id=jsobj.getNumber("id");
	System.out.println(id);

	   
	
	
	}

}
