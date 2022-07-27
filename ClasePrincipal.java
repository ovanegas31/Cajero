package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        ClasePadre_Abstracta trans = new ClaseHija_Consulta();
        
        trans.setSaldo(10000);
        trans.Operaciones();
  
    }
}
