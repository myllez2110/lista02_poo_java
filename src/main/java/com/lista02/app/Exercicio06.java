package com.lista02.app;
import java.util.Scanner;

public class Exercicio06 {

    public static void resultado(){
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, notar;

        System.out.print("Digite a nota da Prova 1: ");
        nota1 = sc.nextFloat();

        System.out.print("Digite a nota da Prova 2: ");
        nota2 = sc.nextFloat();

        if (((nota1+nota2)/2)>=6) { //if de aprovação direta
            System.out.println("Aluno Aprovado!\n"
                                +"P1="+nota1+"|P2="+nota2+"|PR=XX|Maior Média="+((nota1+nota2)/2));
        }          

        else if (nota1<2 && nota2<2) { // if de reprovação direta
            System.out.println("Aluno Reprovado sem chance de Recuperação!\n"
                                +"P1="+nota1+"|P2="+nota2+"|PR=XX|Maior Média Possível < 6.0");      
        }

        else if (((nota1+nota2)/2)<6 && nota1<nota2){ //if de reprovação na prova 1
            System.out.println("Aluno de recuperação na Prova 1, digite a nota da Prova de\n"
                                +"Recuperação que substituirá a Prova 1: ");
            notar=sc.nextFloat();
            if (notar<=nota1){
                System.out.println("Aluno não obteve nota de Recuperação maior que a Prova 1.\n" 
                                    +"Aluno está Reprovado.\n"
                                    +"P1="+nota1+"|P2="+nota2+"|PR=XX("+notar+")|Maior Média="+((nota1+nota2)/2));
            } 
            else if (((notar+nota2)/2)<6) {
                System.out.println("Aluno não obteve média de recuperação maior que 6.\n" 
                                    +"Aluno está Reprovado.\n"
                                    +"P1=XX("+nota1+")|P2="+nota2+"|PR="+notar+"|Maior Média="+((notar+nota2)/2));

            }
            else if (((notar+nota2)/2)>=6) {
                System.out.println("Aluno Aprovado com a nota de Recuperação!\n"
                                +"P1=XX("+nota1+")|P2="+nota2+"|PR="+notar+"|Maior Média="+((nota2+notar)/2));
            }

        }
        else if (((nota1+nota2)/2)<6 && nota1>nota2){ //if de reprovação na prova 2
            System.out.println("Aluno de recuperação na Prova 2, digite a nota da Prova de\n"
                                +"Recuperação que substituirá a Prova 2: ");
            notar=sc.nextFloat();
            if (notar<=nota2){
                System.out.println("Aluno não obteve nota de Recuperação maior que a Prova 2.\n" 
                                    +"Aluno está Reprovado.\n"
                                    +"P1="+nota1+"|P2="+nota2+"|PR=XX("+notar+")|Maior Média="+((nota1+nota2)/2));
            } 
            else if (((notar+nota1)/2)<6) {
                System.out.println("Aluno não obteve média de recuperação maior que 6.\n" 
                                    +"Aluno está Reprovado.\n"
                                    +"P1="+nota1+"|P2=XX("+nota2+")|PR="+notar+"|Maior Média="+((nota1+notar)/2));

            }
            else if (((notar+nota1)/2)>=6) {
                System.out.println("Aluno Aprovado na Recuperação\n"
                                +"P1="+nota1+"|P2=XX("+nota2+")|PR="+notar+"|Maior Média="+((nota1+notar)/2));
            }

        }
        sc.close();
    }
}

