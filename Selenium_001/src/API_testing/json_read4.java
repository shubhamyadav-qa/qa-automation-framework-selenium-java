package API_testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class json_read4 {
public static void main(String[] args) throws IOException {
	Path  path = Paths.get("C:\\Users\\yadav\\OneDrive\\Desktop\\api.json");
	byte[] byteArr=Files.readAllBytes(path);
	String strobj =new String(byteArr);
	
	
	
	JSONObject rootJson = new JSONObject(strobj);
	JSONArray campVal=rootJson.getJSONArray("campaignStatus");
	System.out.println(campVal);
	
}

}
