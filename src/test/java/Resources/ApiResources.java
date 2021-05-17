package Resources;

public enum ApiResources {
	
	
	AddPlaceApi("/maps/api/place/add/json"),
	getPlaceApi("/maps/api/place/get/json"),
	DeletePlaceApi("/maps/api/place/delete/json");		
	
	private String resource;
	
	ApiResources(String resource)
	{
		this.resource=resource;
	}
 
	public String getResource()
	{
		return resource;
	}
}
