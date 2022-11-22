import java.util.ArrayList;

public class FrameFIFO {

    public static void Main(String args[]) throws InterruptedException{

        // Criando objeto.
        TheFrame frames[] = new TheFrame[3];
        
        //Adicionando informação aos atributos e criando os frames. Você pode colocar quantas quiser.
        frames[0] = new TheFrame(1, 10, 20, true, true);
        frames[1] = new TheFrame(2, 1, 12, false, false);
        frames[2] = new TheFrame(3, 2, 21, true, false);
        
        // Mostrando quantidade de objetos.
        System.out.println("\n\nQuantidade de frames: " + frames.length + "\n");        

        //Criando o objeto lista de frames.
        ArrayList<TheFrame> arrayMyFrames = new ArrayList<TheFrame>();

        //Adicionando frames na lista e mostrando a lista criada.
        for(int count = 0; count < frames.length; count++){

            arrayMyFrames.add(frames[count]);

        }

        
        System.out.println("\n========= Iniciando modelo FIFO =========\n");

        for(int count = 1; count <= 3; count++){

            if(count == 3){

                System.out.println(count+".");
                Thread.sleep(1500);

            }else{

                System.out.print(count+", ");
                Thread.sleep(1000);

            }

        }


        //Limpando console
        for(int count = 0; count < 80; count++){

            System.out.println();

        }   

        //Aqui é mostrado o valor que interessa para a priorização do sistema.
        System.out.print("================ Array de referências ================\n");
            for(int count = 0; count < arrayMyFrames.size(); count++){

                TheFrame parametroMeuObjeto = arrayMyFrames.get(count);

                if(count == 0){
                    
                    System.out.print("{ "+ count +" (Index: " + arrayMyFrames.get(count));

                }else{

                    System.out.print(", "+ count +" (Index: " + arrayMyFrames.get(count));

                }

            }
            System.out.println(" }");
        System.out.println("====================================\n");







    }
    
}
