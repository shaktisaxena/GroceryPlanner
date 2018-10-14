package com.de.shakti.groceryplanner.api;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.de.groceryplanner.daoimpl.ProductDaoImpl;
import com.de.groceryplanner.dto.ProductDto;
import com.google.gson.Gson;


@ApplicationPath("/rest")
@Path("/store")
public class GroceryPlannerService  extends javax.ws.rs.core.Application{

	
	
	public GroceryPlannerService() {
		
	}
	
	@Inject
	ProductDaoImpl productDaoImpl;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/products")
	public Response GetAllProducts()
	{
      	
		List<ProductDto> product= productDaoImpl.findAllProducts();
	   
	    if(product == null) {
	        return Response.status(Response.Status.NOT_FOUND).entity("Products not founds: ").build();
	    }
	   
	    String json = new Gson().toJson(product);
	    return Response.ok(json, MediaType.APPLICATION_JSON).build();
	}
	
	/*
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/Product/{id}")
	public Response GetProductById(@PathParam("id") String id)
	
	{
		if(uuid == null || uuid.trim().length() == 0) {
	        return Response.serverError().entity("UUID cannot be blank").build();
	    }
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/Categories")
	public Response GetAllCategories()
	{
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/products/Category/{category}")
	public Response GetProductsByCategory(@PathParam("category") String categoryname)
	{
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/products/Category/{category}")
	public Response GetProductsByCategory(@PathParam("category") String categoryname)
	{
		
	}
	
*/
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/whoami")
	public String whoAmI()
	{
		return "<b>" + "I am running" + "</b>";
		
	}
	
}
