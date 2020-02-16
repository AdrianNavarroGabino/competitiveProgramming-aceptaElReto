// Adrián Navarro Gabino

import java.util.*;

public class Challenge0536
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            int count = sc.nextInt();
            sc.nextLine();
            Huerto max = new Huerto(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextLine());

            Huerto aux;
            for (int i = 1 ; i < count ; i++){
                aux = new Huerto(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextLine());
                if (max.compareTo(aux) > 0)
                    max = aux;
            }
            
            System.out.printf("%s\n", max.nombre.trim());
        }
    }
}

class Huerto implements Comparable
{
    int tamano;
    int abano;
    int agua;
    int distancia;
    String nombre;

    public Huerto(int tamano, int abano, int agua, int distancia, String nombre) {
        this.tamano = tamano;
        this.abano = abano;
        this.agua = agua;
        this.distancia = distancia;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Object o) {
        Huerto aux = (Huerto)o;

        if(aux.tamano > tamano)
            return 1;
        else if( aux.tamano < tamano)
            return -1;
        if(aux.agua > agua)
            return  -1;
        else if( aux.agua < agua)
            return 1;

        if(aux.distancia > distancia)
            return  -1;
        else if( aux.distancia < distancia)
            return 1;
        if(aux.abano < abano)
            return  1;
        else if( aux.abano > abano)
            return -1;

        return 0;
    }
}
