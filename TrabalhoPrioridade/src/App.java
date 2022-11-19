import java.util.ArrayList; 

public class App {

    public static void main(String[] args) throws Exception {
        

        TheFrame frames[] = new TheFrame[3];

        frames[0] = new TheFrame(12, 10, 20, true, true);
        frames[1] = new TheFrame(10, 1, 12, false, false);
        frames[2] = new TheFrame(11, 2, 21, true, false);
        
        System.out.println("Tamanho: " + frames.length + "\n");

       

        /*
        for(int b = 0; b < frames.length; b++){

            //System.out.print("Frame 1: " + "ID: " + frames[b].getIdFrame());
            //System.out.print(" | Quant Referencias: " + frames[b].getQuantReferencias());
            //System.out.print(" | Ultima Referencia: " + frames[b].getUltimaReferencia());
            //System.out.print(" | BR: " + frames[b].getBr());
            //System.out.println(" | BM: " + frames[b].getBm());

        }
        */


        //Criando o objeto lista de frames.
        ArrayList<TheFrame> arrayMyFrames = new ArrayList<TheFrame>();

        //Adicionando frames na lista e mostrando a lista criada.

        for(int count = 0; count < frames.length; count++){

            arrayMyFrames.add(frames[count]);


        }

        System.out.println("Meu array "+ arrayMyFrames);

        



        System.out.println("=================");
        System.out.println("=================");
        System.out.println("=================");



 
        int referenciaMenor = 1000000;
        int valorAnterior = 0;
        int idValorAnterior;
        int valorFinalizado;
        int valorAtual;

        
        int valorMenor;
        int valorMaior;

        int auxiliarIdAnterior;




        for(int x = 0; x < (frames.length - 1); x++){

            System.out.println("X: " + x);

            for(int i = 0; i < frames.length; i++){

                System.out.println("I: " + i);


                valorAtual = frames[i].getQuantReferencias();

                System.out.println("======="+i+"=======");

                System.out.println("Quant Ref atual: " + valorAtual);
                System.out.println("Quant Ref anterior: " + valorAnterior);
                System.out.println("referencia Menor: " + referenciaMenor);


                if(valorAtual < valorAnterior){

                    valorMenor = valorAtual;
                    valorMaior = valorAnterior;


                    if(i == 0){

                        idValorAnterior = 0;

                    }else{

                        auxiliarIdAnterior = i - 1;
                        idValorAnterior = (frames[auxiliarIdAnterior].getIdFrame());

                    }


                    if(referenciaMenor < valorMenor){

                        

                    }else{

                        referenciaMenor = valorAtual; //Atribui a menor quantidade referencia para fazer a configuração.

                    }

                    if(i == (frames.length - 1)){

                        valorFinalizado = frames[i].getIdFrame();

                        System.out.println("Vai remover: " + x);


                        arrayMyFrames.remove((i - 1));
                        System.out.print("ID Removido: " + idValorAnterior);
                        System.out.println(" - Referência:  " + referenciaMenor);
                        System.out.println("Finalizou no ID: " + valorFinalizado);

                        System.out.println(" ");                        
                        System.out.println("====ARRAY====");
                        System.out.println(arrayMyFrames);
                        System.out.println("=============");

                    }

                    valorAnterior = valorAtual; //Atribuindo o valor atual para o anterior.


                }else{

                    valorMenor = valorAnterior; 
                    valorMaior = valorAtual;

                    
                    if(i == 0){

                        idValorAnterior = 0;

                    }else{

                        auxiliarIdAnterior = i - 1;
                        idValorAnterior = (frames[auxiliarIdAnterior].getIdFrame());

                    }

                    


                    if(referenciaMenor < valorMaior){

                        

                    }else{

                        referenciaMenor = valorAtual; //Atribui a menor quantidade referencia para fazer a configuração.

                    }


                    if(i == (frames.length - 1)){

                        valorFinalizado = frames[i].getIdFrame();

                        arrayMyFrames.remove((i - 1));
                        System.out.print("ID Removido: " + idValorAnterior);
                        System.out.println(" - Referência:  " + referenciaMenor);

                        System.out.println("===============");

                        System.out.println("Finalizou no ID: " + valorFinalizado);

                        System.out.println(" ");                        
                        System.out.println("====ARRAY====");
                        System.out.println(arrayMyFrames);
                        System.out.println("=============");
                        

                    }

                    valorAnterior = valorAtual;


                }

            }
    
        }

        

    }

}
