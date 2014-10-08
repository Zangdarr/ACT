
public class Algorithme {
    
   
    public int[] Algo_Q4(int[] ref_list, int[] listA){
	int[] tmp;
	//inversion des indices et des valeur de la ref_list dans tmp 
	for (int i=0; i<ref_list.length; i++){
	    tmp[ref_list[i]] = i;
	}
	//normalisation de la listA
	for(int j=0; j<listA.length;j++){
	    listA[j] = tmp[listA[j]]; 
	}
	return listA;
    }

    public int Algo_Q5_1(int[] y){
	int cpt_inversion = 0;
	for(int i =0; i<y.length-1;i++)
	    for(int j=i+1; j<y.length;j++)
		if(y[i] > y[j])
		    cpt_inversion++;
	
	return cpt_inversion;
    }

    public int Algo_Q6_v1(int[] ref_list, int[] listA){
	return Algo_Q5_1(Algo_Q4(ref_list,listA));
    }

     
}
