package testes;
public class lotofacil {
    
    public static void main(String[] args) { 

         int ii=2711;

        // Jogos apostados!
        int [] aposta1 = {1,3,4,5,7,10,11,12,13,17,18,19,21,23,25};
        int [] aposta2 = {1,2,3,6,7,8,9,14,15,16,18,20,22,23,24};

        // Resultado coletado do site na internet
        int []  j01 = {01,03,04,8,11,12,15,16,18,19,20,22,23,24,25};
        int []  j02 = {02,03,8,11,12,13,16,17,18,19,20,22,23,24,25};
        int []  j03 = {02,03,05,06,07,8,9,12,15,18,19,20,21,22,24};
        int []  j04 = {02,03,05,06,8,9,11,13,16,17,18,21,23,24,25};
        int []  j05 = {02,04,06,07,11,12,13,14,15,17,18,19,22,23,25};
        int []  j06 = {01,04,06,8,9,10,13,14,15,17,18,19,20,21,24};
        int []  j07 = {02,03,04,05,9,10,11,14,15,16,17,20,21,22,24};        
        int []  j08 = {01,02,03,04,06,07,8,12,15,19,20,21,22,23,25};        
        int []  j09 = {01,04,05,06,8,10,11,13,14,15,17,19,22,23,24};        
        int []  j10 = {01,04,05,06,07,8,9,11,13,15,17,19,21,22,23};        
        int []  j11 = {01,03,05,8,10,11,12,13,14,16,18,19,20,21,25};        
        int []  j12 = {01,02,03,04,05,06,8,12,18,20,21,22,23,24,25};
        

        System.out.println("********************");
        System.out.println("VALORES DO JOGO A!!!");
        System.out.println("********************");

        
        System.out.print(calculo(aposta1, j01));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j02));
        System.out.println(ii++);
        System.out.print(calculo(aposta1, j03));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j04));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j05));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j06));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j07));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j08));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j09));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j10));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j11));
        System.out.println(ii++);
        System.out.print(calculo(aposta1, j12));
        System.out.println(ii++);


        
        System.out.println("********************");
        System.out.println("VALORES DO JOGO B!!!");
        System.out.println("********************");

        ii = 2711;
        System.out.print(calculo(aposta2, j01));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j02));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j03));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j04));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j05));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j06));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j07));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j08));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j09));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j10));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j11));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j12));  
        System.out.println(ii++);   
        }

    public static String calculo(int[] aposta1, int[] j01){        
        Boolean win = false;
        String mensagem1 = ""; 
        String mensagem2 = ""; 
        int i = 0;
        for(int j: aposta1){
            for (int r : j01){
                if (j == r) {                  
                    i++;
                    if ( i == 15){ 
                        win = true;}
                        else win = false; 
                    }
                }
            }
            if (win == true){
                mensagem1 = "\nForam" + i + " acertos no jogo ********ACERTOU OS 15 !!!?********\n";
                
                return mensagem1 ;
            }
            else {
                mensagem2 = "Foram " + i + " acertos no jogo " ;
                return mensagem2;
        }
    } 
}