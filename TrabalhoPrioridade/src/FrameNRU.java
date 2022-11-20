import java.util.ArrayList;

public class FrameNRU {

    public static void Main(String args[]) throws InterruptedException{

        TheFrame frames[] = new TheFrame[10];
        
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



        //Declarando variáveis.
        int indiceMelhorReferencia;
        int idMelhorReferencia;
        boolean brMelhorReferencia;
        boolean bmMelhorReferencia;

        int idValorAtual;
        boolean brValorAtual;
        boolean bmValorAtual;


        System.out.println("\n================ARRAY================");
        System.out.println(arrayMyFrames);
        System.out.println("====================================\n");

        System.out.print("\n================ Array de referências ================\n");
            for(int count = 0; count < arrayMyFrames.size(); count++){

                TheFrame parametroMeuObjeto = arrayMyFrames.get(count);

                if(count == 0){
                    
                    System.out.print("{ "+ count +" (BR: " + parametroMeuObjeto.getBm() + ") - (BM: " + parametroMeuObjeto.getBr() + ")");

                }else{

                    System.out.print(", (BR: " + parametroMeuObjeto.getBm() + ") - (BM: " + parametroMeuObjeto.getBr() + ")");

                }

            }
            System.out.print(" }\n");
        System.out.println("====================================\n");





        //Iniciando busca da melhor referência.
        int quantidadeDeFrames = arrayMyFrames.size();

        for(int x = 0; x < quantidadeDeFrames; x++){

            for(int y = 0; y < arrayMyFrames.size(); y++){

                TheFrame parametroMeuObjeto = arrayMyFrames.get(y);

                idValorAtual = parametroMeuObjeto.getIdFrame();
                brValorAtual = parametroMeuObjeto.getBr();
                bmValorAtual = parametroMeuObjeto.getBm();
                
                if(!brValorAtual && !bmValorAtual){

                    indiceMelhorReferencia = y;
                    idMelhorReferencia = parametroMeuObjeto.getIdFrame();
                    brMelhorReferencia = brValorAtual;
                    bmMelhorReferencia = bmValorAtual;

                    System.out.println("-----------------X: "+x+" Y: "+y+"-----------------");
                        System.out.println("A melhor referência é a do frame id: " + idMelhorReferencia);
                        System.out.println("Referência utilizada: (BR: "+brMelhorReferencia+") - (BM: "+bmMelhorReferencia+")");

                        arrayMyFrames.remove(indiceMelhorReferencia);

                        System.out.println("Quantidade de frames restantes: " + arrayMyFrames.size());  
                    System.out.println("-------------------------------------------");


                    System.out.print("Array restante: ");

                    for(int count = 0; count < arrayMyFrames.size(); count++){

                        TheFrame parametroMeuObjetoInterno = arrayMyFrames.get(count);
        
                        if(count == 0){
                            
                            System.out.print("{ (ID: "+ parametroMeuObjetoInterno.getIdFrame() +" | BR: " + parametroMeuObjetoInterno.getBm() + " - BM: " + parametroMeuObjetoInterno.getBr() + ")");
        
                        }else{
        
                            System.out.print(", (ID: "+ parametroMeuObjetoInterno.getIdFrame() +" | BR: " + parametroMeuObjetoInterno.getBm() + " - BM: " + parametroMeuObjetoInterno.getBr() + ")");
        
                        }
        
                    }
                    System.out.print(" }\n");
                    System.out.println("-------------------------------------------\n");

                    break;

                }else if(!brValorAtual || !bmValorAtual){

                    indiceMelhorReferencia = y;
                    idMelhorReferencia = parametroMeuObjeto.getIdFrame();
                    brMelhorReferencia = brValorAtual;
                    bmMelhorReferencia = bmValorAtual;

                    System.out.println("-----------------X: "+x+" Y: "+y+"-----------------");
                        System.out.println("A melhor referência é a do frame id: " + idMelhorReferencia);
                        System.out.println("Referência utilizada: (BR: "+brMelhorReferencia+") - (BM: "+bmMelhorReferencia+")");

                        arrayMyFrames.remove(indiceMelhorReferencia);

                        System.out.println("Quantidade de frames restantes: " + arrayMyFrames.size());  
                    System.out.println("-------------------------------------------");


                    System.out.print("Array restante: ");

                    for(int count = 0; count < arrayMyFrames.size(); count++){

                        TheFrame parametroMeuObjetoInterno = arrayMyFrames.get(count);
        
                        if(count == 0){
                            
                            System.out.print("{ (ID: "+ parametroMeuObjetoInterno.getIdFrame() +" | BR: " + parametroMeuObjetoInterno.getBm() + " - BM: " + parametroMeuObjetoInterno.getBr() + ")");
        
                        }else{
        
                            System.out.print(", (ID: "+ parametroMeuObjetoInterno.getIdFrame() +" | BR: " + parametroMeuObjetoInterno.getBm() + " - BM: " + parametroMeuObjetoInterno.getBr() + ")");
        
                        }
        
                    }
                    System.out.print(" }\n");
                    System.out.println("-------------------------------------------\n");

                    break;


                }else if(x == (quantidadeDeFrames -1 ) && arrayMyFrames.size() == 1){

                    indiceMelhorReferencia = y;
                    idMelhorReferencia = parametroMeuObjeto.getIdFrame();
                    brMelhorReferencia = brValorAtual;
                    bmMelhorReferencia = bmValorAtual;

                    System.out.println("-----------------X: "+x+" Y: "+y+"-----------------");
                        System.out.println("A referência restante possível a ser utilizada é a do frame id: " + idMelhorReferencia);
                        System.out.println("Referência utilizada: (BR: "+brMelhorReferencia+") - (BM: "+bmMelhorReferencia+")");

                        arrayMyFrames.remove(indiceMelhorReferencia);

                        System.out.println("Quantidade de frames restantes: " + arrayMyFrames.size());  
                    System.out.println("-------------------------------------------");


                    System.out.print("Array restante: ");

                    for(int count = 0; count < arrayMyFrames.size(); count++){

                        TheFrame parametroMeuObjetoInterno = arrayMyFrames.get(count);
        
                        if(count == 0){
                            
                            System.out.print("{ (ID: "+ parametroMeuObjetoInterno.getIdFrame() +" | BR: " + parametroMeuObjetoInterno.getBm() + " - BM: " + parametroMeuObjetoInterno.getBr() + ")");
        
                        }else{
        
                            System.out.print(", (ID: "+ parametroMeuObjetoInterno.getIdFrame() +" | BR: " + parametroMeuObjetoInterno.getBm() + " - BM: " + parametroMeuObjetoInterno.getBr() + ")");
        
                        }
        
                    }
                    System.out.print(" }\n");
                    System.out.println("-------------------------------------------\n");                    

                }else{

                    System.out.println("-----------------X: "+x+" Y: "+y+"-----------------");
                        System.out.println("Não foi encontrada uma melhor referência no ID: "+idValorAtual);
                        System.out.println("Quantidade de frames restantes: " + arrayMyFrames.size());  
                    System.out.println("-------------------------------------------\n");

                    System.out.print("Array restante: ");

                    for(int count = 0; count < arrayMyFrames.size(); count++){

                        TheFrame parametroMeuObjetoInterno = arrayMyFrames.get(count);
        
                        if(count == 0){
                            
                            System.out.print("{ (ID: "+ parametroMeuObjetoInterno.getIdFrame() +" | BR: " + parametroMeuObjetoInterno.getBm() + " - BM: " + parametroMeuObjetoInterno.getBr() + ")");
        
                        }else{
        
                            System.out.print(", (ID: "+ parametroMeuObjetoInterno.getIdFrame() +" | BR: " + parametroMeuObjetoInterno.getBm() + " - BM: " + parametroMeuObjetoInterno.getBr() + ")");
        
                        }
        
                    }
                    System.out.print(" }\n");
                    System.out.println("-------------------------------------------\n");

                }

            }
        }

    }
    
}
