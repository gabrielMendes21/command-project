/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpp_command;

/**
 *
 * @author FATEC ZONA LESTE
 */

interface Command{
    void execute();
}

class Luz{
    void ligar(){System.out.println("Luz ligada");}
    void desligar(){System.out.println("Luz desligada");}
}

class LigarLuzCommand implements Command{
    private Luz luz;
    LigarLuzCommand(Luz luz){this.luz = luz;}
    public void execute(){luz.ligar();}
}

class DesligarLuzCommand implements Command{
    private Luz luz;
    DesligarLuzCommand(Luz luz){this.luz = luz;}
    public void execute(){luz.desligar();}
}
    
class ControleRemoto{
    private Command comando;
    void setCommand(Command comando){this.comando = comando;}
    void apertarBotao(){comando.execute();}

}

public class MPP_Command {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Luz luz = new Luz();
        Command ligar = new LigarLuzCommand(luz);
        Command desligar = new DesligarLuzCommand(luz);
        
        ControleRemoto controle = new ControleRemoto();
        
        controle.setCommand(ligar);
        controle.apertarBotao();
        
        controle.setCommand(desligar);
        controle.apertarBotao();
    
    }
}