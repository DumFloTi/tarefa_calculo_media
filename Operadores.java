/**
 * Aqui têm a forma de somar e depois média da soma, para ter a nota final
 */

public class Operadores {
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;
    
    //Método Get/Set, receber as notas/valores e juntar ao respetivo objeto
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    //Somar todas a notas e dividir por 4
    public double calcularMedia(){
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
    
    //Mensagem de Apoio, caso a média seja 0
    public void mensagemMediaZero() {
        double media = calcularMedia();
        if (media == 0) {
            System.out.println("Eita, proxima vez, é só estudar!");
        }
    }

    //Mensagem de Apoio, caso a média seja menor que 10
    public void mensagemMediaMenorQueDez() {
        double media = calcularMedia();
        if (media < 10) {
            System.out.println("Quase, não desistas, desta vez foi perto, proxima vez, chegas lá!");
        }
    }

    //Mensagem de Felicitação, caso a média seja igual a 10
    public void mensagemMediaIgualDez() {
        double media = calcularMedia();
        if (media == 10) {
            System.out.println("Boa!");
        }
    }

    //Mensagem de Felicitação, caso a média seja maior que 10, mas menor que 20
    public void mensagemMediaMaiorQueDez() {
        double media = calcularMedia();
        if (media > 10 && media < 20) {
            System.out.println("Assim é que é, toca a festejar!");
        }
    }

    //Mensagem de Felicitação, caso a média seja igual a 20
    public void mensagemMediaIgualVinte() {
        double media = calcularMedia();
        if (media == 20) {
            System.out.println("Opa, temos um genio entre nos!");
        }
    }
}
