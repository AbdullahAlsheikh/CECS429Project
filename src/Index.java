import com.google.gson.*;
public class Index {
	
	public static void main(String []args) {
		Gson gson = new GsonBuilder().create();
		gson.toJson("yolo", System.out);
	}
}
