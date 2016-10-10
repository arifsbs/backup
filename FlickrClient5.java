package com.dropwizard.client;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class FlickrClient5 {

	public static void main(String[] args) {
		
		try
		{
			
		Client client = Client.create();

		WebResource webResource = client
			.resource("https://api.flickr.com/services/feeds/photos_public.gne?format=json&tags=java");

		ClientResponse response = webResource.accept("application/json")
                   .get(ClientResponse.class);

		if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
		}

		String output = response.getEntity(String.class);

		/*System.out.println("Output from Server .... \n");
		System.out.println(output.replace("jsonFlickrFeed({", "{"));
		System.out.println(output.replace("})", "}"));*/
		
		//System.out.println(output.replace("jsonFlickrFeed({", "{").replace("})", "}"));
		
		String reformedJson = output.replace("jsonFlickrFeed({", "{").replace("})", "}");
		
		Gson gson = new Gson();
		ImageContainer imageContainer = gson.fromJson( reformedJson, ImageContainer.class );
		
		System.out.println(reformedJson);
		System.out.println("done......."+imageContainer.getItems().get(0).getTags());
		System.out.println("done......."+imageContainer.getLink());
		
		//System.out.println(output);
		
	  } catch (Exception e) {

		e.printStackTrace();

	  }
	}
}
