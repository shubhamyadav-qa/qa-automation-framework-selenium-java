package API_testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONObject;

public class Json_Read {

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("C:\\Users\\yadav\\OneDrive\\Desktop\\api.json");
		byte[] byteArr	=Files.readAllBytes(path);
		String strobj = new String (byteArr);


		JSONObject rootJson = new JSONObject(strobj);
		String typeJson=rootJson.getString("type");
		Number num=rootJson.getNumber("updated_time");

		System.out.println(typeJson);
		System.out.println(num);
		System.out.println("");
		
	}

}
