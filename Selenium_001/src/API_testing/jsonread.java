package API_testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONArray;  
import org.json.JSONObject;


public class jsonread {


	public static void main(String[] args) throws IOException {

		Path path =Paths.get("C:\\Users\\yadav\\OneDrive\\Desktop\\api.json");
        byte[] bytearray=Files.readAllBytes(path);
        String  stringobj = new String (bytearray);
        
        JSONObject rootJson =  new JSONObject (stringobj);
       Number  num=rootJson.getNumber("id");
       String str=rootJson.getString("type");
       System.out.println(str);
        System.out.println(num);
        
        JSONObject viewobj=rootJson.getJSONObject("viewed");
        Number strviewd=viewobj.getNumber("viewed_time");
        System.out.println(strviewd);
        
        JSONArray tagsarray=rootJson.getJSONArray("tags");
        System.out.println(tagsarray);
        
        
        JSONArray arrobj=rootJson.getJSONArray("tagsWithTime");
        System.out.println(arrobj);
        
      JSONObject arrtags=  arrobj.getJSONObject(0);
      String tagstring=arrtags.getString("tag");
      Number createdNum=arrtags.getNumber("createdTime");
      System.out.println(tagstring);
      System.out.println(createdNum);
      
      
     JSONArray arrayproper= rootJson.getJSONArray("properties");
     JSONObject typeobj=arrayproper.getJSONObject(0);
     String strvalue=typeobj.getString("value");
     
     System.out.println(strvalue);
     
     
     
     
	}
}
