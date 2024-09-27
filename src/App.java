public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenamiento");

        Metodosdeordenamiento mO = new Metodosdeordenamiento();
        int[] arreglo ={3,4,5,6,};
        int[] arregloOrdenado = mO.sortBySelleccion(arreglo);

        mO.imprimit(arregloOrdenado);
        
    }
}
