package co.edureka;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/edureka")
public class EdurekaServices {
	@GET
	@Produces("text/html")
	public String localService() {
		return "<h2>Local Customer Service Center</h2>";
	}

	@GET
	@Path("/nri")
	@Produces("text/html")
	public String nriService() {
		return "<h2>NRI Customer Service Center</h2>";
	}

	@GET
	@Path("{name}/{course}")
	@Produces("text/html")
	public String enquiry(@PathParam("name") String name, @PathParam("course") String course) {
		return "<h2>Customer Name = " + name + "<br>Course Name = " + course + "</h2>";
	}

	@GET
	@Path("/enquiry")
	@Produces("text/html")
	public String enquiry1(@QueryParam("name") String name, @QueryParam("course") String crs) {
		String output = "<h2>Customer Name : " + name + "<br>Course Name : " + crs + "</h2>";
		return output;
	}
	
	@POST
	@Path("/registerCustomer")
	@Produces("text/html")
	public String registration(@FormParam("name") String name, @FormParam("age") String age, @FormParam("addr") String address) {
       	String output = "<div style=font-size:25px;color:blue;font-weight:bold>";
       	output+="Name : "+name+"<br>Age : "+age+"<br>Address : "+address+"</div>";
       	
       	return output;
	}
}
