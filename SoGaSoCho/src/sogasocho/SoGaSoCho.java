package sogasocho;
import java.util.*;
public class SoGaSoCho {

	public static void main(String[] args) {
		int cho, ga;
		for (cho=1;cho<36;cho++) {
			for (ga=1;ga<36;ga++) {
				if ( (ga+cho==36) && (ga*2+cho*4==100) ){
					System.out.println("Số gà: "+ ga+ "\nSố chó: "+cho);				
				}
			}
		}    	
	}

}
