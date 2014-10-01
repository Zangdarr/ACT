
public class Algorithme {
    
    /*cet algo est en n², il faut du teta(n)*/
    public String Algo_Q4(int[] ref_list, int[] listA){
	//normalisation de la listA
	for(int i =0;i<ref_list.lenght;i++){
	    for(int j=0; j<listA.lenght;j++){
		if(ref_list[i] = listA[j]){
		    listA[j] = i;
		}
	    }
	}
	//normalisation de la ref_list
	for(int i =0;i<ref_list.lenght;i++){
	    ref_list[i] = i;
	}
    }
}