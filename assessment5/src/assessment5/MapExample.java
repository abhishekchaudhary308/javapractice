package assessment5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
	
	
	public static Map<String, Integer> calculateCarCount(String filepath)
	{
		
		
		Map<String, Integer> carsCountMap = new HashMap<String, Integer>();
		
		BufferedReader br = null;
		
		List<String> carList = new ArrayList<String>();
		
		try
		{
			
		br = new BufferedReader(new FileReader(new File(filepath)));
		
		String car = br.readLine();
		
		while(car!=null)
		{
			carList.add(car);
			car = br.readLine();
		}
			
		for(String c:carList)
		{
			carsCountMap.put(c, Collections.frequency(carList, c));	
		}
		
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		return carsCountMap;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
	Map<String, Integer> map = calculateCarCount("D:\\personal\\vehicles.xlsx");	
	
	System.out.println(map);
		
	}

}
