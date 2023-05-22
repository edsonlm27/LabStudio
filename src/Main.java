import Entidades.Cargo;
import Entidades.Colaborador;
import Entidades.Nivel;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    /*Ex 4 - Fazer inclusão de novo colaborador em lista de Colaboradores
    Faça um método para inclusão de um novo colaborador na lista de colaboradores
*/

    public static void main(String[] args) {

        ArrayList<Cargo> cargos = new ArrayList<>();
        ArrayList<Colaborador> colaboradores = new ArrayList<>();

        cargos.add(new Cargo("Desenvolvedor Front-end Junior", 2500.0, Nivel.JUNIOR));
        cargos.add(new Cargo("Desenvolvedor Front-end Pleno", 4500.0, Nivel.PLENO));
        cargos.add(new Cargo("Desenvolvedor Front-end Senior", 6500.0, Nivel.SENIOR));

        colaboradores.add(new Colaborador("Alberto", new Date(), cargos.get(0)));
        colaboradores.add(new Colaborador("Eduardo", new Date(), cargos.get(1)));
        colaboradores.add(new Colaborador("Gerson", new Date(), cargos.get(2)));

//         Ex 5 - Listar colaboradores ativos (que não possuem data desligamento)

     /*   for ( Colaborador c: colaboradores){
            if (c.getDtDesligamento() == null){
                System.out.println(c);
            }
        }*/

//        Ex 6 - Listar colaboradores por Cargo
                for (Cargo cargo : cargos ) {
                    System.out.println("Lista de colaboradores por cargo: " + cargo.getDescricao());
                    /*for (Colaborador colaborador : colaboradores) {
                        if (colaborador.getCargo() == cargo){
                            System.out.println(colaborador);
                        }
                    }*/
                }

    }
}