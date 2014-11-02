import java.util.*;

public class SearchThreeWordsRev {
	
	static int posit;
	public static void main(String args[]){
		
	    int[] posA = new int[]{1, 18, 30, 44, 58};
	    int[] posB = new int[]{23, 50, 60};
	    int[] posC = new int[]{35, 42, 54, 63}; 
	     
	    String posTag = null;
	    Integer posNum = 0;
	    Integer pastPosNum = 0;
	    Integer PosGap = 0;	    
	    Integer PosGapTotal = 0;
	    Integer posCnt = 0;
	    String lastFlag = null;
	    HashMap m = new HashMap();
	    
	    for(int i=0;i<=posA.length-1;i++){
	    	m.put(posA[i], "A");
	    }

	    for(int i=0;i<=posB.length-1;i++){
	    	m.put(posB[i], "B");
	    }

	    for(int i=0;i<=posC.length-1;i++){
	    	m.put(posC[i], "C");	    
	    }
	    
	    Collection cols = m.keySet();
	    List temps = new ArrayList(cols);
	    Collections.sort(temps);
	    
	    for(int i = 0;i<m.size();i++)
	    {
		    posTag = (String)m.get((Integer)temps.get(i));
		    posNum = (Integer)temps.get(i);
		    if(i>0){
		    	pastPosNum = (Integer)temps.get(i-1);
			    lastFlag = (String)m.get((Integer)temps.get(i-1));
		    }
		    System.out.println("-postTag-"+posTag+"-posNum-"+posNum+"-pastPosNum-"+pastPosNum+"-lastFlag-"+lastFlag);
		    if(i>0 && !lastFlag.equals(posTag))
		    {
		    	PosGap = posNum - pastPosNum;
		    	PosGapTotal = PosGapTotal+PosGap;
		    	System.out.println("==="+PosGapTotal);
		    	//posCnt++;
		    	//if(posCnt == 2){
		    	System.out.println("=1="+lastFlag+"=2="+posTag+"=3="+(String)m.get((Integer)temps.get(i-2)));
			    if(i>1 && !lastFlag.equals((String)m.get((Integer)temps.get(i-2))) && !posTag.equals((String)m.get((Integer)temps.get(i-2))))
			    {	
		    		System.out.println("=3rd="+PosGapTotal);
		    		PosGapTotal = 0;
			    }
		    	//}
		    		
		    }
	    }
	    
	    
	    
	    
	    
/*
	    for(int i=0;i<=posA.length-1;i++){ 
	       for(int j=0;j<=posC.length-1;j++){  
	    	  posit = posA[i] - posC[j];
	          m.put(Math.abs(posit),"A에있는["+posA[i]+"]"+"C에있는["+posC[j]+"]");
	 
	       }
	    } 
	       
	    for(int i=0;i<=posB.length-1;i++){
	       for(int j=0;j<=posC.length-1;j++){
	    	  posit = posB[i] - posC[j];
	          m.put(Math.abs(posit),"B에있는["+posB[i]+"]"+"C에있는["+posC[j]+"]");
	       }
	    }
	 
	    Collection cols = m.keySet();
	    List temps = new ArrayList(cols);
	    Collections.sort(temps);
	    System.out.println((String)m.get((Integer)temps.get(0))+"에 있고 거리는 "+(Integer)temps.get(0)+"이다");
	 */	
	}
}
