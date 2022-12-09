package iphone.produto.usuario;

public class usuario {
    public static void main(String[] args) {

     iphone usarIphone = new iphone();
        System.out.println("-----Iniciando Chamada------");
     usarIphone.ligar();
     usarIphone.atender();
     usarIphone.iniciarCorreioDeVoz();
        System.out.println("-----Chamada Finalizada------");

        System.out.println("-----Iniciando Navegação-------");
     usarIphone.exibirPagina();
     usarIphone.exibirNovaPagina();
     usarIphone.atualizarPagina();
        System.out.println("------Navegação Finalizada-------");

        System.out.println("-------Iniciando Reprodução Musical-----");
     usarIphone.tocarMusica();
     usarIphone.pausarMusica();
     usarIphone.selecionarMusica();
        System.out.println("-------Finalizando Reprodução Musical-----");




    }
}
