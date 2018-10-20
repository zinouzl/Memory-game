package ExiaGame;


import java.util.ArrayList;
import java.util.List;



public class Tesst {

	
	 static List<Integer> ls = new ArrayList<Integer>() ;
	static  List<Integer> cl = new ArrayList<Integer>() ;
	static int best;
	static int indexbest;
	static List<Integer> lb=new ArrayList<Integer>();
	static List<Integer> cb = new ArrayList<Integer>();
	
       	
	 static void next_move(int posr, int posc, String[] board){
	        //add logic here
		ls.clear();
		cl.clear();
		lb.clear();
		cb.clear();
		 all_d_spaces(board);
		 indexbest = best_move(posr, posc);
		 if(lb.get(indexbest)==0&&cb.get(indexbest)==0){
			 System.out.println("CLEAN");
		 }else {
			 if(lb.get(indexbest)<0){
				 System.out.print("RIGHT");
			 }
			 if(lb.get(indexbest)>0){
				 System.out.print("LEFT");
			 }
			 if(cb.get(indexbest)<0){
				 System.out.print("DOWN");
			 }
			 if(cb.get(indexbest)>0){
				 System.out.print("UP");
			 }
				 
		 
		 }
		 
	    }
	 static void all_d_spaces(String[] board){
		 int j=0;
		
		 for(String arf : board){
			 j=0;
	            for(int i=0;i<5;i++){
	                if(arf.charAt(i) =='d'){
	                	ls.add(j);
	                	cl.add(i);
	                }
	                    
	            }
	        j++;}
	 }
	 static int best_move(int posr,int posc){
		 int b =-100;
		 int j=1;
		 for(int i=0;i<25;i++){
			 if(lb.size()>i){
			 lb.add(posr-ls.get(i));
			 cb.add(posr-cl.get(i));
		if(b==-100){
			best=Math.abs(lb.get(i))+Math.abs(cb.get(i));
			//j=1;
		}else
		
		if(Math.abs(lb.get(i))+Math.abs(cb.get(i))<best){
			best = Math.abs(lb.get(i))+Math.abs(cb.get(i));
			j = i;
		}
			
		
		 
		 
	 }}
		 return j;
				 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
