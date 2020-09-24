package fes.aragon.inicio;

public class For {

    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10 && j <= 8; i++, j += 2) { //Podemos tener varios controladores, se recomienda tener solo 3 no mas 
            System.out.println(i + " " + j);
        }
    }
}
// && and se tienen que cumplir ambas, || OR se tiene que cumplir alguna
