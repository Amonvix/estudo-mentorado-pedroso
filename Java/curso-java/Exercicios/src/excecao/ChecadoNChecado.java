package excecao;

public class ChecadoNChecado {   

    public static void main(String[] args) {
     
        try {
            geraErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());            
        }

        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nFIM");
        
        
    }

        // Não checada
    static void geraErro1(){
        throw new RuntimeException("\nGerou um erro da HORA!");
    }
        // Checada precisa ter declaração de trows ou um try/catch
    static void geraErro2() throws Exception{
        throw new Exception("Gerou um erro da HORA!2");
        
        }
    }
         


