package common;
import static com.jayway.restassured.RestAssured.given;
import com.jayway.restassured.response.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CommonTestMethods 
{
	private Response response = null;
	public <T extends Object> Object parseFromJson(Class<T> beanClass, String response) 
	{
		Object responseObject = null;
		Gson gson = new GsonBuilder().setDateFormat("dd.MM.yyyy HH:mm:ss:SSS").create();
		responseObject = gson.fromJson(response, beanClass);
		return responseObject;
	}
	public String makJSONFromData(Object beanClass) 
	{
		String jsonStr = null;
		Gson gson = new GsonBuilder().setDateFormat("dd.MM.yyyy HH:mm:ss:SSS").create();
		jsonStr = gson.toJson(beanClass);
		System.out.println(jsonStr);
		return jsonStr;
	}
	public Response executeGetService(String URL) {
		response = given().header("Content-Type", "application/json").when().get(URL);
		return response;
	}

	public Response executePostService(String jsonReqData, String URL) {
		response = given().header("Content-Type", "application/json").header("Accept-Language", "en-US").body(jsonReqData).when().post(URL);
			if (response.statusCode() != 200 || response.statusCode() != 202) {
				System.out.println(response.asString());
			} else {
				System.out.println("Request failed: HTTP( status Code = {} -- " + response.statusCode());
			}
			return response;
	}

	public <T extends Object> Object handleResponse(Response respData, Class<T> beanClass) {
		if (respData.asString() == null || respData.asString().equals("")) {
			return null;
		} else {
			return respData.as(beanClass);
		}
	}
}