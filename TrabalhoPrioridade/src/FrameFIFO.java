import java.util.ArrayList;

public class FrameFIFO {

    public static void Main(String args[]) throws InterruptedException{

        // Criando objeto.
        TheFrame frames[] = new TheFrame[3];
        
        //Adicionando informação aos atributos e criando os frames
        frames[0] = new TheFrame(0, 10, 20, true, true);
        frames[1] = new TheFrame(1, 11, 12, false, false);
        frames[2] = new TheFrame(2, 22, 22, true, false);
        frames[3] = new TheFrame(3, 33, 18, true, false);
        frames[4] = new TheFrame(4, 47, 36, false, false);
        frames[5] = new TheFrame(5, 18, 65, true, false);
        frames[6] = new TheFrame(6, 36, 35, true, true);
        frames[7] = new TheFrame(7, 8, 2, true, true);
        frames[8] = new TheFrame(8, 45, 8, false, false);
        frames[9] = new TheFrame(9, 2, 10, true, false);
        
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
