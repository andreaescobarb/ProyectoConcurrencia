/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Rivera
 */

public class Estructura implements Comparable{
	public String word;
	public int count;	
		
        public void Estructura(){
	
        }

	public void setWord(String o){
		word=o;
	}

	public void setCount(int o){
		count=o;
	}
	
	public String getWord(){
		return word;
	}

	public int getCount(){
		return count;
	}

        @Override
        public int compareTo(Object o) {
            int compareestu=((Estructura)o).count;
            return this.count-compareestu;
        }
        
        @Override
        public String toString(){
            return word+"  "+count;
        }
		
} 

