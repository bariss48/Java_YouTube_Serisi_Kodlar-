
package overload_constructor;

public class hamburger {
    
    public String sos;
    public boolean susam;
    public String menü;
    public boolean turşu;

    public hamburger(String sos, boolean susam, String menü, boolean turşu) {
        this.sos = sos;
        this.susam = susam;
        this.menü = menü;
        this.turşu = turşu;
    }
    
       public hamburger(String sos, boolean susam, String menü) {
        this.sos = sos;
        this.susam = susam;
        this.menü = menü;
        
    }
    
        public hamburger(String sos, boolean susam) {
        this.sos = sos;
        this.susam = susam;  
    }
    
        public hamburger(String sos) {
        this.sos = sos;
    }
    
        public hamburger(){
            
        }

    @Override
    public String toString() {
      
       return this.sos +"-"+ this.susam +"-"+ this.menü +"-"+ this.turşu; 
        
    }
 
}
