import java.util.Scanner;

public class Ahorcado {
    
    Scanner scanner=new Scanner(System.in);
    // Declaracion y asignacion de variables
    String palabraSecreta="programacion";
    int intentosMaximos=10;
    int intentos=0;
    char letra;
    boolean palabraAdivinada=false;
    
    // Arreglo 
    char[] letrasAdivinadas=new char[palabraSecreta.length()];
    
    public void giones(){
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i]= '_';
           
        }
             }
        public void CargarValores(){
            while(!palabraAdivinada && intentos < intentosMaximos){
                System.out.println("Palabra a adivinar: "+String.valueOf(letrasAdivinadas)+"("+(palabraSecreta.length())+" letras)");
                System.out.print("Ingresa una letra: ");
                 letra=Character.toLowerCase(scanner.next().charAt(0));
        
                EvaluarLetra();

            }
            if(!palabraAdivinada){
                System.out.println("SE TE TERMINARON LOS INTENTOS ");
              }
           
              scanner.close();
        }
       
        
        public void EvaluarLetra(){
            boolean letraCorrecta= false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
              if(palabraSecreta.charAt(i) == letra){
               letrasAdivinadas[i]=letra;
               letraCorrecta=true; 
              }
                
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("LETRA INCORRECTA TE QUEDAD: "+(intentosMaximos-intentos)+" intentos.");

            }
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada=true;
                System.out.println("FELICIDADES ADIVINASTE LA PALABRA SECRETA "+palabraSecreta);
            }
          
          
            
        }
       
       
    
    
    public static void main(String[] args) throws Exception {
        Ahorcado ahorcado1= new Ahorcado();
        ahorcado1.giones();
        ahorcado1.CargarValores();
        
    }
}
