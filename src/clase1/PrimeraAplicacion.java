package clase1;

public class PrimeraAplicacion {

    public static void main(String[] args) {

        PrimeraAplicacion.ejercicio7();
        PrimeraAplicacion.ejercicio6();
        PrimeraAplicacion.ejercicio7();

    }

    public static void ejercicio6() {
        boolean op = ((3 * 4 >= 12) && (3.5f > 1 + 2f)) || (4 < 8f);
        System.out.println("Ejecicio6:" + op);

    }

    public static void ejercicio7() {
        int edad = 63;
        double descuento = 0;
        if (edad < 18) {
            descuento = 0.15;
        } else if (edad > 60) {
            descuento= 0.30;
        } 
        System.out.println("Porcentaje:" + descuento);
    }
    public static void array(){
     int matriz[]=new int[5];
     matriz[0]=122;
      matriz[1]=122;
       matriz[2]=122;
        matriz[3]=122;
        for (int i = 0; i < matriz.length; i++) {
           
        }
     
    
    }

    public static void ejercicioWhile() {
       
    }
    public static void ejercicioIgual(){
    
    String animal1="Perro";
    String animal2="gato";
    boolean resultado=animal1.equals(animal2);
    System.out.println(resultado);
    }
    public static void ejercicioswitch(){
    int diaSemana=5;
    String textoSemana;
    switch(diaSemana){
    case 1:
    textoSemana="Lunes";break;
    }
          
    
    }
    
    public static void ejericicio8(){
        int mes=4;
      int meses[]={30,31,30,31,30,31};
      if(mes<meses.length){
      System.out.println(meses[mes-1]);
       
      }
        
}
   
}
