package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.Data;
import pojo.AddObject;

public class TestDataBuild {

	public AddObject addObject(String name, String year, String price, String CPUModel, String DiskSize){
		AddObject p = new AddObject();
		p.setName(name);
		Data d = new Data();
		d.setCPUModel(CPUModel);
		d.setPrice(Float.parseFloat(price));
		d.setYear(Integer.parseInt(year));
		d.setHardDiskSize(DiskSize);
		p.setData(d);
		return p;
	}
	
	public String deletePlacePayload(String placeId)
	{
		return "{\r\n    \"place_id\":\""+placeId+"\"\r\n}";
	}
}
