import java.util.ArrayList; 

public class App {

    public static void main(String[] args) throws Exception {

        int referenciaMenor = 1000000; // Serve para armazenar o menor valor de uma lista, ele é iniciado com um valor alto para que o primeiro valor encontrado já seja atribuído a esta variável.
        int valorAnterior = 0;
        int idValorAnterior = 0;
        int indiceValorMenor = 0;
        int valorAtual; 

        
        int valorMenor; // A fim de facilitar a compreensão do código no momento das comparações de valores foi criado essa variável para armazenar o valor menor.
        int valorMaior; // A fim de facilitar a compreensão do código no momento das comparações de valores foi criado essa variável para armazenar o valor maior.

        int auxiliarIdAnterior; //Serve para auxiliar a busca do Id anterior, como está sendo feito de forma dinâmica onde o contador irá trazer o índice do list, essa variável serve para pegar o índice anterior.
        


        // Criando objeto.
        TheFrame frames[] = new TheFrame[3];

        //Adicionando informação aos atributos e criando os frames
        frames[0] = new TheFrame(12, 10, 20, true, true);
        frames[1] = new TheFrame(10, 1, 12, false, false);
        frames[2] = new TheFrame(11, 2, 21, true, false);
        
        // Mostrando quantidade de objetos.
        System.out.println("\n\nQuantidade de frames: " + frames.length + "\n");

       

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

        System.out.println("\n=========INICIANDO=========\n");

        System.out.println("\n================ARRAY 0================");
        System.out.println(arrayMyFrames);
        System.out.println("====================================\n");



 
        



        //Voltas na lista de frames até que reste apenas 1 frames.
        for(int x = 0; x < arrayMyFrames.size(); x++){

            referenciaMenor = 1000000;
            idValorAnterior = 0;
            valorAnterior = 0;
            indiceValorMenor = 0;

            //Volta na lista de frames para fazer todas as comparações.
            for(int i = 0; i < arrayMyFrames.size(); i++){

                TheFrame theValorAtual = arrayMyFrames.get(i);

                valorAtual = theValorAtual.getQuantReferencias();



                //Verifica se valor atual é menor que o anterior para armazenar o menor valor para a remoção quando chegar ao fim da lista.
                if(valorAtual < valorAnterior){

                    valorMenor = valorAtual;
                    valorMaior = valorAnterior;

                    //Verifica se é a primeira volta para que o ID do valor anterior seja zerado, se não atribuirá o ID do valor anterior da lista.
                    if(i == 0){

                        idValorAnterior = 0;

                    }else{

                        auxiliarIdAnterior = i - 1;
                        idValorAnterior = (frames[auxiliarIdAnterior].getIdFrame());

                    }

                    //Verifica se a referencia menor encontrada é menor que o valor menor comparado anteriormente.
                    if(referenciaMenor < valorMenor){

                        

                    }else{

                        indiceValorMenor = i;
                        referenciaMenor = valorAtual; //Atribui a menor quantidade referencia para fazer a configuração.

                    }
/* 
                    System.out.println("======="+i+"=======");

                    System.out.print("Quant Ref atual: " + valorAtual);
                    System.out.print(" - Quant Ref anterior: " + valorAnterior);
                    System.out.println(" - Referencia Menor: " + referenciaMenor + "\n");
*/


                    //Verifica se é a última volta no list para remover e mostrar o valor que será removido.
                    if(i == (arrayMyFrames.size() - 1)){

                        arrayMyFrames.remove(indiceValorMenor);

                        System.out.println("\n================ARRAY "+i+"================");
                        System.out.println(arrayMyFrames);
                        System.out.println("====================================\n");
                        System.out.println("Quantidade de frames: " + arrayMyFrames.size() + "\n");
/*
                        System.out.println("------------------------------");
                        System.out.print("\nID Removido: " + idValorAnterior);
                        System.out.println(" - Referência:  " + referenciaMenor);
                        System.out.println("------------------------------");
                                                
                        System.out.println("\n================ARRAY================");
                        System.out.println(arrayMyFrames);
                        System.out.println("====================================\n");
*/
                    }


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

                        indiceValorMenor = i;
                        referenciaMenor = valorAtual; //Atribui a menor quantidade referencia para fazer a configuração.

                    }
/* 
                    System.out.println("======="+i+"=======");

                    System.out.print("Quant Ref atual: " + valorAtual);
                    System.out.print(" - Quant Ref anterior: " + valorAnterior);
                    System.out.println(" - Referencia Menor: " + referenciaMenor + "\n");
*/

                    if(i == (arrayMyFrames.size() - 1)){

                        arrayMyFrames.remove(indiceValorMenor);

                        System.out.println("\n================ARRAY "+i+"================");
                        System.out.println(arrayMyFrames);
                        System.out.println("====================================\n");
                        System.out.println("Quantidade de frames: " + arrayMyFrames.size() + "\n");
/*
                        System.out.println("------------------------------");
                        System.out.print("ID Removido: " + idValorAnterior);
                        System.out.println(" - Referência:  " + referenciaMenor);
                        System.out.println("------------------------------");
                
                        System.out.println("\n================ARRAY================");
                        System.out.println(arrayMyFrames);
                        System.out.println("====================================\n");
*/                     

                    }

                    

                }

                valorAnterior = valorAtual;

            }
    
            
        }

    }

}
