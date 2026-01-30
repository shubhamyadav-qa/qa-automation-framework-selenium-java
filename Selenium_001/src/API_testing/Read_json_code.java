package API_testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class Read_json_code {

	public static void main(String[] args) throws IOException {
		//simple common step to read json code 
		Path path =Paths.get("C:\\Users\\yadav\\OneDrive\\Desktop\\test.json");
		byte[] byteArr=Files.readAllBytes(path);
		String strjson=new String(byteArr);

		// if start with object----------------------------------------------------------- 
		JSONObject rootJson =new JSONObject(strjson);
		String typevalue= rootJson.getString("type ");
		System.out.println(typevalue);

		// if start with array 
		JSONArray rootarray 	=new JSONArray();
		String typevalue1= rootJson.getString("type ");
		System.out.println(typevalue1);

		//if we get id or number  use -------------
		JSONObject rootJson1 =new JSONObject(strjson);
		Number num= rootJson1.getNumber("id");
		System.out.println(num);

		//if  value inside object so we use ------
		JSONObject viewobject =rootJson.getJSONObject("viewed");
		Number viewed_time=viewobject.getNumber("viewed time");
		System.out.println(viewed_time);

		//if value inside	array sowe use--
		JSONArray jsonTagsArray=rootJson.getJSONArray("tags");
		String tags=jsonTagsArray.getString(0);
		System.out.println(tags);

		//if value inside array inside object then value we use---
		JSONArray jsonarray=   rootJson.getJSONArray("tagsWithTime");
		JSONObject jsonObject= jsonarray.getJSONObject(0);
		Number createdtime=jsonObject.getNumber("createdTime");
		System.out.println(createdtime);

		//if count all keys so we use 
		int countkeys= rootJson.length();
		System.out.println(countkeys);
	}
}
