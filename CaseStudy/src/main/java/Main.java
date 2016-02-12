import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

public class Main {

	public static void main(String[] args) {
		int numeroriga = 0; 
		try{
			FileReader fr = new FileReader("attivita_comm_media_grande_distrib.csv");
			
			BufferedReader br = new BufferedReader(fr);
			
			String str = null;			
			
			Map<Address, List<Integer>> indirizzi = new HashMap<>();
			br.readLine(); // salto la prima riga di intestazione
			
			while((str = br.readLine()) != null){
				numeroriga++;
				String[] items = str.split(";");
				if(items.length < 19){
					continue;
				}
				
				Address a = new Address();
				
				a.setTipoVia(items[3]);
				a.setIndirizzo(items[4]);
				a.setNumCivico(items[5]);				
				a.setCitta("Milano");
				
				int id = Integer.parseInt(items[0]);
				
				if(indirizzi.containsKey(a)){
					List<Integer> myList = indirizzi.get(a);
					myList.add(id);
				} else {
					List<Integer> ids = new ArrayList<>();
					ids.add(id);					
					indirizzi.put(a, ids);
				}				
				
			}
			
			for(Address s: indirizzi.keySet()) {				
				System.out.println(s);
			}
			
			/*GeoApiContext context = new GeoApiContext().setApiKey(args[0]);
			GeocodingResult[] results =  GeocodingApi.geocode(context, indirizzi.get(100)).await();*/
			
			
			
			
		} catch(Exception e) {
			System.out.println("errore al numero di riga " + numeroriga);
			e.printStackTrace();
		}
			
			
		// progetto finale: usare async
		// Async
		/*req.setCallback(new PendingResult.Callback<GeocodingResult[]>() {
		  @Override
		  public void onResult(GeocodingResult[] result) {
		    // Handle successful request.
		  }

		  @Override
		  public void onFailure(Throwable e) {
		    // Handle error.
		  }
		});*/
		
		
		/*
		System.out.println(results[0].formattedAddress);
		System.out.println(results[0].geometry.location.lat);
		System.out.println(results[0].geometry.location.lng);*/
		
		
		// salvo lat/lng + addressname
		/*
		FileWriter fw = new FileWriter("nomefileout.csv");
		PrintWriter pw = new PrintWriter(fw);
		
		// per ogni key e ogni id della map
		pw.println("id1;lat;lng;address_di_google");
		*/

	}

}
