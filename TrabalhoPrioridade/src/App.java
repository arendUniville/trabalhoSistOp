import java.util.ArrayList; 

public class App {

    public static void main(String[] args) throws Exception {
        

        TheFrame frames[] = new TheFrame[3];

        frames[0] = new TheFrame(12, 10, 20, true, true);
        frames[1] = new TheFrame(10, 1, 12, false, false);
        frames[2] = new TheFrame(11, 2, 21, true, false);


        

        ArrayList<Integer> arrayIdFrame = new ArrayList<Integer>();

        int id_frame1 = frames[0].getIdFrame();
        int id_frame2 = frames[1].getIdFrame();
        int id_frame3 = frames[2].getIdFrame();

        arrayIdFrame.add(id_frame1);
        arrayIdFrame.add(id_frame2);
        arrayIdFrame.add(id_frame3);



        ArrayList<Integer> arrayQuantReferencias = new ArrayList<Integer>();

        int quantReferencia_frame1 = frames[0].getQuantReferencias();
        int quantReferencia_frame2 = frames[1].getQuantReferencias();
        int quantReferencia_frame3 = frames[2].getQuantReferencias();

        arrayQuantReferencias.add(quantReferencia_frame1);
        arrayQuantReferencias.add(quantReferencia_frame2);
        arrayQuantReferencias.add(quantReferencia_frame3);
        

        //System.out.println(arrayQuantReferencias.size());

        
        int referenciaMenor = 1000000;
        int valorAnterior = 0;
        int idValorAnterior;

        
        int valorMenor;
        int valorMaior;


            for(int i = 0; i < arrayQuantReferencias.size(); i++){

                int valorAtual = arrayQuantReferencias.get(i);

                /*System.out.println("======="+i+"=======");

                System.out.println("Valor atual: " + valorAtual);
                System.out.println("Valor anterior: " + valorAnterior);
                System.out.println("referencia Menor: " + referenciaMenor);*/


                if(valorAtual < valorAnterior){

                    valorMenor = valorAtual;
                    valorMaior = valorAnterior;

                    valorAnterior = valorAtual; //Atribuindo o valor atual para o anterior.

                    if(i == 0){

                        idValorAnterior = 0;

                    }else{

                        idValorAnterior = (arrayIdFrame.get(i));

                    }


                    if(referenciaMenor < valorMenor){

                        

                    }else{

                        referenciaMenor = valorAtual; //Atribui a menor quantidade referencia para fazer a configuração.

                    }

                    if(i == (arrayQuantReferencias.size() - 1)){

                        arrayQuantReferencias.remove(idValorAnterior);
                        System.out.print("ID Removido: " + idValorAnterior);
                        System.out.println(" - Referência:  " + referenciaMenor);

                        System.out.println("====ARRAY====");
                        System.out.println(arrayQuantReferencias);
                        System.out.println("=============");
                    }

                }else{

                    valorMenor = valorAnterior; 
                    valorMaior = valorAtual;

                    valorAnterior = valorAtual;
                    
                    if(i == 0){

                        idValorAnterior = 0;

                    }else{

                        idValorAnterior = (arrayIdFrame.get(i) - 1);

                    }

                    


                    if(referenciaMenor < valorMaior){

                        

                    }else{

                        referenciaMenor = valorAtual; //Atribui a menor quantidade referencia para fazer a configuração.

                    }


                    if(i == (arrayQuantReferencias.size() - 1)){

                        arrayQuantReferencias.remove(idValorAnterior);
                        System.out.print("ID Removido: " + idValorAnterior);
                        System.out.println(" - Referência:  " + referenciaMenor);

                        System.out.println("====ARRAY====");
                        System.out.println(arrayQuantReferencias);
                        System.out.println("=============");

                    }

                }

                //System.out.println("Frame " + i + ": " + arrayQuantReferencias.get(i));

            }

        

        //System.out.println("Frame 1: " + frame1);
        //System.out.println("Frame 2: " + frame2);
        //System.out.println("Frame 3: " + frame3);

    }
}
