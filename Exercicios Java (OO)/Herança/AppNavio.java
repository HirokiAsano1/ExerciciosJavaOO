package Exercio_Heranca;

import java.util.List;
import java.util.ArrayList;

public class AppNavio {

	public static void main(String[] args) {
		
		List<navioGraneleiro>naviosG = new ArrayList();
		
		
		naviosG.add(new navioGraneleiro(10,"Estrela do Mar",4,50000,4));
		naviosG.add(new navioGraneleiro(25,"Cruzeiro do Sul",3,80000,6));
		
		
		List< NavioContainer>naviosC = new ArrayList();
		
		naviosC.add(new NavioContainer(33,"Bela Fera",2,100000,100000,30));
		naviosC.add(new NavioContainer(48,"Arrecifes",2,120000,2,30));
		naviosC.add(new NavioContainer(52,"Águas Belas",1,90000,0,25));
	}

}