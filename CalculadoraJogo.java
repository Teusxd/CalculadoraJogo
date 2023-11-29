public class CalculadoraJogo {
    public static void main(String[] args){
        calcularSaldoDeVitorias();

    }

    static void calcularSaldoDeVitorias(){
        int vitorias = 35;
        int derrotas = 11;
        int saldoDeVitorias = vitorias - derrotas;
        String niveis;

        switch (saldoDeVitorias) {
            case 0:
                niveis = "Ferro";
            break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                niveis = "Bronze";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                niveis = "Prata";
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                niveis = "Ouro";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                niveis = "Diamante";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                niveis = "Lendário";
                break;
            default:
                niveis = "Imortal";
                break;
        }
        System.out.println("O Herói tem de saldo de " + saldoDeVitorias + "  está no nível de " + niveis);
    }
}