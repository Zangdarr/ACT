import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class main {


    public static void main(String[] args){
	TP2_Algorithme algo = new TP2_Algorithme();
	int taille_liste;
       BufferedReader in;
       String text = "";
	try {
		in = new BufferedReader(new FileReader(args[0]));
		text = in.readLine();
		taille_liste = Integer.parseInt(text.trim());
	
		text = in.readLine();
		String [] ref_list = text.split(" ");
		
		text = in.readLine();
		String [] list = text.split(" ");
	
		int[] listA = new int[list.length];
		int[] listB = new int[list.length];
		int[] ref_listC = new int[ref_list.length];

		for(int i = 0; i<ref_list.length; i++){
		    ref_listC[i] = Integer.parseInt(ref_list[i]);
		    listA[i] = Integer.parseInt(list[i]);
		    listB[i] = listA[i];
		}
		in.close();
		System.out.println("Algo O(n²) : " + algo.Algo_Q6_1(ref_listC, listA));
		System.out.println("Algo O(nlogn) : " + algo.Algo_Q6_2(ref_listC, listB));
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	       
       
       
    }
}