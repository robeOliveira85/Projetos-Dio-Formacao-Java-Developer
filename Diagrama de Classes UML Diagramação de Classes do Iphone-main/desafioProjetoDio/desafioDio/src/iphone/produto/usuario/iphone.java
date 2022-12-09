package iphone.produto.usuario;
import novoIphone.navegadorInternet;
import novoIphone.aparelhoTelefonico;
import novoIphone.reprodutorMusical;

public class iphone implements aparelhoTelefonico, navegadorInternet , reprodutorMusical
{


                public void ligar()
                {
                        System.out.println("Fazendo chamada pelo Iphone");
                }


                public void atender()
                {
                        System.out.println("Atendendo chamada pelo Iphone");
                }


                public void iniciarCorreioDeVoz()
                {
                        System.out.println("Correio de Voz Iniciado");
                }

                @Override
                public void exibirPagina()
                {
                        System.out.println("Exibindo Página Web");
                }

                @Override
                public void atualizarPagina()
                {
                        System.out.println("Atualizando Página Web");
                }

                @Override
                public void exibirNovaPagina()
                {
                        System.out.println("Exibindo nova Página Web");
                }

                @Override
                public void tocarMusica() {
                    System.out.println("Tocando Musica");

                }

                @Override
                public void pausarMusica() {
                    System.out.println("Música Pausada");
                }

                @Override
                public void selecionarMusica() {
                    System.out.println("Selecionando Música");
                }
}
