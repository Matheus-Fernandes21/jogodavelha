package jogodavelha;
import java.util.Scanner;

public class jogodavelha {
    static String[][] tabuleiro = new String[3][3];
    
    public static boolean verJogada(String simbolo, int x, int y){
       boolean vencedor = false;
       if(tabuleiro[0][0] == (simbolo) && tabuleiro[1][0] == (simbolo) && tabuleiro [2][0] == (simbolo)){
           
           return true;
       }
        else if(tabuleiro[0][1] == (simbolo) && tabuleiro[1][1] == (simbolo) && tabuleiro[2][1] == (simbolo)){
           
           return true;
        }
        else if(tabuleiro[0][2] == (simbolo) && tabuleiro[1][2] == (simbolo) && tabuleiro[2][2] ==(simbolo)){
          
           return true;
       }

        //horizontal
        else if(tabuleiro[0][0] == (simbolo) && tabuleiro[0][1] == (simbolo) && tabuleiro[0][2] == (simbolo)){
       
       return true;
       }
       else if(tabuleiro[1][0] == (simbolo) && tabuleiro[1][1] == (simbolo) && tabuleiro[1][2] == (simbolo)){
      
       return true;
       } 
       else if(tabuleiro[2][0] == (simbolo) && tabuleiro[2][1] == (simbolo) && tabuleiro[2][2] == (simbolo)){
       
       return true;
       }
      
       //diagonal
       else if(tabuleiro[0][0] == (simbolo) && tabuleiro[1][1] == (simbolo) && tabuleiro[2][2] == (simbolo)){
      
       return true;
       }
       else if(tabuleiro[0][2] == (simbolo) && tabuleiro[1][1] == (simbolo) && tabuleiro[2][0] ==(simbolo)){
      
       return true;
       }
      
       
       return vencedor;
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int jogador = 1;
        boolean vencedor = false;
        int jogadas = 0;

       
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = "-";
            }
        }
        System.out.println("- - - ");
        System.out.println("- - - ");
        System.out.println("- - - ");
        while (!vencedor && jogadas < 9) {
            java.util.Scanner vez = new Scanner(System.in);
            System.out.println("jogador"+jogador+"|Linha:");
            x = vez.nextInt();
            while(x<0 || x>2){
                System.out.println("jogador"+jogador+" linha inexitente\n(Linha): ");
                vez = new Scanner(System.in);
                x = vez.nextInt();
            }
            vez = new Scanner(System.in);
            System.out.println("jogador"+jogador+"|Coluna:");
            y = vez.nextInt();
            while(y<0 || y>2){
                System.out.println("jogador"+jogador+" coluna inexistente\n(Coluna): ");
                vez = new Scanner(System.in);
                y = vez.nextInt();
            }
            
            boolean jogada = false;

            if (jogador == 1) {
               
                    if (tabuleiro[x][y]!=("X") && tabuleiro[x][y]!=("Y")) {
                        tabuleiro[x][y] = "X";
                        jogada = true;
                        jogadas++;
                        vencedor = verJogada("X", x, y);
                    } else {
                        System.out.println("\n Posição ja preenchida. \n");
                        jogada = false;
                    }
                {
                  
                }
            } else {
               
                    if (tabuleiro[x][y]!=("X") && tabuleiro[x][y]!=("Y")) {
                        tabuleiro[x][y] = "O";
                        jogada = true;
                        jogadas++;
                        vencedor = verJogada("O", x, y);
                    } else {
                        System.out.println("\nPosição ja preenchida.");
                        jogada = false;
                    }
                    
                
                }
            

            
            if (jogada && !vencedor) {
                if (jogador == 1) {
                    jogador = 2;
                } else {
                    jogador = 1;
                }
            }

            String matriz = "\n";
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz += tabuleiro[i][j] + " ";
                }
                matriz += "\n";
            }
            System.out.println(matriz);
        }
        
        if(vencedor){
            System.out.println("Jogador "+jogador+" ganhou.");
        }else{
            System.out.println("empate.");
        }
        
        
    }

}