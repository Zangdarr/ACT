public class TP2_Algorithme {
    
    long inversion = 0;
   
    public int[] Algo_Q4(int[] ref_list, int[] listA){
	int[] tmp = new int[ref_list.length];
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
    
    //SANS TRI FUSION
    public long Algo_Q5_1(int[] y){
        long cpt_inversion = 0;
	for(int i =0; i<y.length-1;i++)
	    for(int j=i+1; j<y.length;j++)
		if(y[i] > y[j])
		    cpt_inversion++;
	
	return cpt_inversion;
	
    }
    
    
    
    public long Algo_Q6_1(int[] ref_list, int[] listA){
	return Algo_Q5_1(Algo_Q4(ref_list,listA));
	
    }
    
    
    public long Algo_Q6_2(int[] ref_list, int[] listA){
	return Algo_Q5_2(Algo_Q4(ref_list,listA));
	
    }
    
    
    
    //AVEC TRI FUSION
    public long Algo_Q5_2(int tableau[])
    {
	int longueur=tableau.length;
	if (longueur>0)
	    {
		return triFusion(tableau,0,longueur-1);
	    }
	return -1;
    }
    
    
    
    
    private long triFusion(int tableau[],int deb,int fin)
    {
	if (deb!=fin)
	    {
		int milieu=(fin+deb)/2;
		triFusion(tableau,deb,milieu);
		triFusion(tableau,milieu+1,fin);
		return inversionCounter(tableau,deb,milieu,fin);
            }
	return -1;
    }
    



    //fin1 correspond à la fin du premier des deux tableau qui seront fusionnes
    private long inversionCounter(int tableau[],int deb1,int fin1,int fin2)
    {
	int deb2=fin1+1;
	
	//on recopie les éléments du début du tableau
	int table1[]=new int[fin1-deb1+1];
	for(int i=deb1;i<=fin1;i++)
	    {
		table1[i-deb1]=tableau[i];
	    }
	
	int compt1=deb1;
	int compt2=deb2;
	
	for(int i=deb1;i<=fin2;i++)
	    {        
		if (compt1==deb2) //c'est que tous les éléments du premier tableau ont été utilisés
		    {
			break; //tous les éléments ont donc été classés
		    }
		else if (compt2==(fin2+1)) //c'est que tous les éléments du second tableau ont été utilisés
		    {
			tableau[i]=table1[compt1-deb1]; //on ajoute les éléments restants du premier tableau
			compt1++;
		    }
		else if (table1[compt1-deb1]<tableau[compt2])
		    {
			tableau[i]=table1[compt1-deb1]; //on ajoute un élément du premier tableau
			compt1++;
		    }
		else
		    {
			tableau[i]=tableau[compt2]; //on ajoute un élément du second tableau
			compt2++;
			//dans le cas ou une valeur du tableau 2 est plus petite que la valeur courante du tableau 1,
			//alors toutes les valeurs non triees du tableau 1 sont inversees par rapport a cette valeur du tableau 2
			inversion+= fin1 - compt1 + 1;
		    }
	    }
	return inversion;
    }
}
