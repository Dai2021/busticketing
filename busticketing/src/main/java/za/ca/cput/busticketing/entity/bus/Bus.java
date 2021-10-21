package za.ca.cput.busticketing.entity.bus;

import javax.persistence.*;

/*

Author : Asanda Mabaso - 205049990

 */
@Entity
public class Bus
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String description;

	public Integer getId() { return id; }

	public void setId( Integer id ) { this.id = id; }

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription( String description )
	{
		this.description = description;
	}
}
