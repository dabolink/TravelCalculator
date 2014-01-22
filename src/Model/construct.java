package Model;
import java.io.*;

public class construct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getLocations();
		getCheese();

	}
	private static void getLocations(){
		BufferedReader buffer = null;
		int id = 0;
		Region region = null;
		try{
			String sCurrentLine;
			try{
				buffer = new BufferedReader (new FileReader("src/Model/Locations.txt"));
			}catch(FileNotFoundException exc){
				exc.printStackTrace();
			}
			while((sCurrentLine = buffer.readLine()) != null){
				if(!sCurrentLine.startsWith("\t")){

					if(region!=null){
						System.out.println(region.toString());
					}
					region = new Region(sCurrentLine, null, 0);
					
				}else{
					Location location = new Location(sCurrentLine.substring(1, sCurrentLine.length()), null, id++);
					region.addLocation(location);
				}
				
			}
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{
			try {
				if(buffer != null){
					buffer.close();
				}
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
	private static void getCheese(){
		BufferedReader buffer = null;
		Cheese cheese = null;
		try{
			String sCurrentLine;
			try{
				buffer = new BufferedReader (new FileReader("src/Model/Cheese.txt"));
			}catch(FileNotFoundException exc){
				exc.printStackTrace();
			}
			while((sCurrentLine = buffer.readLine())!=null){
				cheese = new Cheese(sCurrentLine);
				//System.out.println(cheese.toString());
			}
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{
			try{
				if(buffer != null){
					buffer.close();
				}
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
}
