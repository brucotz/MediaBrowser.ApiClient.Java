package mediabrowser.model.entities;

/** 
 Used to hold information about a user's list of configured virtual folders
*/
public class VirtualFolderInfo
{
	/** 
	 Gets or sets the name.
	 
	 <value>The name.</value>
	*/
	private String Name;
	public final String getName()
	{
		return Name;
	}
	public final void setName(String value)
	{
		Name = value;
	}

	/** 
	 Gets or sets the locations.
	 
	 <value>The locations.</value>
	*/
	private java.util.ArrayList<String> Locations;
	public final java.util.ArrayList<String> getLocations()
	{
		return Locations;
	}
	public final void setLocations(java.util.ArrayList<String> value)
	{
		Locations = value;
	}

	/** 
	 Gets or sets the type of the collection.
	 
	 <value>The type of the collection.</value>
	*/
	private String CollectionType;
	public final String getCollectionType()
	{
		return CollectionType;
	}
	public final void setCollectionType(String value)
	{
		CollectionType = value;
	}

	/** 
	 Initializes a new instance of the <see cref="VirtualFolderInfo"/> class.
	*/
	public VirtualFolderInfo()
	{
		setLocations(new java.util.ArrayList<String>());
	}
}