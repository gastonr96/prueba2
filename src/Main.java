public class Main {
    public static void main(String[] args) {


        //if
        int numeroif = 3;
        if (numeroif > 0) {
            System.out.println("el numero es postivo");
        } else if (numeroif < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es igual a 0");
        }


        //ciclo while
        int numeroWhile=0;
        while(numeroWhile<3)
        {
            numeroWhile++;
            System.out.println(numeroWhile);

        }


        //ciclo do-while
        do {
            System.out.println("solo se ejecuta una vez");
        }while(numeroWhile<0);


        //ciclo for
        for(int numeroFor=0; numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }


        //switch case
        String estacion="invierno";
        switch(estacion){
            case "verano":
                System.out.println("es verano");
            case "inverno":
                System.out.println("es invierno");
            case "otoño":
                System.out.println("es otoño");
            case "primavera":
                System.out.println("es primavera");
            default:
                System.out.println("no se reconoce la estacion");
        }

    }
}