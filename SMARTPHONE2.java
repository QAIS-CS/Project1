
package qais.pkg2;

public class SMARTPHONE2 {
    String BRAND;
    int storage;

    @Override
    public String toString() {
        return "SMARTPHONE2{" + "BRAND=" + BRAND + ", storage=" + storage + '}';
    }

    public String getBRAND(){
        return BRAND;
    }

    public void setBRAND(String BRAND) {
       if(BRAND!=null){
       }
        this.BRAND = BRAND;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        int Storage = 0;
        if(32<=Storage && Storage<=1024){
            
        }
        else{System.out.println("invalid number");
                
                }
        this.storage = storage;
    }

    public SMARTPHONE2(String BRAND, int storage) {
        this.BRAND = BRAND;
        this.storage = storage;
    }

    public SMARTPHONE2() {
    }
    
    public double GetBRANDcost(){
       double cost =0;
        switch(BRAND){
             case"Apple":cost=1000;break;
             case"samsung":cost=800;break;
             case"Generic":cost=500;break;
       }
          return cost;
    }
    public double GetStoragecost(){
       int cost = 0;
        int Storage =0;
        if(Storage<=32 && Storage>=128)
            cost=Storage*4;
         if(Storage<=129 && Storage>=512)
            cost=Storage*3;
          if(Storage<=513 && Storage>=1024)
            cost=Storage*2;
          else 
              System.out.println("invalid number");
        
        
        
        
        return cost;
    }
        public double GetTotalcost(){
          double TotalCost =GetBRANDcost()+GetStoragecost();
            return TotalCost;
        }
            public void UpgradeStorage(int x){
                int total = 0;
                
                if(total>32||total<1024) {
        } else { System.out.println("invalid number");           }
}
} 


