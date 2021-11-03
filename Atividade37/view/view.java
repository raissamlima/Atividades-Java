package Atividade37.view;

import Atividade37.controller.baseController;
import Atividade37.model.cadastroPratos;

public class view {
    public static <T> void main(String[] args) {

        cadastroPratos cp = new cadastroPratos();
        cadastroPratos cp2 = new cadastroPratos();
        
        baseController bController = new baseController<T>();

        // cp
        cp.cor = "Branco";
        cp.quantidade = "50 peças";
        cp.tamanho = "médio";
        cp.valor = "300 reais";

        //cp2
        cp2.cor = "Preto";
        cp2.quantidade = "35 peças";
        cp2.tamanho = "grande";
        cp2.valor = "450 reais";

        bController.create(cp);
        bController.create(cp2);
        bController.delete(cp2);

        System.out.println(cp);
        System.out.println(cp2);
        System.out.println(cp2);
    }
}


        