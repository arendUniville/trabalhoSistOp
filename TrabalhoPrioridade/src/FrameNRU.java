import java.util.ArrayList;

public class FrameNRU {

    public static void Main(String args[]) throws InterruptedException{

        TheFrame frames[] = new TheFrame[10];
        
        //Adicionando informação aos atributos e criando os frames
        frames[0] = new TheFrame(12, 10, 20, true, true);
        frames[1] = new TheFrame(10, 11, 12, false, false);
        frames[2] = new TheFrame(11, 22, 21, true, false);

        
        // Mostrando quantidade de objetos.
        System.out.println("\n\nQuantidade de frames: " + frames.length + "\n");        

        //Criando o objeto lista de frames.
        ArrayList<TheFrame> arrayMyFrames = new ArrayList<TheFrame>();

        //Adicionando frames na lista e mostrando a lista criada.
        for(int count = 0; count < frames.length; count++){

            arrayMyFrames.add(frames[count]);

        }

        
        System.out.println("\n========= Iniciando modelo LFU =========\n");

        for(int count = 1; count <= 3; count++){

            if(count == 3){

                System.out.println(count+".");
                Thread.sleep(2200);

            }else{

                System.out.print(count+", ");
                Thread.sleep(1000);

            }

        }


        //Limpando console
        for(int count = 0; count < 80; count++){

            System.out.println();

        }  

    }
    
}
