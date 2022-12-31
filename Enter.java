import java.util.*;

public class Enter {
    
    public static void main(String args[]){

String end; 
String resultrua =""; 
String resultnum =""; 

Scanner tec = new Scanner (System.in); 

System.out.println("Digite um endereço: "); 
end=tec.nextLine(); 

tec.close();

if(end.equals("Miritiba 339")) { 

resultrua = "Miritiba"; 

resultnum = "339"; 

} 

else if (end.equals("Babaçu 500")) { 

resultrua = "Babaçu"; 

resultnum = "500"; 

} 

else if (end.equals("Cambuí 804B")) { 

resultrua = "Cambuí"; 

resultnum = "804B"; 

} 

else if (end.equals("Rio Branco 23")){ 

resultrua = "Rio Branco"; 

resultnum = "23"; 

} 

        else if (end.equals("Quirino dos Santos 23 b")){ 

        	resultrua = "Quirino dos Santos"; 

resultnum = "23 b"; 

} 

        else if (end.equals("4, Rue de la République")){ 

        	resultrua = "Rue de la République"; 

resultnum = "4"; 

        } 

        else if (end.equals("100 Broadway Av")){ 

        	resultrua = "Broadway AV"; 

resultnum = "100"; 

        }  

        else if (end.equals("Calle Sagasta, 26")){ 

        	resultrua = "Calle Sagasta"; 

resultnum = "26"; 

       } 

       else if (end.equals("Calle 44 No 1991")){ 

    	   resultrua = "Calle 44"; 

resultnum = "No 1991"; 

       } 

 

   if(resultnum.equals("")) { 

    System.out.println("Endereço inválido."); 

} 

       else { 

    	System.out.println("Rua: " + resultrua); 

   		System.out.println("Nº: " + resultnum);   

       }	 

    }
}