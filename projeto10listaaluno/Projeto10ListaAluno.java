/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto10listaaluno;

import java.util.ArrayList;

/**
 *
 * 
 * @author aluno
 */
public class Projeto10ListaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instanciar 10 objetos da classe aluno usando o construtor cheio
        
        Aluno aluno01 = new Aluno(111,"JOAO", "1111-1111");
        Aluno aluno02 = new Aluno(222,"ANA", "2222-2222");
        Aluno aluno03 = new Aluno(333,"MARIA", "3333-3333");
        Aluno aluno04 = new Aluno(444,"JOSE", "4444-4444");
        Aluno aluno05 = new Aluno(555,"ANTONIO", "5555-5555");
        Aluno aluno06 = new Aluno(666,"JOAQUIM", "6666-6666");
        Aluno aluno07 = new Aluno(777,"ROSA", "7777-7777");
        Aluno aluno08 = new Aluno(888,"SILVA", "8888-8888");
        Aluno aluno09 = new Aluno(999,"FRANCISCO", "9999-9999");
        Aluno aluno10 = new Aluno(100,"MARCIO", "1010-1010");
        
        //OBJETO'listaAlunos' pertence a Classe ArrayList
        //Instanciando uma lista vazia que só recebera objetos
        //da classe aluno
        //classe tipada arrayList<T>
        
        ArrayList<Aluno> listAluno = new ArrayList<Aluno>();
        //tipo             //nome 
        
        // adicionando 10 objetos da classse aluno
        //na lista instanciada usando método Add()
        
        listAluno.add(aluno01);
        listAluno.add(aluno02);
        listAluno.add(aluno03);
        listAluno.add(aluno04);
        listAluno.add(aluno05);
        listAluno.add(aluno06);
        listAluno.add(aluno07);
        listAluno.add(aluno08);
        listAluno.add(aluno09);
        listAluno.add(aluno10);
        //listAluno.add(aluno11); erro - lista tipada
        //não aceita string
        
        // instanciar 5 objetos da classe aluno
        // e adicionar na lista aluno
        // usando um laço FOR
        // get(index) retornar um elemento da posição index
       
       // for( int j = 11; j <= 15; j++){
          //  Aluno objAluno = new Aluno(j,"Aluno"+j, "9999-"+j+j);
          //  listAluno.add (objAluno);
           
             for( int j = 11; j <= 15; j++){
                  Aluno objAluno1 = new Aluno();
            objAluno1.setIdAluno(j);                // tem situação q deve colocar
            objAluno1.setNome("Novo-Aluno"+j);          // dentro
            objAluno1.setCelular("XXXX -"+j+j);
            listAluno.add(objAluno1);
            
            //nessa caso ai emcima não posso declarar fora do laço
            
        }
        //Leitura de objetos adicionados dentro da lista
        //usando for
        // o metodo size retorna o tamanho da lista
        
      /* for ( int i =0; i < listAluno.size(); i++){
       System.out.println("Aluno"+listAluno.get(i).getIdAluno()+
               " - "+ listAluno.get(i).getNome()+" - "+listAluno.get(i).getCelular());
            
        }*/
      //nessa caso abaixo devo declara fora
      Aluno objAluno = new Aluno();
      
        for ( int i =0; i < listAluno.size(); i++){
            
               objAluno = listAluno.get(i);
               //aluno id 999
            if(objAluno.getIdAluno() == 999){
                System.out.println("encontrei o "+objAluno.getNome());
            }
        System.out.println("Aluno"+
                      objAluno.getIdAluno()+" - "+ 
                      objAluno.getNome()+" - "+
                      objAluno.getCelular());
       
    }
    // imprimir o aluno 999
     
    }
    
    

